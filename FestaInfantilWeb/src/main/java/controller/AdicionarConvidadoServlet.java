/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Conexao;

/**
 *
 * @author fortunearistoteaudate
 */
@WebServlet(name = "AdicionarConvidadoServlet", urlPatterns = {"/AdicionarConvidadoServlet"})
public class AdicionarConvidadoServlet extends HttpServlet {

   
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String email = request.getParameter("email");

        try (Connection conn = Conexao.conectar()) {
            String sql = "INSERT INTO convidados (nome, email) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.executeUpdate();

            response.sendRedirect("convidados.jsp?sucesso=1");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("convidados.jsp?erro=1");
        }
    }
}
