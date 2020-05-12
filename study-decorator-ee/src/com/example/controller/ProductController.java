package com.example.controller;

import com.example.domain.Product;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/products")
public class ProductController extends HttpServlet {
    @Inject
    private Instance<Product> products;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double totalPrice = 0.;
        resp.getWriter().append("<html><body><ul>");
        for (Product product : products) {
            resp.getWriter().append("<li>")
                    .append(product.name())
                    .append(": ")
                    .append(Double.toString(product.price()))
                    .append("</li>");
            totalPrice += product.price();
        }
        resp.getWriter().append("</ul>");

        resp.getWriter().append("<b>Total price:</b> ")
                .append(Double.toString(totalPrice));
        resp.getWriter().append("</body></html>");
    }
}
