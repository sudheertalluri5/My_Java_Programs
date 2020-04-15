import java.sql.*;
class DatabaseMetaDataEx{
	public static void main(String ar[]) throws SQLException{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(Exception e){
			System.out.println(e);
		}
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","javauser","jpass");
		try{
			DatabaseMetaData dbmd=con.getMetaData();
			System.out.println(dbmd.getClass().getName());
			System.out.println("Driver Name: "+dbmd.getDriverName());
			System.out.println("Driver Version: "+dbmd.getDriverVersion());
			System.out.println("UserName: "+dbmd.getUserName());
			System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			con.close();
		}
	}
}