package top.flabby.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/requestdemo01")
public class RequestDemo01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestedSessionId = req.getMethod();
        System.out.println(requestedSessionId);
        String requestAuthType =req.getAuthType();
        System.out.println(requestAuthType);
        String requestRemoteUser=req.getRemoteAddr();
        System.out.println(requestRemoteUser);

    }

}