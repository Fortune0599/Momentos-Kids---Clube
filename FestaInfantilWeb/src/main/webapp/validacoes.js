/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


function validarConvidado() {
    let nome = document.getElementById("nome").value;
    let email = document.getElementById("email").value;

    if (nome.trim() === "" || email.trim() === "") {
        alert("Preencha todos os campos.");
        return false;
    }

    let emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(email)) {
        alert("Email inválido.");
        return false;
    }

    alert("Convidado adicionado com sucesso (simulado).");
    return false; 
    }