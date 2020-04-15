import java.sql.*;
class ResultSetEx{
	public static void main(String ar[]) throws SQLException{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(Exception e){
			System.out.println(e);
		}
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","javauser","jpass");
		try{
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=st.executeQuery("select * from emp");
			while(rs.next()){
				System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getLong(3));
			}
			System.out.println(rs.first());
			System.out.println(rs.absolute(5));
			System.out.println(rs.absolute(3));
			System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getLong(3));	
			System.out.println(rs.first());
			System.out.println(rs.relative(5));//it returns false but moves the row i.e. rs object doesn't contain any row so we need to go back if we want to perform other operations.
			rs.relative(-2);//previous statement makes rs to point to 4 th row that is not present so we got back to 2nd row by using this statement
			System.out.println(rs.relative(1));
			System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getLong(3));		
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			con.close();
		}
	}
}