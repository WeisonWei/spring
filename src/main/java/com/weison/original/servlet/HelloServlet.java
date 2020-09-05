package com.weison.original.servlet;

import com.weison.original.service.HelloService;
import com.weison.original.service.HelloServiceImpl;
import com.weison.original.util.BeanFactory;
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
    private HelloService service = (HelloService) BeanFactory.getBean("helloService");


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
        } else if (uri.equals("/hola")) {
            response.getWriter().println(service.get(db).toString());
        }else if (uri.equals("/beans")) {
            response.getWriter().println(service.getBeans().toString());
        } else if (uri.equals("/cacheBeans")) {
            response.getWriter().println(service.getCacheBeans().toString());
        }
    }

}
