import java.sql.*;
class ExecuteBatchEx{
	public static void main(String ar[]) throws SQLException{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(Exception e){
			System.out.println(e);
		}
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","javauser","jpass");
		try{
			Statement st=con.createStatement();
			st.addBatch("drop table emp");
			st.addBatch("alter table emp1 rename to emp");
			int a[]=st.executeBatch();
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			con.close();
		}
	}
}