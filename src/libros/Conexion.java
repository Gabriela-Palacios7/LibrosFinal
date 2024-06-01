/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libros;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Gabriela
 */
public class Conexion {
    
   // URL de la conexión base de datos
    private static final String URL = "jdbc:postgresql://aws-0-us-west-1.pooler.supabase.com:5432/Libros";
    //postgres://postgres.adztzxndbrpcpzumrvnu:[YOUR-PASSWORD]@aws-0-us-west-1.pooler.supabase.com:5432/postgres
    // usuario y contraseña
    private static final String USUARIO = "postgres.adztzxndbrpcpzumrvnu";
    private static final String CONTRASENA = "47171478Gabriela.";
    
    public static Connection conectar() throws SQLException {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return conexion;
    } 
}
