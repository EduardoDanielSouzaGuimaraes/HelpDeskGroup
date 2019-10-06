/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexao.conexao;
import Entidades.Empresa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author victo
 */
public class EmpresaDAO {
    
    private Connection conexao;
     String select;
    
     public EmpresaDAO() {
        this.conexao = new conexao().getConnection();

    }
    
     public void cadastrarEmpresa(Empresa empresa){
            String Mensagem= "insert into empresa (razaosocial,nomefantasia,cnpj) values (?,?,?)";
            
         try {
             PreparedStatement ps = this.conexao.prepareStatement(Mensagem);
             ps.setString(1,empresa.getRazaoSocial());
             ps.setString(2,empresa.getNomeFantasia());
             ps.setString(3,empresa.getCNPJ());
             ps.execute();
             System.out.println("Cadastrado com sucesso!");
            
            } catch (SQLException ex) {
                    System.out.println("Impossivel inserir no Banco de dados! " + ex);     
                }       
         }
    
    
}
