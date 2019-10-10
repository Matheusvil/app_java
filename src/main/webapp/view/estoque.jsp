<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        <button>Voltar</button>
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
                <button>Cadastrar</button>
            </form>
        </div>
    </div>
</body>
</html>