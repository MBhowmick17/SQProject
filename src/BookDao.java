import java.sql.Connection;
import java.sql.PreparedStatement;

//import com.mysql.jdbc.Util;


public class BookDao {
	//@ requires callno!=null && quantity!=0;
	//@ ensures quantity>0;
public static int save(String callno,String name,String author,String publisher,int quantity){
	int status=0;
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into books(callno,name,author,publisher,quantity,issued) values(?,?,?,?,?,?)");
		ps.setString(1,callno);
		ps.setString(2,name);
		ps.setString(3,author);
		ps.setString(4,publisher);
		ps.setInt(5,quantity);
		ps.setInt(6,0);
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}


}
