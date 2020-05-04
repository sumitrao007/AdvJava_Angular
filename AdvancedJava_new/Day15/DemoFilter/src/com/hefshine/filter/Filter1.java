package com.hefshine.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class Filter1
 */
public class Filter1 implements Filter {

    /**
     * Default constructor. 
     */
    public Filter1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

			System.out.println("You are in do Filter Method of Filter 1....");
			
			HttpServletRequest myrequest=(HttpServletRequest)request;
			HttpServletResponse myresponse=(HttpServletResponse)response;
			
			String username=myrequest.getParameter("username");
			String password=myrequest.getParameter("password");
			
			if(username.trim().equalsIgnoreCase("") && password.trim().equalsIgnoreCase("")) {
				
			RequestDispatcher rd=myrequest.getRequestDispatcher("login.html");
			
				
				myresponse.getWriter().print("<h1 style='color:red'>* Please Enter valid Username & Password </h1>");
				rd.include(myrequest, myresponse);
				
			}else
			{
				chain.doFilter(request, response);
			}
			
		
		// pass the request along the filter chain
		
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Filter1 Init Method  is Invoked");
		
	}

}
