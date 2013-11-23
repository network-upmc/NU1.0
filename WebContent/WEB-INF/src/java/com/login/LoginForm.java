/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.login;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class LoginForm extends org.apache.struts.action.ActionForm {
    
    private String userName;

    private String password;


    public LoginForm() {
        super();
        
    }

 // Checker si les champs sont bien saisis
    
    public ActionErrors validate() {
        ActionErrors errors = new ActionErrors();
        if (userName == null) {
            errors.add("userName", new ActionMessage("error.userName.obligatoire"));
           // Appel la properties error.userName.obligatoire dans le fichier ApplicationResource.properties
        }
        if (password == null) {
            errors.add("password", new ActionMessage("error.password.obligatoire"));
            // Appel la properties error.password.obligatoire dans le fichier ApplicationResource.properties
        }
        return errors;
    }

  
    public String getUserName() {
        System.out.println(userName);
        return userName;
    }

  
    public void setUserName(String userName) {
        this.userName = userName;
    }

 
    public String getPassword() {
        return password;
    }

 
    public void setPassword(String password) {
        this.password = password;
    }
}
