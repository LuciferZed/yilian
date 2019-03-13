package com.yijie.yilian.filter;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import com.yijie.yilian.model.Admin;

/**
 * 自定义过滤器，单点登录过滤
 */
public class AccountFilter extends FormAuthenticationFilter {

	protected boolean isAccessAllowed(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<String,Object> map = (Map<String,Object>) request.getAttribute("returnModel");
		String type = (String)map.get("type");
		Map<String,Object> account = new HashMap<String,Object>();
		if(type.equals("admin")){
			Admin admin = (Admin) map.get("account");
			account = (Map<String, Object>) request.getSession().getAttribute(admin.getId());
		}
		String token = (String) map.get("token");
		if(!token.equals(account.get("token"))){
			response.getWriter().write("该账户已在线！");
			return false;
		}
		return true;
	}
}
