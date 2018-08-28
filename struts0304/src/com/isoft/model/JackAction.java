package com.isoft.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

public class JackAction implements ServletRequestAware,ServletResponseAware{

	private HttpServletRequest myRequest;
	
	private HttpServletResponse myResponse;
	
	public String myTest()
	{
		System.out.println("��̬��������");
		HttpServletRequest request = ServletActionContext.getRequest();
		String userName = request.getParameter("myUserName");
		request.setAttribute("myname",userName);
		System.out.println(userName);
		return "myTestResult";
	}
	
	public String hello()
	{
		HttpSession session = myRequest.getSession();
		myRequest.setAttribute("myname", "˧��");
		System.out.println("hello......��̬��������");
		return "myTestResult";
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		myRequest=arg0;
		
	}

	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		this.myResponse = arg0;
		
	}
}
