package br.senac.sp.dao;

import br.senac.sp.conexao.ConnectionFactory;
import br.senac.sp.model.Vendas;
import br.senac.sp.model.Cliente;
import br.senac.sp.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VendasDAO {

    private Connection connection;

    public VendasDAO() {
        connection = ConnectionFactory.getConnection();
    }
    

    public Vendas BuscarVendasId(int idVenda) {
        Vendas vendas = new Vendas();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Vendas WHERE venda_id=?");
            preparedStatement.setInt(1, idVenda);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                vendas.setIdVenda(rs.getInt("venda_id"));
                vendas.setDataVenda(rs.getDate("venda_data"));
                vendas.setIdCliente(rs.getInt("venda_id_cli"));
                vendas.setValorTotal(rs.getDouble("venda_valorTotal"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vendas;
    }
    public List<Vendas> listarVendas() {
        List<Vendas> listaDeVendas = new ArrayList<Vendas>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Vendas");
            while (rs.next()) {
                Vendas vendas = new Vendas();
                vendas.setIdVenda(rs.getInt("venda_id"));
                vendas.setDataVenda(rs.getDate("venda_data"));
                vendas.setIdCliente(rs.getInt("venda_id_cli"));
                vendas.setValorTotal(rs.getDouble("venda_valorTotal"));
                listaDeVendas.add(vendas);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaDeVendas;
    }

}
