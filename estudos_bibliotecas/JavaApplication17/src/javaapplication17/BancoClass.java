/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

import java.sql.Connection;
import java.awt.Component;
import java.sql.SQLException;
import java.sql.DriverManager;

public class BancoClass {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
      private static final String URL = "jdbc:mysql://localhost:3307/sistema_venda";
      private static final String USER = "root";
      private static final String PASS = "senac";
   
   
    public static Connection conexaoBanco() throws SQLException {
        try {
             Class.forName(DRIVER);
             Component parentComponent = null;
             
             return DriverManager.getConnection(URL,USER, PASS);
         } catch (ClassNotFoundException ex) {
            Component parentComponent = null;
            throw new RuntimeException("Erro no banco de dados",ex);
         } catch (SQLException e){
             throw new RuntimeException("Erro",e);
         }
    }
}
