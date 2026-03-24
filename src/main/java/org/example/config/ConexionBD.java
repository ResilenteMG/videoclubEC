package org.example.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL = "jdbc:mysql://localhost:3306/videoclub_db";
    private static final String USER = "root";
    private static final String PASS = "TU_CONTRASEÑA";

    // 2. Método estático para obtener la conexión
    // Ponemos 'static' para que el Repository lo llame sin crear un objeto nuevo
    public static Connection obtenerConexion() throws SQLException {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Error: No se encontró el Driver de MySQL.");
            throw new SQLException(e);
        }
    }
}