<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html>
<html lang="en-us">
<head>
    <meta charset="utf-8">
    
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Poagilers</title>


    <!-- Custom styles for this template -->
    <link href="css/poagilers.css" rel="stylesheet">

</head>

<body>


<nav class="navbar navbar-dark bg-dark fixed-top">
  <div class="container" style="align-items: center;">
        <div class="navbar-header" >                
            <p class="nav-link disabled"
            	 style="color: white; font-size: 20px; align-items: center;
            	  text-align: center; justify-content: center">Poágilers</p>
        </div>
       
    </div>
</nav>
<br/>
<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron">
<a class="btn btn-dark btn-lg mb-4 menu-button" role="button" href="index.jsp">Sobre o projeto </a>
    <div class="container mt-10">
        <h1>Olá</h1>
        <p>Esse são os integrantes do grupo:</p>
       
    </div>
</div>
<div class="container">

<c:forEach var="it" items="${lista_integrantes}" varStatus="id">
    <!-- Example row of columns -->
    <div class="row">
        <div class="col-md-4">
        	<!--  <img alt="ftKaue" src="img/kaue.png">-->
        	<!--   <img alt="foto" src="${it.foto}">-->
        	
        	<c:choose>
                <c:when test="${it.id == 1}"><img alt="foto" src="img/kaue.png"></c:when>
                <c:when test="${it.id == 2}"><img alt="foto" src="img/larissa.png"></c:when>
                <c:when test="${it.id == 3}"><img alt="foto" src="img/daniel.png"></c:when>
                <c:when test="${it.id == 4}"><img alt="foto" src="img/eric.jpg"></c:when>
                <c:when test="${it.id == 5}"><img alt="foto" src="img/giovanna.png"></c:when>
                <c:when test="${it.id == 6}"><img alt="foto" src="img/henrique.jpg"></c:when>
            </c:choose>
            
            <h2>${it.nome}</h2>
            <p>${it.rm}</p>            
        </div>           
    </div>
</c:forEach>
    <hr>

    <footer>
        <p>&copy; Poagilers Company</p>
    </footer>
</div> <!-- /container -->


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-kQtW33rZJAHjgefvhyyzcGF3C5TFyBQBA13V1RKPf4uH+bwyzQxZ6CmMZHmNBEfJ" crossorigin="anonymous"></script>
</body>
</html>
