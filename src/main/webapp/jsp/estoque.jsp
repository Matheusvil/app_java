<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="model.Produto"%>
<%@page import ="java.util.List"%>

<!DOCTYPE html>
<html>
	<head>
		<title> Gerenciamento de vendas </title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.8.0/css/bulma.min.css"/> 
		<link rel="stylesheet"  href="css/style.css"/>
	</head>		
	<body>
		<div>
			<ul>
				<li><a href="carrinho" title="Carrinho"><img src="https://img.icons8.com/carbon-copy/25/000000/buy.png"></a></li>
				<li><a href="estoque" title="Estoque"><img src="https://img.icons8.com/wired/25/000000/scan-stock.png"></a></li>
			</ul>	
		</div>
			<h2 class="title is-2"> Estoque </h2>
			<a class="rela" href="relatorio" title="Relatório"><img src="https://img.icons8.com/dotty/30/000000/edit-graph-report.png"></a>	
		<div>
			<table class="tabelaEstoque">
				<tr>
					<th>ID</th>
					<th>Produto</th>
					<th>Quantidade</th>
					<th>Unidade </th>
					<th>Preço</th>
					<th colspan="2">Descrição</th>
				</tr>

 			<% 
 				List<Produto> produtos = (List)request.getAttribute("produtos");
                for(Produto p: produtos){
                	out.print("<tr>");
                	out.print("<td>" + p.getId() + "</td>");
                	out.print("<td>" + p.getProdnome() + "</td>");
                	out.print("<td>" + p.getQuantidade() + "</td>");
					out.print("<td>" + p.getUnidade() + "</td>");
					out.print("<td>" + p.getPreco() + "</td>");
                	out.print("<td>" + p.getDescricao() + "</td>");
                	out.print("<td> <button id='editar' onclick=openModal('modalId',"+p.getId()+") value='editar'> Editar </button> </td>");
                	out.print("<td> <button id='remover' onclick=remover("+p.getId()+") value='remover'> X </button> </td>");
                	out.print("</tr>");
                }%>
			</table>
		</div>

		<div>
			<button id="addProd" onclick="window.location.href = 'AddProduto';">Adicionar Produto</button>
		</div>


	<div id="modalId" class="modal">
		<div class="modal-background"></div>
		<div class="modal-card">
    		<header class="modal-card-head">
      			<p class="modal-card-title">Editar</p>
      			<button class="delete" onclick="closeModal('modalId')" aria-label="close"></button>
    		</header>
    		<section class="modal-card-body">
    			<div class="field">
    				<div class="control">
    					<form action="Update.action" method="get">
							<label class="label">ID</label>
							<input id="prodId" class="input" type="number" name="id"  readonly>
							<label class="label">Produto</label>
							<input id="prodNome" class="input" type="text" name="produto">
							<label class="label">Quantidade</label>
							<input id="quantidade" class="input" type="number" name="quantidade">
							<label class="label">Unidade</label>
							<input id="unidade" class="input" type="text" name="unidade">
							<label class="label">Preço</label>
							<input id="preco" class="input" type="number" step=0.01 name="preco">
							<label class="label">Descrição</label>
							<input id="desc" class="input" type="text" name="descricao">
					</div>
				</div>
    		</section>
    		<footer class="modal-card-foot">
    			<input type="submit" class="button is-success" value="Atualizar">
      			<button class="button is-danger">Cancelar</button>
				</form>
    		</footer>
	 		</div>
	</div>
	<script src="<%=request.getContextPath()%>/js/req.js"></script> 
	</body>
</html>

