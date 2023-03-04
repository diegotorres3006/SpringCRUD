/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author diant
 */
public class Conexion {
    
    public DriverManagerDataSource Conectar(){
          
         DriverManagerDataSource dataSource = new DriverManagerDataSource();
         dataSource.setDriverClassName("com.mysql.jdbc.Driver");
         dataSource.setUrl("jdbc:mysql://localhost:3306/registro2"); //nombre de su base
         dataSource.setUsername("root"); // su usario
         dataSource.setPassword(""); //su contraseña
         
         return dataSource;
        
    }
    
    
}
