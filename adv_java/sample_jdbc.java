import java.sql.*;
class sample_jdbc{
	public static void main(String ar[]) throws SQLException{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(Exception e){System.out.println(e);}
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","javauser","jpass");
		try{
			Statement st=con.createStatement();
			int res=st.executeUpdate("create table emp1(eno int primary key,ename varchar(20),sal int)");
			res+=st.executeUpdate("insert into emp1 values(101,'sudheer',10000000000000)");
			res+=st.executeUpdate("insert into emp1 values(102,'sudheeri',10000000000)");
			res+=st.executeUpdate("insert into emp1 values(103,'sudheera',100000000000)");
			System.out.println(res +" inserted");
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			con.close();
		}
	}
}
