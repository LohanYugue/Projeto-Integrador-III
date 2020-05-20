package br.senac.sp.servlet;

import br.senac.sp.dao.ClienteDAO;
import br.senac.sp.model.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CadastroCliente", urlPatterns = {"/CadastroCliente"})
public class CadastroCliente extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("CadastroCliente.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("cliNome");
        String cpf = request.getParameter("cliCpf");
        String endereco = request.getParameter("cliEndereco");
        String cidade = request.getParameter("cliCidade");
        String uf = request.getParameter("cliUf");
        String telefone = request.getParameter("cliTelefone");
        
        Cliente cliente = new Cliente();
        
        PrintWriter out = response.getWriter();
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
