package top.flabby.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/requestdemo03")
public class RequestDemo03 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String header=request.getHeader("User-Agent");
        System.out.println("header");
        if (header.toLowerCase().contains("msie")) {
            System.out.println("You are using Internet Explorer");
        }else if(header.toLowerCase().contains("firefox")){
            System.out.println("You are using the browser Firefox");
        }else if(header.toLowerCase().contains("chrome")){
            System.out.println("You are using Google Chrome");
        }else  {
            System.out.println("You're using a different browser");
        }



    }

}