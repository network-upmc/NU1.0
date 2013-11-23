 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page d'authentification</title>
    </head>
    <body>
        <div style="color:red">
            <html:errors />
             <!-- dans le struts config c'est un tag pour afficher les erreurs -->
        </div>
        <html:form action="/Login" > <!-- dans web.xml il y a la classe vers laquelle le "/Login" pointe  -->
            Identifiant : <html:text name="LoginForm" property="userName" /> <br>
            Mot de passe  : <html:password name="LoginForm" property="password" /> <br>
            <html:submit value="Login" />
        </html:form>
    </body>
</html>
