<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<title> Gerenciamento de vendas </title>
		<meta charset="utf8"> 
		<link type="text/css" rel="stylesheet" href="css/style.css"/>
	</head>
	<body>
		<div>
			<ul>
				<li><a href="carrinho" title="Carrinho"><img src="https://img.icons8.com/carbon-copy/25/000000/buy.png"></a></li>
				<li><a href="estoque" title="Estoque"><img src="https://img.icons8.com/wired/25/000000/scan-stock.png"></a></li>
			</ul>	
		</div>

		<h2 style="text-align: center;"> Cadastrar Produtos </h2>

		<form id="add_prod" action="Addprod.action" method="get">
			<div>
				<input type="number" name="id" placeholder="id" disabled>
			</div>
			<div>
				<input type="text" name="produto" placeholder="Produto">
			</div>
			<div>
				<input type="number" name="quantidade" placeholder="Quantidade">
			</div>
			<div>
				<input type="text" name="unidade" placeholder="Unidade">
			</div>
			<div>	
				<input type="number" step=0.01 name="preco" placeholder="Preço">
			</div>
			<div>
				<input type="text" name="descricao" placeholder="Descrição">
			</div>
			<div>
				<input id="confirmar" type="submit" value="Adicionar">
				<input id="cancelar" type="reset" value="Cancelar" >
			</div>
		</form>

	</body>
</html>