<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType = "text/html" pageEncoding = "UTF-8" %>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gerenciamento de Vendas</title>
    <link rel="stylesheet" href="../css/style.css">
    <script src="../js/app.js"></script>
</head>
<body class="fundo">
    <div>
        <p>Bem Vindo ao Gerenciamento de Vendas!</p>
    </div>
    <div class="menu">
        <h1>Selecione um item</h1>
        <hr>
        <div class="itens">
            <ul>
                <li><a href="caixa">Caixa</a></li>
                <li><a href="relatorio">Relatorios</a></li>
                <li><a href="estoque">Estoque</a></li>
            </ul>
        </div>
    </div>
</body>
</html>