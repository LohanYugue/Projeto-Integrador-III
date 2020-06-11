package br.senac.sp.servlet;

import br.senac.sp.dao.UsuarioSistemaDAO;
import br.senac.sp.model.UsuarioSistema;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");
       
        UsuarioSistema usuarioLogado = UsuarioSistemaDAO.getUsuarioSistemaByUsuario(usuario);
        
        if (usuarioLogado != null) {
            HttpSession sessao = request.getSession();
            sessao.setAttribute("usuario", usuarioLogado);
            response.sendRedirect(request.getContextPath() + "/PaginaInicial.jsp");
        } else {
            request.setAttribute("msgErro", "Usuário ou senha inválido");
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        }
    }
}    