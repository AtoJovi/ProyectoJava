package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

//Clase conexion para conectar a BBDD hay muchos ejemplos para conectar java con xampp sera solo copiar
public class Conexion {
    Connection conectar=null;
    public Connection conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar= DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "");
            System.out.println("Se ha conectado");
        } catch (Exception e){
            System.out.println("No se ha podido conectar" +" "+ e.getMessage());
        }
        return conectar;
    }
}