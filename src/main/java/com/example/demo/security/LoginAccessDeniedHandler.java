package com.example.demo.security;


import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//
//@Component
//public class LoginAccessDeniedHandler implements AccessDeniedHandler {
//
//    @Override
//    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//
//        if(auth != null){
//            System.out.println(auth.getName() + " was trying to access protected resource: " + httpServletRequest.getRequestURI());
//        }
//        httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/access-denied");
//    }
//}
