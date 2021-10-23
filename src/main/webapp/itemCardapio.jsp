<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>Item Cardápio</title>


<!-- Custom styles for this template -->

<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Wendy+One&display=swap"
	rel="stylesheet">
<link href="css/master.css" rel="stylesheet" />

</head>

<body style="background-color: #4196A6 !important;">
	<div>
		<div
			class="d-flex flex-column justify-content-between align-items-center small-left-content">
			<a class="mt-3">
				<img src="img/logo.svg" width="100" alt="logo" />
			</a>
		</div>
	</div>
	<div
		style="display: flex; flex-direction: column; justify-content: center;">

		<h1 style="display: flex; justify-content: center;"
			class="my-5 text-white">Cardápio</h1>
		<div class="card mx-auto"
			style="width: 80%; border: 2px solid #800; height: 80%">
			<row style="height: 5vh">
			<div class="btn-group w-100 h-100" role="group">
				<p class="btnNavAtual text-white">Itens</p>
			</div>
			</row>

			<row>
			<table class="table">
				<thead>
					<tr>
						<th scope="col">Foto</th>
						<th scope="col">Nome do item</th>
						<th scope="col">Descrição</th>
						<th scope="col">Valor do item</th>
						<th scope="col">Valor calórico</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach var="ic" items="${lista_itemCardapio}" varStatus="id">
						<tr>
							<td width="250px"><img src="${ic.foto}"
								style="width: 300px; height: 150px" class="img-thumbnail"
								alt="..."></td>
							<td class="align-middle">${ic.nome}</td>
							<td class="align-middle" width="480px">${ic.descricao}</td>
							<td class="align-middle" width="200px">${ic.valor}</td>
							<td class="align-middle" width="200px">${ic.valorCalorico}
								kcal</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			</row>
			<a class="btn btn-warning btn-lg mb-4 menu-button" role="button" href="index.jsp">Página inicial</a>
		</div>
	</div>

	<style>
.btnNavAtual {
	display: flex;
	justify-content: center;
	align-items: center;
	background-color: #a00;
	color: white;
	width: 100%;
	font-size: 16px;
}

.btnNav {
	display: flex;
	justify-content: center;
	align-items: center;
	background-color: #ddd;
	color: #666;
}
</style>






	<!-- Bootstrap core JavaScript
================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
	<link rel="stylesheet"
		href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
	<link rel="stylesheet"
		href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">

	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF"
		crossorigin="anonymous">
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-kQtW33rZJAHjgefvhyyzcGF3C5TFyBQBA13V1RKPf4uH+bwyzQxZ6CmMZHmNBEfJ"
		crossorigin="anonymous"></script>
</body>
</html>
