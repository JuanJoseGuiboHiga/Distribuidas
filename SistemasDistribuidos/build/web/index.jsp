<%-- 
    Document   : index
    Created on : 19-feb-2016, 19:08:05
    Author     : JUANJO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Logeo</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
         <link rel="stylesheet" href="css/normalize.css">
         <link rel="stylesheet" href="css/style.css">
         
         
  
    </head>
   
  <body>
   <a></a>  
  
    <div class="login">
         <img src="http://htsconsultoria.com/wp-content/uploads/2012/08/14.-TRAMARSA.jpg" alt="Smiley face" height="42" width="42">
        <h1>Login</h1>
        <form action="validar.jsp" method="POST">
 
            <input type="text" name="txtUsuario" placeholder="Usuario" required="required" />
            <input type="password" name="txtContraseña" placeholder="Contraseña" required="required" />
            <button type="submit" class="btn btn-primary btn-block btn-large" >Aceptar</button>
        </form>
    </div>
    
     
    
  </body>
</html>

