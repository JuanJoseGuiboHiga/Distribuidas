<%-- 
    Document   : validar
    Created on : 19-feb-2016, 19:39:30
    Author     : JUANJO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%
          String txtUsuario;
        
        %>
        <title>JSP Page</title>
    </head>
    <body>
       <%  txtUsuario = request.getParameter("txtUsuario");
         
      
      if((txtUsuario.equals("juan")))
      {
        response.sendRedirect("consultarTramites.jsp");
      }
      else
      {
         response.sendRedirect("consultarTramites.jsp");
      }
   %>
    </body>
</html>
