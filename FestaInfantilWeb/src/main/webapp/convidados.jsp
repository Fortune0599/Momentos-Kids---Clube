<%-- 
    Document   : convidados.jsp
    Created on : May 19, 2025, 9:11:31 PM
    Author     : fortunearistoteaudate
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Gestão de Convidados</title>
    <link rel="stylesheet" href="css/estilo.css">
    <script src="js/validacoes.js"></script>
</head>
<body>
    <h2>Convidados</h2>
    <form onsubmit="return validarConvidado();">
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" />

        <label for="email">E-mail:</label>
        <input type="email" id="email" name="email" />

        <button type="submit">Adicionar Convidado</button>
    </form>

    <br/>
    <a href="index.jsp">Voltar</a>
</body>
</html>
