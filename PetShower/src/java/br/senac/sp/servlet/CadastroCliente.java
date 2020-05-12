package br.senac.sp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
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
        //Empty
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             // obtendo dados //
            String nome = request.getParameter("Nome");
            String endereco = request.getParameter("Endereço");
            // mostrar os dados no log //
		System.out.println(nome);
		System.out.println(endereco);
            // redirecionando para o jsp tratar 
		RequestDispatcher rd = request.getRequestDispatcher("/sucesso.jsp");
		rd.forward(request,response);

            
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
