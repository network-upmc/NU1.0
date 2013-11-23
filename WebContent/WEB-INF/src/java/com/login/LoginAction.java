/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

 
public class LoginAction extends org.apache.struts.action.Action {

 
    private final static String LoginOk = "Ok";
    private final static String LoginKo = "Ko";
 
    
    
    public ActionForward execute()
            throws Exception {
        LoginForm loginForm = (LoginForm) form;
        if (loginForm.getUserName().equals(loginForm.getPassword())) {
            return "Ok";
        } else {
            return "Ko";
        }
    }
}
