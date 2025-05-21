<%-- 
    Document   : convidados.jsp
    Created on : May 19, 2025, 9:11:31 PM
    Author     : fortunearistoteaudate
--%>

<form action="adicionarConvidado" method="post">
    <label for="nome">Nome:</label>
    <input type="text" name="nome" id="nome" required>

    <label for="email">Email:</label>
    <input type="email" name="email" id="email" required>

    <button type="submit">Adicionar</button>
</form>

<% if ("1".equals(request.getParameter("sucesso"))) { %>
    <p style="color: green;">Convidado adicionado com sucesso!</p>
<% } else if ("1".equals(request.getParameter("erro"))) { %>
    <p style="color: red;">Erro ao adicionar convidado.</p>
<% } %>