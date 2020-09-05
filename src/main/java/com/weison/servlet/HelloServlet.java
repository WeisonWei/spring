package com.weison.servlet;

import com.weison.service.HelloService;
import com.weison.service.HelloServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Weison
 * @date 2020/9/3
 */
@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    private HelloService helloService = new HelloServiceImpl();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.getWriter().println("HelloServlet run ......");
        response.getWriter().println(helloService.findAll().toString());

    }
}
