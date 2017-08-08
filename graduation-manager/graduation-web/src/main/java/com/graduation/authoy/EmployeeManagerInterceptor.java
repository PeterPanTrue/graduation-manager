package com.graduation.authoy;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.graduation.pojo.User;

public class EmployeeManagerInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse response,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		User user=(User) request.getSession().getAttribute("user");
		if(user.getRolename()==null){
			request.getRequestDispatcher("/jsp/backstage/fail.jsp").forward(request, response);
			return false;
		}else if(!user.getRolename().equals("人事专员")){
			if(user.getRolename().equals("人事部长")||user.getRolename().equals("总经理")||user.getRolename().equals("管理员")){
				return true;
			}else{
				request.getRequestDispatcher("/jsp/backstage/fail.jsp").forward(request, response);
				return false;
			}
		}else{
			return true;
		}
	}

}

