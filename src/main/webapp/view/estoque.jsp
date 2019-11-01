<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType = "text/html" pageEncoding = "UTF-8" %>
<%@ page import = "java.util.*" %>
<%@ page import = "server.model.Produto" %>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gerenciamento de Vendas</title>
    <link rel="stylesheet" href="../css/style.css">
    <script src="../js/app.js"></script>
</head>
<body class="fundo">
    <form action="home" method="GET">
        <button type="submit">Voltar</button>
    </form>
    <div>
        <div class="title">
            <h1>Cadastro de Produtos</h1>
            <hr>
        </div>
        <div class="input-group">
            <input type="text" placeholder="Digite o codigo do produto">
            <input type="text" placeholder="Digite o nome do produto">
            <input type="text" placeholder="Digite a marca do produto">
            <input type="text" placeholder="Digite a unidade do produto">
            <input type="number" placeholder="Digite a quantidade do produto">
            <input type="text" placeholder="Digite o preço únitario do produto">
        </div>
        <div>
            <form action="estoque_2" method="GET">
                <button type="submit">Cadastrar</button>
            </form>
        </div>
        <form method = "GET">
            <table class = "striped">
                <caption>Lista Produtos</caption>
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>Descrição</th>
                        <th>Preço</th>
                        <th>Código do Produto</th>
                        <th>Quantidade no estoque</th>
                        <th>Unidade</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        List<Produto> produtos = (List<Produto>) request.getAttribute("produtos");
                        for ( Produto prod : produtos ){
                            out.print("<tr>");
                            out.print("<td>" + prod.getName() + "</td>");
                            out.print("<td>" + prod.getDescription() + "</td>");
                            out.print("<td>" + prod.getCurrency() + " " + String.format("%.2f", prod.getPrice()) + "</td>");
                            out.print("<td>" + prod.getCode() + "</td>");
                            out.print("<td>" + prod.getAmount() + "</td>");
                            out.print("<td>" + prod.getUnit() + "</td>");
                            out.print("</tr>");
                        }
                    %>
                </tbody>
            </table>
        </form>
    </div>
</body>
</html>