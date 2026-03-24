package org.example.repository;

import org.example.config.ConexionBD;
import org.example.model.Movie;
import java.sql.*;

public class MovieRepository {
    public void guardar(Movie movie) {
        String sql = "INSERT INTO movies (title, year_release, description, price) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, movie.getTitle());
            stmt.setInt(2, movie.getYearRelease());
            stmt.setString(3, movie.getDescription());
            stmt.setFloat(4, movie.getPrice());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("❌ Error al guardar: " + e.getMessage());
        }
    }

    public void listar() {
        String sql = "SELECT * FROM movies";
        try (Connection conn = ConexionBD.obtenerConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + " | Título: " + rs.getString("title"));
            }
        } catch (SQLException e) {
            System.out.println("❌ Error al leer: " + e.getMessage());
        }
    }
    
    public void eliminar(int id) {
        String sql = "DELETE FROM movies WHERE id = ?";
        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("❌ Error al borrar: " + e.getMessage());
        }
    }
}
