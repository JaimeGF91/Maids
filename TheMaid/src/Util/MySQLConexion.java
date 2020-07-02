package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConexion {
	
	public static Connection getConexion(){
		Connection con = null;
		try{		
		//DE USO EN MYSQL 5.7 DE USO DE INSTITUTO	
		//Class.forName("com.mysql.jdbc.Driver"); //instanciamiento de la clase del driver
		//String url= "jdbc:mysql://localhost:3306/ciberfarma";//variable String que contiene los datos del servidor
		//DE USO EN MYSQL 8.0 ACTUALIZADO DE HOGAR	
			
			
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); //instanciamiento de la clase del driver
		String url= "jdbc:mysql://localhost:3306/themaida_bd?useTimezone=true&serverTimezone=UTC";//variable String que contiene los datos del servidor
		String usr= "themaida_bd_us";//variable String que contiene el dato del usuario
		String psw= "u1sO;238QgGY)r";//variable String que contiene el dato del password
		con = DriverManager.getConnection(url,usr,psw);// con este método se establece la conexión con el servidor
		} catch(ClassNotFoundException e) {
		System.out.println("Error >> Driver no Instalado!!");
		} catch(SQLException e) {
		System.out.println("Error >> de conexión con la BD");
		} catch(Exception e) {
			System.out.println("Error >> "+ e.getMessage());
			}
		return con;
		}
	
	public static void closeConexion(Connection con){
		
		try {
			con.close();//Sentencia para cerrar la conexión
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Problemas al cerrar la conexion");
		}
	}
	
	public static void closeStatement(Statement stmt){
		
		try {
			stmt.close();// sentencia para cerrar el statement
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Problemas al cerrar el statement");
		}
	}
	

}
