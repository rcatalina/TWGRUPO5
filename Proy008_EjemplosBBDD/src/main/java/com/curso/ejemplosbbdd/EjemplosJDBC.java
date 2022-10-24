package com.curso.ejemplosbbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EjemplosJDBC {

	public static void main(String[] args) {

		// 1. Cargar Driver JDBC Oracle 18c

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("cargó ok");
		} catch (ClassNotFoundException e) {
			System.out.println("No cargó driver");
			e.printStackTrace();
			return;
		}

		// 2. Crear una conexión a la BD

		String url = "jdbc:oracle:thin:@localhost:49161:xe";
		String usr = "system";
		String clave = "oracle";

		try (Connection con = DriverManager.getConnection(url, usr, clave)) {

			System.out.println("conectó ok");

			// llamada al proc almacenado

//			CallableStatement call = con.prepareCall("{call MI_PROGRAMA1(?,?,?)} ");
//		     
//		    int id = 100;	
//		    String nombre, apellido;
//		    
//		    call.setInt(1, id);
//		    call.registerOutParameter(2, Types.VARCHAR); //nombre
//		    call.registerOutParameter(3, Types.VARCHAR); //apellido
//		    
//		    //ejecuto
//		    call.execute();
//		    
//		    //recogemos los datos salida
//		    nombre = call.getString(2);
//		    apellido = call.getString(3);
//			
//		    System.out.printf("El empleado %d es %s %s", id, nombre, apellido);
//		    
//		    
//		    // STATEMENT   - 
//		    Statement st = con.createStatement();
//		    
//		   // st.execute(...
//		   // st.executeQuery (...) -> ResultSet
//		   // st.executeUpdate (...)  -> int numero de reg afectados
//		   
//		    // INSERTO 2 CAFES
//		   
//		    String instruccion = "INSERT INTO COFFEES "
//		    		+ "VALUES ('Colombian', 101,7.99,0,0)";
//		    
//		    int n = st.executeUpdate(instruccion);
//		    
//		    
//		    instruccion = "INSERT INTO COFFEES "
//		    		+ "VALUES ('Espresso', 150, 9.99,0,0)";
//		    n = st.executeUpdate(instruccion);
//		    
//		    
//		    // CONSULTAR LOS CAFES
//		    
//		    String consulta = "SELECT * FROM COFFEES";
//		    
//		   ResultSet rs =  st.executeQuery(consulta);
//		    
//		   System.out.println(".. Listar cafes ");
//		   
//		   String nombreCafe;
//		   int  stock;
//		   double precio;
//		   
//		   while(rs.next()) {
//			   nombreCafe = rs.getString(1); // rs.getString("COF_NAME");
//			   stock = rs.getInt(2);
//			   precio = rs.getDouble(3);
//			   System.out.printf("café %s vale %5.2f tiene un stock de %d ",
//					   nombreCafe, precio, stock);
//		   }
//		   
//		   
//		   
//		   // lanzo a ciegas
//		   String consultaAnomina =  "SELECT COF_NAME FROM COFFEES";
//		                            // "UPDATE...."
//		   boolean esRS =  st.execute(consultaAnomina);
//		   if(esRS) {
//			   ResultSet rs2 =  st.getResultSet();
//			   //se recorre con un while
//		   }else {
//			   int nReg = st.getUpdateCount();
//		   }   
//		    
//		    //MODO MALO  - USO STATEMENT
//		    
//		     Scanner sc = new Scanner(System.in);
//		     
//		     System.out.println("Mostrar precio de un café");
//		     System.out.println("Nombre café: ");
//		     
//		     String cafe = sc.next();  //Espresso 
//		     
//		     Statement st2 = con.createStatement();
//		     
//		     ResultSet respuesta = 
//		    		 st2.executeQuery("SELECT PRICE "
//		     		+ "FROM COFFEES "
//		     		+ "WHERE COF_NAME = '" + cafe + "' ");
//
//		     int contador = 0;
//		     while(respuesta.next()) {
//		    	 System.out.println("precio es " + respuesta.getDouble("PRICE"));
//		    	 contador ++;
//		     }
//		     if(contador == 0) {
//		    	 System.out.println("El café indicado no existe");
//		     }
//		     
//		     
//		     //MEJOR USAR PREPAREDSTATEMENT
//		     
//		     System.out.println(" MEJORADO ...........");
//		     System.out.println("Mostrar precio de un café");
//		     System.out.println("Nombre café: ");
//		     
//		     cafe = sc.next();  //Espresso 
//		     
//		    PreparedStatement pst = con.prepareStatement("SELECT PRICE "
//		    		+ "FROM COFFEES "
//		    		+ "WHERE COF_NAME = ? ");
//		    
//		    pst.setString(1, cafe);
//		    
//		    
//		    respuesta = pst.executeQuery();
//		     
//		     contador = 0;
//		     while(respuesta.next()) {
//		    	 System.out.println("precio es " + respuesta.getDouble("PRICE"));
//		    	 contador ++;
//		     }
//		     if(contador == 0) {
//		    	 System.out.println("El café indicado no existe");
//		     }
//		     
//		     
//		     
//		     

			// EJEMPLO TRANSACCION

			// con.setAutoCommint(true)
			// con.commin()
			// con.rollback();

			// insert 1 -> commit
			// insert 2 -> commit

			String insert1 = "INSERT INTO COFFEES " + "VALUES ('Cafe1', 100, 7.8,0,0)";

			String insert2 = "INSERT INTO COFFEESXXXXX " + "VALUES ('Cafe2', 40, 5.0,0,0)";
			// INICIO TRANSACCION
			con.setAutoCommit(false);
			try {
				Statement st3 = con.createStatement();
				st3.executeUpdate(insert1);
				st3.executeUpdate(insert2);
				// ok
				con.commit();
			} catch (SQLException ex) {
				con.rollback();
				throw ex;
			}
			// FIN TRANSACCION

			con.setAutoCommit(true);

		} catch (SQLException e) {

			System.out.println("Error BD " + e.getMessage());
			e.printStackTrace();
		}

	}

}
