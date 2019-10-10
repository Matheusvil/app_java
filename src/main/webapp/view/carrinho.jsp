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
</body>
</head>
<body class="fundo">
  <form action="home" method="GET">
    <button>Voltar</button>
  </form>
  <div class="menu-venda">
      <h2>Caixa 01</h2>
      <hr>
      <div>
          <input type="search" placeholder="Digite o codigo ou nome do produto">
          <form action="caixa_2" method="GET">
            <button>Buscar</button>
          </form>
      </div>
      <table class="itens-car">
        <tr>
          <th>Produto</th>
          <th>Marca</th>
          <th>UN</th> 
          <th>Quantidade</th>
          <th>Preço unitario</th>
          <th>Preço</th>
        </tr>
        <tr>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
      </table>
      <div class="final">
          <label for="preco_total">Preço Total: R$ 0,00</label>
          <Button>Finalizar compra</Button>
      </div>
  </div>
</body>
</html>