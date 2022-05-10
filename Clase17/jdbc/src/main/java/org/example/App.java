package org.example;

import java.sql.*;

public class App
{
    public static void main( String[] args )
    {


        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/Personas","root", "root");

            Statement st = conn.createStatement();

            //st.executeUpdate("delete from Personas where Apellido is null");

            ResultSet rs = st.executeQuery("call buscar_otras(?);");

            while(rs.next()) { // una vuelta por cada fila
                int id = rs.getInt("Id");
                String nombre = rs.getString("Nombre");
                String apellido = rs.getString("Apellido");
                int edad = rs.getInt("Edad");

                System.out.println(id + nombre + apellido + edad);
            }


            rs.close();
            st.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
