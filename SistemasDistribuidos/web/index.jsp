<%-- 
   
--%>
<%@page import="com.tramarsa.services.ClienteImpl"%>
<%@page import="com.tramarsa.webservices.Clientes"%>
<%
 ClienteImpl cliente = new ClienteImpl();

%>

<html>
    <head>
        <title>Logeo</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
         <link rel="stylesheet" href="css/normalize.css">
         <link rel="stylesheet" href="css/style.css">
	    	      
    </head>
   
  <body>

    <div class="login">
        <h1>Login</h1>

        <form method="post">
            <input type="text" name="txtUsuario" placeholder="Usuario" required="required" />
            <input type="password" name="txtContrase�a" placeholder="Contrase�a" required="required" />
            <button type="submit" class="btn btn-primary btn-block btn-large" >Aceptar</button>
            <a href="consultarTramites.html">a </a>
        </form>
    </div>
    
     
    
  </body>
</html>