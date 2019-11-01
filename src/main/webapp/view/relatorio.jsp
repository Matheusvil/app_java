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
        <button type="submit">Voltar</button>
    </form>
    <div class="title">
        <h1>Relatorios de Vendas</h1>
        <hr>
    </div>
    <div>
        <table class="itens-car">
            <tr>
                <th>Data</th>
                <th>Caixa</th>
                <th>Valor Total</th> 
                <th>Mais informações</th> 
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <!-- <td>
                    <form action="relatorio_2" method="GET">
                        <button type="submit">Mais informações</button>
                    </form>
                </td> -->
            </tr>
        </table>
    </div>
</body>
</html>