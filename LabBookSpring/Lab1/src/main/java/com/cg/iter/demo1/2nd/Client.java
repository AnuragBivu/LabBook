package com.cg.iter.demo1.2nd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring2.xml");
	Employee emp=context.getBean("emp",Employee.class);
	System.out.println("Employee Details");
	System.out.println("-------------------------");
	System.out.println("Employee {EmployeeAge="+emp.getAge()+", EmployeeId="+emp.getEmployeeId()+", EmployeeName="+emp.getEmployeeName()+", EmployeeSalary="+emp.getSalary()+"}");
	System.out.println("sbu details=SBU {sbuCode="+emp.getBusinessUnit().getSbuName()+", sbuHead="+emp.getBusinessUnit().getSbuHead()+", sbuName="+emp.getBusinessUnit().getSbuName()+"}");
	
	
}
}
