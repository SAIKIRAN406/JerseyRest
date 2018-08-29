package com.nit.Client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.filter.LoggingFilter;

import com.nit.Beans.Employee;

public class ClientTest {
	private static final String CLIENT_URL = "http://localhost:9841/HelloJersey/";
	 static String jsonResponse = null;
	 static  Employee empl;
	 static  int id=0;
	
		public static Response getEmployees(){
	    Client client = ClientBuilder.newClient( );
	 	WebTarget target = client.target(CLIENT_URL).path("/Employees");
	 	Invocation.Builder   Builder =  target.request(MediaType.APPLICATION_JSON);
	 			Builder.accept(MediaType.APPLICATION_JSON);
	 			Response response=	Builder.get(Response.class);
	 	System.out.println(response.getStatus());
	 	 System.out.println(response.getStatusInfo());
	 System.out.println(response.readEntity(String.class));
	return response;
	 
	    }
		
		public static Response insertEmployee(Employee empl){
			Client client = ClientBuilder.newClient( );
		 	WebTarget target = client.target(CLIENT_URL).path("/Employees");
			// empl = new Employee(103, "Raju", "DB");
			Invocation.Builder   Builder =  target.request(MediaType.APPLICATION_JSON);
 			Builder.accept(MediaType.APPLICATION_JSON);
			Response response = Builder.post(Entity.entity(empl, MediaType.APPLICATION_JSON),Response.class);
 			System.out.println(response.getStatus());
 		 	 System.out.println(response.getStatusInfo());
 		 System.out.println(response.readEntity(String.class));
 		return response;	
		}
		
		
		public static Response updateEmployee(Employee empl){
			Client client = ClientBuilder.newClient( );
		 	WebTarget target = client.target(CLIENT_URL).path("/Employees").path("101");
		// empl = new Employee(101, "HAri", "TL");
			empl = new Employee();
			empl.setEmpname("HAri");
			empl.setEmpdesig("TL");
			Invocation.Builder   Builder =  target.request(MediaType.APPLICATION_JSON);
 			Builder.accept(MediaType.APPLICATION_JSON);
			Response response = Builder.put(Entity.entity(empl, MediaType.APPLICATION_JSON),Response.class);
 			System.out.println(response.getStatus());
 		 	 System.out.println(response.getStatusInfo());
 		 System.out.println(response.readEntity(String.class));
 		return response;	
		}
		
		
		public static Response deleteEmployee(int id){
			Client client = ClientBuilder.newClient( );
		 	WebTarget target = client.target(CLIENT_URL).path("/Employees").path("101");
			Invocation.Builder   Builder =  target.request(MediaType.APPLICATION_JSON);
 			Builder.accept(MediaType.APPLICATION_JSON);
			Response response = Builder.delete(Response.class);
 			System.out.println(response.getStatus());
 		 	 System.out.println(response.getStatusInfo());
 		 System.out.println(response.readEntity(String.class));
 		return response;	
		}
		public static void main(String[] args) {
			getEmployees();
			insertEmployee(empl);
			updateEmployee(empl);
			deleteEmployee(id);
			
		}	
		
		

	    }
	









		/*Client client = ClientBuilder.newClient(new ClientConfig().register(LoggingFilter.class));
		  client.target(CLIENT_URL).path("getMessage").path("sai");
		Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.get();
		Employee employee = response.readEntity(Employee.class);
		//JsonUtil
		//System.out.println(response.getStatus() + " :" + response.getEntity());
		
	
	}
	public static void main(String[] args) {
		getEmployee();*/
/*The following Method is to Retrieve Employee  */
/*public static void getEmployee() {
	
	Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_XML);
	Response response = invocationBuilder.put(Entity.entity(emp, MediaType.APPLICATION_XML));
	 
	Employee employee = response.readEntity(Employee.class);
	     
	System.out.println(response.getStatus());
	System.out.println(employee);
	 
	Output:*/
	/*}
}
}*/