import java.sql.Connection;
import java.sql.PreparedStatement;


public class Util {
	public static int clearDatabaseTable() {
		
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("delete * from books");
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
}
