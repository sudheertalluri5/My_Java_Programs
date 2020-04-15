import java.sql.*;
class PreparedStatementEx{
	public static void main(String ar[]) throws SQLException{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(Exception e){
			System.out.println(e);
		}
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","javauser","jpass");
		try{
			PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?)");
			ps.setInt(1,104);
			ps.setString(2,"sudh");
			ps.setLong(3,100000000);
			ps.executeUpdate();
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			con.close();
		}
	}
}	