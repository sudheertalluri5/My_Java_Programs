import java.sql.*;
class JDBC_Select{
	public static void main(String ar[]) throws SQLException{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(Exception e){System.out.println(e);}
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","javauser","jpass");		
		try{
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from emp1");
			while(rs.next()){
				System.out.println("Employee id "+rs.getInt(1));
				System.out.println("Employee name "+rs.getString(2));
				System.out.println("Employee sal "+rs.getLong(3));
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