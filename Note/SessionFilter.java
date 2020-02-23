package com.chinasoft.measuringtools.filter;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.filter.OncePerRequestFilter;

import com.chinasoft.measuringtools.domain.basicfg.User;
import com.mysql.jdbc.StringUtils;

public class SessionFilter extends OncePerRequestFilter{
	private static Pattern pattern = Pattern.compile("/process(.*)|/login(.*)|/[^/]+/login(.*)|/logout(.*)|/[^/]+/logout(.*)|/lib/(.*)|/view/[^html].*/(.*)");
	private boolean open=false;

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public SessionFilter(){
		
	}
	
	public SessionFilter(boolean open){
		this.open=open;
	}
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {		
		// if(testFilter(request, response)){ return;};
		
		if(isOpen()){
			fakeUser(request);
			
			filterChain.doFilter(request, response);
			return;
		}
		response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
		response.setHeader("Pragma","no-cache");
		response.setDateHeader("Expires",-1);
		boolean bflag=false;
		Matcher matcher = pattern.matcher(request.getServletPath());
		if (matcher.matches()){
			bflag=true;
		}
		if(!bflag){
			HttpSession session=request.getSession();
			User user=(User)session.getAttribute("loginUser");
			if(user!=null&&!StringUtils.isNullOrEmpty(user.getUserName())){
				bflag=true;
			}
		}
		if(bflag){
			filterChain.doFilter(request, response);
		}else{
			//response.sendRedirect(request.getContextPath() + "/");
			response.getWriter().write("<script language='javascript'>parent.window.open('"+request.getContextPath()+"/','_top')</script>");
			return;
		}
	}
	
	/*
	 * 供测试人员使用。
	 */
	private Boolean testFilter(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//Pattern testPattern = Pattern.compile("/(.*)|/[^/]");
		//Matcher testMatcher = testPattern.matcher(request.getServletPath());
		switch (request.getRequestURI()) {
//			case "/esimple/isource/getconfig":
//				request.setAttribute("param1","param1");
//				request.getRequestDispatcher("/test").forward(request, response);
//				return true;
//			case "/esimple/project/queryProjectByPoId2":
//				request.setAttribute("param2", "param2");
//				request.getRequestDispatcher("/test").forward(request, response);
//				return true;
		}
		return false;
	}
	
	private User fakeUser(HttpServletRequest request) {
		Object obj =  request.getSession().getAttribute("loginUser");
		User user = null;
		if(null == obj) {
			user = new User();
			user.setUserCode(System.getenv("USERNAME"));
			user.setUserName(System.getenv("USERNAME"));
			user.setUserPassword("123456");
			user.setIsActive("1");
			request.getSession().setAttribute("loginUser",user);
			return user;
		}
		return (User)user;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(System.getenv());
	}
	
}
