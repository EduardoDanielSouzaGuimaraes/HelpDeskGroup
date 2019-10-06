/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexao.conexao;
import Entidades.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author victo
 */
public class FuncionarioDAO {
    
    private Connection conexao;
     String select;
    
     public FuncionarioDAO() {
        this.conexao = new conexao().getConnection();

    }
    
     public void cadastrarFuncionario(Funcionario funcionario){
            String Mensagem= "insert into funcionario (usuario) values (?)";
            
         try {
             PreparedStatement ps = this.conexao.prepareStatement(Mensagem);
             ps.setInt(3,funcionario.getId());
             ps.execute();
             System.out.println("Cadastrado com sucesso!");
            
            } catch (SQLException ex) {
                    System.out.println("Impossivel inserir no Banco de dados!");     
                }       
         }
    
    
}
