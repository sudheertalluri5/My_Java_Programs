/*
ResultSetMetaData is a interface that helps us getting the metadata of table that is related to ResultSet object
Methods of this interface are
1)public int getColumnCount()
2)public String getColumnName(int index)
3)public String getColumnTypeName(int index)

and to intialize ResultSetMetaData object we need to call getMetaData() method of ResultSet class.
ResultSetMetaData is a interface so you might be thinking from where this object came from.. it is not the object of ResultSetMetaData interface but it is the object of OracleResultSetMetaData class.
*/
import java.sql.*;
class ResultSetMetaDataEx{
	public static void main(String ar[]) throws SQLException{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(Exception e){
			System.out.println(e);
		}
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","javauser","jpass");
		try{
			PreparedStatement ps=con.prepareStatement("select * from emp");
			ResultSet rs=ps.executeQuery();
			ResultSetMetaData rsmd=rs.getMetaData();
			System.out.println(rsmd.getClass().getName());
			System.out.println(rsmd.getColumnCount());
			System.out.println(rsmd.getColumnName(1));
			System.out.println(rsmd.getColumnTypeName(1));
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			con.close();
		}
	}
}