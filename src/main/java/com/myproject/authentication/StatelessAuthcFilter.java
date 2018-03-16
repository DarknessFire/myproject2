package com.myproject.authentication;

import org.apache.shiro.web.filter.AccessControlFilter;

import javax.servlet.ServletRequest;

/**
 * @author lijinzao
 * @date 2018/3/16 16:16
 **/
public class StatelessAuthcFilter extends AccessControlFilter {

    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, javax.servlet.ServletResponse servletResponse, Object o) throws Exception {
        return false;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, javax.servlet.ServletResponse servletResponse) throws Exception {
        return false;
    }
}