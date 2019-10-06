/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author victo
 */
public class conexao {
     public Connection getConnection(){
        
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/helpdesk?zeroDateTimeBehavior=convertToNull","root","admin");
        } catch (SQLException ex) {
            System.out.println("Erro: Impossivel Conectar ao Banco de Dados: " + ex);            
            return null;
        }
    }    
}
