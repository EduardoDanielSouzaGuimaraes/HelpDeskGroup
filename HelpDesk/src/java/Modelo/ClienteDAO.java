/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import Conexao.conexao;
import Entidades.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author victo
 */
public class ClienteDAO {
    
    private Connection conexao;
     String select;
    
     public ClienteDAO() {
        this.conexao = new conexao().getConnection();

    }
    
     public void cadastrarCliente(Cliente cliente){
            String Mensagem= "insert into cliente (cpf,telefone,empresa,usuario) values (?,?)";
            
         try {
             PreparedStatement ps = this.conexao.prepareStatement(Mensagem);
             ps.setString(1,cliente.getCPF());
             ps.setString(1,cliente.getTelefone());
             ps.setInt(3,cliente.getIdEmpresa());
             ps.setInt(3,cliente.getId());
             ps.execute();
             System.out.println("Cadastrado com sucesso!");
            
            } catch (SQLException ex) {
                    System.out.println("Impossivel inserir no Banco de dados!");     
                }       
         }
    
}
