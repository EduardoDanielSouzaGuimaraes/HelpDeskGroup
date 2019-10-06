/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexao.conexao;
import Entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author victo
 */
public class UsuarioDAO {
    
     private Connection conexao;
     String select;
     

    public UsuarioDAO() {
        this.conexao = new conexao().getConnection();

    }
    
     public void cadastrarUsuario(Usuario usuario){
            String Mensagem= "insert into usuario (login,senha) values (?,?)";
            
         try {
             PreparedStatement ps = this.conexao.prepareStatement(Mensagem);
             ps.setString(1,usuario.getLogin());
             ps.setString(2,usuario.getSenha());
             ps.execute();
             System.out.println("Cadastrado com sucesso!");
            
            } catch (SQLException ex) {
                    System.out.println("Impossivel inserir no Banco de dados!");     
                }       
         }
    
}
