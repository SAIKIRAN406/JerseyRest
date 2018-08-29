package com.nit.Beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="employee")
@XmlType(propOrder={"empno","empname","empdesig"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee implements Serializable {
	@XmlAttribute
	private int empno;
	@XmlElement
	private String empname;
	@XmlElement
	private String empdesig;
	
	public Employee(){
		
	}
	public Employee(int empno, String empname, String empdesig) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.empdesig = empdesig;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdesig() {
		return empdesig;
	}
	
	public void setEmpdesig(String empdesig) {
		this.empdesig = empdesig;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + ", empdesig=" + empdesig + "]";
	}
	
	
	



	}


