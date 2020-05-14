package br.senac.sp.dao;

import br.senac.sp.conexao.ConnectionFactory;
import br.senac.sp.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private Connection connection;

    public ProdutoDAO() {
        connection = ConnectionFactory.getConnection();
    }

    public void adicionarProduto(Produto produto) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT INTO Produto(produto_nome, produto_valor, produto_estoque, produto_dataCadastro)"
                            + " VALUES (?,?,?,?)");
            preparedStatement.setString(1, produto.getProNome());
            preparedStatement.setDouble(2, produto.getProValor());
            preparedStatement.setInt(3, produto.getProEstoque());
            preparedStatement.setDate(4, new java.sql.Date(produto.getProDataCadastro().getTime()));

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void deletarProduto(int idProduto) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("DELETE FROM Produto WHERE produto_id=?");
            preparedStatement.setInt(1, idProduto);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void editarProduto(Produto produto) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("UPDATE Produto SET produto_nome=?, produto_valor, produto_estoque, produto_dataCadastro"
                            + "WHERE produto_id=?");
            preparedStatement.setString(1, produto.getProNome());
            preparedStatement.setDouble(2, produto.getProValor());
            preparedStatement.setInt(3, produto.getProEstoque());
            preparedStatement.setDate(4, new java.sql.Date(produto.getProDataCadastro().getTime()));

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Produto BuscarProdutoId(int idProduto) {
        Produto produto = new Produto();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Produto WHERE produto_id=?");
            preparedStatement.setInt(1, idProduto);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                produto.setProNome(rs.getString("produto_nome"));
                produto.setProValor(rs.getDouble("produto_valor"));
                produto.setProEstoque(rs.getInt("produto_estoque"));
                produto.setProDataCadastro(rs.getDate("produto_dataCadastro"));
                produto.setIdProduto(rs.getInt("produto_id"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return produto;
    }

    public Produto BuscarClienteCpf(String proNome) {
        Produto produto = new Produto();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Produto WHERE produto_nome=?");
            preparedStatement.setString(1, proNome);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                produto.setProNome(rs.getString("produto_nome"));
                produto.setProValor(rs.getDouble("produto_valor"));
                produto.setProEstoque(rs.getInt("produto_estoque"));
                produto.setProDataCadastro(rs.getDate("produto_dataCadastro"));
                produto.setIdProduto(rs.getInt("produto_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return produto;
    }

    public List<Produto> listarProdutos() {
        List<Produto> listaDeProdutos = new ArrayList<Produto>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Produto");
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setProNome(rs.getString("produto_nome"));
                produto.setProValor(rs.getDouble("produto_valor"));
                produto.setProEstoque(rs.getInt("produto_estoque"));
                produto.setProDataCadastro(rs.getDate("produto_dataCadastro"));
                produto.setIdProduto(rs.getInt("produto_id"));
                listaDeProdutos.add(produto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaDeProdutos;
    }

}
