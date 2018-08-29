package com.nit.resource;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.nit.Beans.Employee;
import com.nit.Serrvice.EmployeeService;
import com.nit.Serrvice.EmployeeServiceFactory;
import com.nit.Util.JsonUtil;

/*@Path("/HelloController")
public class HelloController {

	@GET
	@Path("/displayHello")
	@Produces("application/html")
	@Consumes("application/html")
	public String displayHello(){
		String s= "HelloWorld";
		//return Response.status(1).entity(s).build();
		//return Response.ok(s).build();
	return s;		
	}*/
@Path("/Employees")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class EmployeeResource {
	Map<Integer,Object> map;
	private Employee emp;
	@GET
	public String getEmployess() {
		map= EmployeeServiceFactory.getinstance().getAllEmployees();
	return	JsonUtil.convertJavatoJson(map);
	}
	@POST
	public String insertEmployee(Employee employee) {
		map=EmployeeServiceFactory.getinstance().addEmployee(employee);
		return JsonUtil.convertJavatoJson(map);
	}
	@PUT
	@Path("/{no}")
		public String updateEmployee(@PathParam("no") int no,Employee emp) {
		map=EmployeeServiceFactory.getinstance().updateEmployee(no, emp);
		return JsonUtil.convertJavatoJson(map);
	}
	@DELETE
	@Path("/{empno}")
	public void deleteEmployee(@PathParam("empno") int empno){
		EmployeeServiceFactory.getinstance().deleteEmployee(empno);
		
	}
	@GET
	@Path("{id}")
	public String getEmployeebyId(@PathParam("no") int no){
		map=(Map)EmployeeServiceFactory.getinstance().getEmployeebyId(no);
		return JsonUtil.convertJavatoJson(emp);
	}
	
}  
	  
	 /* @GET
	 //@Path("/getEmployeebyDesig")
	  @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	  @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	  public Employee getEmployeeByDesig(@QueryParam("desig") String desig){ 
		  Employee e1 =new Employee(); 
		  if(desig!=null && desig.equals("SSE")){
	 * e1.setEmpno(102); e1.setEmpname("Kiran"); e1.setEmpdesig("SSE"); return
	 * e1; // return Response.ok(e1).status(201).build(); } else{ //return
	 * Response.status(400).build(); return null; }
	 * 
	 * }
	 */
/*@GET
@Path("{name}")
public Employee getEmployeeByName(@PathParam("name") String name) {
	if (name != null && name.equals("Sai")) {
		Employee e = new Employee(101, name, "SE");
		e.setEmpno(101);
		e.setEmpname(name);
		e.setEmpdesig("SE");
		return e;
	
	} else {
		return null;
	
	}
}*/

