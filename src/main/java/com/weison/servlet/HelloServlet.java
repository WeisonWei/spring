package com.weison.servlet;

import com.weison.service.HelloService;
import com.weison.service.HelloServiceImpl;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Weison
 * @date 2020/9/3
 */
@Slf4j
//@WebServlet(urlPatterns = "/hello")
@WebServlet(urlPatterns = "/")
public class HelloServlet extends HttpServlet {

    private HelloService helloService = new HelloServiceImpl();


    /**
     * http://localhost:8080/hello?db=mysql
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String db = request.getParameter("db");
        String uri = request.getRequestURI();
        StringBuffer url = request.getRequestURL();
        log.info("==uri==" + uri);
        log.info("==url==" + url);
        response.getWriter().println("HelloServlet run ......");
        if (uri.equals("/hello")) {
            response.getWriter().println(helloService.findAll(db).toString());
        } else if (uri.equals("/hi")) {
            response.getWriter().println(helloService.getAll(db).toString());
        }
    }

}
