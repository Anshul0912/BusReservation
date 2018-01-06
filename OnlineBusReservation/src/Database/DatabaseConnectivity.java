package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Busdata;
import model.Registration;
import model.TravellerDetails;

public class DatabaseConnectivity 
{
	
	Connection con;
	Statement stmt;

	public DatabaseConnectivity()  {

		  try {
			Class.forName("com.mysql.jdbc.Driver");
		    try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinereservation","root","root");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		    try {
				stmt=con.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		  } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	
	public void RegisterUser(Registration register)
	{
		System.out.println(register);
		  String query = "insert into registration values( '"+register.getUserID()+"','"+register.getFirstName()+"', '"+register.getLastName()+"'  , '"+register.getGender()+"' , '"+register.getDateOfBirth()+"', '"+register.getMobileNumber()+"', '"+register.getEmailID()+"', '"+register.getAge()+"' , '"+register.getPassword()+"', '"+register.getReenterPassword()+"' )";
		 
	      try {
			
	    	   stmt.executeUpdate(query);
		
	        }  
	           catch (SQLException e) {
			 
			   e.printStackTrace();
		} 
		
 	}
	
    public void travellerDetails(TravellerDetails travellerdetails)
    {
    	String query = "insert into travellerdetails values('"+travellerdetails.getFirstName()+"','"+travellerdetails.getLastName()+"',"+travellerdetails.getAge()+",'"+travellerdetails.getEmailId()+"',"+travellerdetails.getContactNumber()+",'"+travellerdetails.getNumberOfSeats()+"',"+travellerdetails.getBusId()+" )";
    	
    	try
    	{
    		stmt.executeUpdate(query);
    	}
         catch(SQLException e) 
    	{
        	 System.out.println(e.getMessage());
    	}
    	
    	
    }
    
    
    
	
	public boolean LoginUser(Registration register)
	{
		String query = "select * from registration where userID = '"+register.getUserID()+"' and password = '"+register.getPassword()+"'";
		
		try
		{
			 ResultSet rs=stmt.executeQuery(query);
			
			if(rs.next())
			{
			   return true;
			}
		   }
           
           catch (SQLException e) {
		   e.printStackTrace();
           }
		
		return false;
		
		
	}

	
	    public List sourceData() throws Exception
	    {
	     List<String> listdata = new ArrayList<String>();
	     String query = "select distinct source from busdata"; 
	     ResultSet rs=stmt.executeQuery(query);
	     
	     while(rs.next())
	     {
	    	 listdata.add(rs.getString("source"));
	      }
	     
	        return listdata;
	     }
	
	     
	    public List destinationData() throws Exception
	    {
			List<String> listdata = new ArrayList<String>();
			String query = "select distinct destination from busdata";
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next())
			{
				listdata.add(rs.getString("destination"));
			}
	    	
	    	 return listdata;
	     }
	    
	public boolean forgotPassword(Registration register) throws SQLException
	{
		String query = "select * from registration where userID = '"+register.getUserID()+"'";
		ResultSet st = stmt.executeQuery(query);
	    if(st.next())
	    	return true;
	    
	    return false;
		
	 }
	
	public List<Busdata> selectBus(Busdata busdata) throws SQLException
	{
		 List<Busdata> listdata = new ArrayList<Busdata>();
		 String query = "select * from busdata";
		 ResultSet rs = stmt.executeQuery(query);
		 while(rs.next())
		 {
		      Busdata busdata2=new Busdata();
		      busdata2.setBusId(rs.getString("busId"));
		      busdata2.setDeparture(rs.getString("departure"));
		      busdata2.setArrival(rs.getString("arrival"));
		      busdata2.setFare(rs.getString("fare"));
		 	  listdata.add(busdata2);
			 
		  }
		  return listdata;
	 }
	
	
	public List<Busdata> getSelectedBus(int busId) throws SQLException
  	{
		String query  = "select * from busdata where busId ="+busId;
	   	ResultSet rs = stmt.executeQuery(query);
	   	List<Busdata> listdata = new ArrayList<Busdata>();
	   	
	   	while(rs.next())
		{
	   		 Busdata busData = new Busdata();
	   		 busData.setBusId(rs.getString("busId"));
	   		 busData.setSource(rs.getString("source"));
	   		 busData.setDestination(rs.getString("destination"));
	   		 busData.setDeparture(rs.getString("departure"));
	   		 busData.setArrival(rs.getString("arrival"));
	   		 busData.setBusType(rs.getString("busType"));
	   		 busData.setOnwardDate(rs.getString("onwardDate"));
	   		 busData.setReturnDate(rs.getString("returnDate"));
	   		 busData.setFare(rs.getString("fare"));
	   		 busData.setSeats(rs.getInt("seat"));
	   		 
	   		 listdata.add(busData);
	   		
			
			
		}
		return listdata;
 	}
	
	public boolean newPassword(Registration register) throws SQLException
	{
		String query = "update registration set password='"+register.getPassword()+"' where  userID = '"+register.getUserID()+"'";
		int i = stmt.executeUpdate(query);
		if(i>0)
		{
			return true;
		 }
		
		 return false;
	 }
	
	public void confirmBooking(int busid,int seats) throws Exception
    {
    	Busdata busdata=getSelectedBus(busid).iterator().next();
    	
    	int totalseats=busdata.getSeats();
    	
    	if(seats<totalseats)
    	{
    		seats=totalseats-seats;
    		System.out.println(seats);
        	
    		String query = "update busdata set seat="+seats+" where  busId = "+busid;
    		stmt.executeUpdate(query);
    		
    		
    	}
    	
    	
    	
    }

 }
