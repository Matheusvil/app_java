<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="model.Produto"%>
<%@page import ="java.util.List"%>

<!DOCTYPE html>
<html>
	<head>
		<title> Gerenciamento de vendas </title>
		<meta charset="utf-8">
	<link type="text/css" rel="stylesheet" href="css/style.css"/>

	</head>
	<body>
		<div>
			<ul>
				<li><a href="carrinho" title="Carrinho"><img src="https://img.icons8.com/carbon-copy/25/000000/buy.png"></a></li>
				<li><a href="estoque" title="Estoque"><img src="https://img.icons8.com/wired/25/000000/scan-stock.png"></a></li>
			</ul>
		</div>

		<div> 
			<h2> Relatório final do estoque </h2>
		</div>

		<div>
			<table>
				<tr>
					<th>ID</th>
					<th>Produto</th>
					<th>Quantidade</th>
					<th>Preço </th>
					<th>Unidade</th>
					<th colspan="2">Descrição</th>
				</tr>

 			<% 
 				List<Produto> produtos = (List)request.getAttribute("produtos");
                for(Produto p: produtos){
                	out.print("<tr>");
                	out.print("<td>" + p.getId() + "</td>");
                	out.print("<td>" + p.getProdnome() + "</td>");
                	out.print("<td>" + p.getQuantidade() + "</td>");
                	out.print("<td>" + p.getPreco() + "</td>");
                	out.print("<td>" + p.getUnidade() + "</td>");
                	out.print("<td>" + p.getDescricao() + "</td>");
                	out.print("</tr>");
                }%>
			</table>
		</div>
		<div>
		<%  
			double valor_total = 0;
			int qnt = 0;
			for (Produto p: produtos){
				valor_total += p.getPreco() * p.getQuantidade();
				qnt += p.getQuantidade();
			}
			out.print("<b> Quantidide de produtos: " + qnt + " - </b>");
			out.print("<b> Valor Estoque: R$" + valor_total + "</b>");

		%> 

		</div>
		
	</body>
</html>