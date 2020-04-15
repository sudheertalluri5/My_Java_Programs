import java.sql.*;
class PreparedStatementEx1{
	public static void main(String ar[]) throws SQLException{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(Exception e){
			System.out.println(e);
		}
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","javauser","jpass");
		try{
			PreparedStatement ps2=con.prepareStatement("select * from emp");
			ResultSet rs=ps2.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getLong(3));
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			con.close();
		}
	}
}	