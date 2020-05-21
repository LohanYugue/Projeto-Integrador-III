package br.senac.sp.servicos;

import java.util.List;
import java.sql.SQLException;
import br.senac.sp.dao.ProdutoDAO;
import br.senac.sp.servicos.ProdutoException;
import br.senac.sp.model.Produto;


public class ProdutoService extends SQLException {

    private ProdutoDAO produtoDAO = new ProdutoDAO();

    public List<Produto> listarProdutos() throws ProdutoException {
        try {
            System.out.println("Listagem de Produtos");
            return produtoDAO.listarProdutos();
        } catch (SQLException e) {
            throw new ProdutoException("ERRO!", e);
        }
    }

    private boolean isValid(Produto produto) {
        return produto != null && produto.getProNome() != null && produto.getProValor() != 0;
    }

    public void adicionarProduto(Produto produto) throws ProdutoException {
        try {
            if (isValid(produto)) {
                produtoDAO.adicionarProduto(produto);
            } else {
                throw new ProdutoException("Dados Inválidos", null);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ProdutoException("ERRO!", e);
        }
    }

    public Produto buscarProdutoId(int idProduto) throws ProdutoException {

        try {
            System.out.println("Pesquisando produto");
            return produtoDAO.buscarProdutoId(idProduto);
        } catch (SQLException e) {
            throw new ProdutoException("ERRO!", e);
        }

    }

    public void editarProduto(Produto produto) throws ProdutoException {
        try {
            if (isValid(produto)) {
                System.out.println("Alterando dados de um produto");
                produtoDAO.editarProduto(produto);
            } else {
                throw new ProdutoException("Dados Inválidos", null);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ProdutoException("ERRO!", e);
        }
    }
}
