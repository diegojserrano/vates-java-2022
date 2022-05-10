package ar.edu.diego.abmpersonas.repositorios;

import ar.edu.diego.abmpersonas.entidades.Persona;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.ApplicationScope;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

@Repository
@ApplicationScope
public class PersonasRepository {

    public Collection<Persona> obtenerTodas() {

        Collection<Persona> lista = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/Personas","root", "root");

            Statement st = conn.createStatement();

            //st.executeUpdate("delete from Personas where Apellido is null");

            ResultSet rs = st.executeQuery("select * from Personas");

            while(rs.next()) { // una vuelta por cada fila
                int id = rs.getInt("Id");
                String nombre = rs.getString("Nombre");
                String apellido = rs.getString("Apellido");
                int edad = rs.getInt("Edad");

                lista.add(new Persona(id, nombre + " " + apellido, edad));
            }

            rs.close();
            st.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public Persona obtenerUna(int documento) {
        Persona encontrada = null;

        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/Personas","root", "root");

            Statement st = conn.createStatement();

            //st.executeUpdate("delete from Personas where Apellido is null");

            ResultSet rs = st.executeQuery("select * from Personas where Id = " + documento);

            if(rs.next()) {
                int id = rs.getInt("Id");
                String nombre = rs.getString("Nombre");
                String apellido = rs.getString("Apellido");
                int edad = rs.getInt("Edad");

                encontrada = new Persona(id, nombre + " " + apellido, edad);
            }

            rs.close();
            st.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return encontrada;
    }

    public void agregar(Persona nueva) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/Personas","root", "root");

            PreparedStatement st = conn.prepareStatement("insert into Personas(Nombre, Apellido, Edad) values (?,?,?)");

            st.setString(1, nueva.getNombre());
            st.setString(2, "Doc" + nueva.getDocumento());
            st.setInt(3, nueva.getEdad());

            st.executeUpdate();

            st.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void borrar(int documento) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/Personas","root", "root");

            Statement st = conn.createStatement();

            st.executeUpdate("delete from Personas where Id = " + documento);

            st.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
