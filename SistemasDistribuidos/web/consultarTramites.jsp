<%-- 
    Document   : consultarTramites
    Created on : 19-feb-2016, 19:47:47
    Author     : JUANJO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE HTML>

<html>
<head>

    
<title>Consulta de Tramites Tramarsa</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/> 
         <link rel="stylesheet" href="css/normalize.css">
         <link rel="stylesheet" href="css/style.css">
         

</head>

<body>
  
    <div class="header" align="center" class="Dist">
        <h3>Ingrese su número de reclamo:</h3>
	<center><input type="text" id="searchKey" style="width:300px" /></center>
	<button id="btnSearch">Buscar Documento</button>
</div>

<div class="leftArea">
<ul id="reclamosList"></ul>
</div>

<div  class="mainArea" align="center">

<label>Item:</label>
<center><input type="text" id="itemtxt" name="itemtxt" style="width:300px" disabled></center>

<label>Doc Item:</label>
<center><input type="text" id="docitemtxt" name="docitemtxt" style="width:300px" disabled/></center>

<label>Tipo Doc:</label>
<center><input type="text" id="ntDoctxt" name="ntDoctxt" style="width:300px" disabled/></center>

<label>Serie:</label>
<center><input type="text" id="nSerietxt" name="nSerietxt" style="width:300px;height:200px" disabled/></center>

<label>Numero:</label>
<center><input type="text" id="nNumerotxt" name="nNumerotxt" style="width:300px;height:200px" disabled/></center>

<label>Moneda:</label>
<center><input type="text" id="nMonedatxt" name="nMonedatxt" style="width:300px;height:200px" disabled/></center>

<label>Monto:</label>
<center><input type="text" id="nMontotxt" name="nMontotxt" style="width:300px;height:200px" disabled/></center>

<label>Estado:</label>
<center><input type="text" id="nEstadotxt" name="nEstadotxt" style="width:300px;height:200px" disabled/></center>

</div>

<script src="jquery/jquery-1.10.2.js"></script>
<script src="jquery/main.js"></script>

</body>
</html>