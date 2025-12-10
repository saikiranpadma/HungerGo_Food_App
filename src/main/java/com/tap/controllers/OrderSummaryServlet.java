package com.tap.controllers;

import com.tap.dao.OrderDAO;
import com.tap.dao_implementation.OrderDAOImpl;
import com.tap.models.Order;
import com.tap.models.OrderItem;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/orderSummary")
public class OrderSummaryServlet extends HttpServlet {

    private final OrderDAO orderDAO = new OrderDAOImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        Integer userId = (Integer) req.getSession().getAttribute("userId");
        if (userId == null) {
            resp.sendRedirect("login.jsp");
            return;
        }

        String orderIdParam = req.getParameter("orderId");
        if (orderIdParam == null) {
            resp.sendRedirect("orders");
            return;
        }

        int orderId = Integer.parseInt(orderIdParam);

        Order order = orderDAO.getOrderById(orderId);
        List<OrderItem> items = orderDAO.getOrderItems(orderId);

        req.setAttribute("order", order);
        req.setAttribute("items", items);

        req.getRequestDispatcher("/WEB-INF/jsp/customer/order_summary.jsp")
                .forward(req, resp);
    }
}