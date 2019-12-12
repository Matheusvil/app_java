<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html> 
<html>
	<head>
		<title> Gerenciamento de vendas </title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.8.0/css/bulma.min.css"/> 
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
	</head>	

	<body>
		<div>
			<ul>
				<li><a href="carrinho" title="Carrinho"><img src="https://img.icons8.com/carbon-copy/25/000000/buy.png"></a></li>
				<li><a href="estoque" title="Estoque"><img src="https://img.icons8.com/wired/25/000000/scan-stock.png"></a></li>
			</ul>	
		</div>
		
		<div>
			<h2 class="title is-2"> Busca </h2>	
		</div>

		<div>
			<form id="envio_prod" onsubmit="adicionar(event)" method="get">
				<input id="idProd" type="number" name="produto" placeholder="Produto ID"/>
				<input id="qntProd" type="number" name="quantidade" required/>
				<input class="btn-default" type="submit" value="Adicionar">
			</form>
		</div>
			<table class="tabelaEstoque" id="carrinho">
				<tr>
					<th>ID</th>
					<th>Produto</th>
					<th>Quantidade</th>
					<th>Unidade </th>
					<th>Preço</th>
					<th colspan="2">Descrição</th>
				</tr>
			</table>

		<div>
			<b id="ttlProdutos"></b>
			<b id="ttlCarrinho"></b>
		</div>
		<div>
			<form id="form" action="Comprar" method="post"></form>
			<button class="btn-default" onclick="comprar()">Comprar</button> 
		</div>
		<script src="<%=request.getContextPath()%>/js/req.js"></script>
	</body>
</html>