package org.jsp.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainClass {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("CRUD_Operation");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		Scanner scanner= new Scanner(System.in);
		Employee employee= new Employee();
		
		while(true) {
			System.out.println("1. For Inserting the data into DataBase");
			System.out.println("2.For Retreving the data from DataBase using Employee ID");
			System.out.println("3.For Updating the employee salary by using the Employee ID");
			System.out.println("4.Deleting the employee details using Employee ID");
			System.out.println("5.To exit");
			System.out.println("Choose the option which u want");
			int choose=scanner.nextInt();
			switch(choose) {
			case 1:
				entityManager.getTransaction().begin();
				
				System.out.println("Enter Employee ID");
				employee.setEmpId(scanner.nextInt());
				
				System.out.println("Enter Employee Name");
				employee.setEmpName(scanner.next());
				
				System.out.println("Enter Employee Salary");
				employee.setEmpSalary(scanner.nextDouble());
				
				entityManager.persist(employee);
				entityManager.getTransaction().commit();
				
				break;
			/*case 2:
				entityManager.getTransaction().begin();*/
			case 2:
				entityManager.getTransaction().begin();
				
				System.out.println("Enter Employee ID");
				int empid=scanner.nextInt();
				Employee read= entityManager.find(Employee.class, empid);
				System.out.println(read);
				entityManager.getTransaction().commit();
				
				break;
			case 3:
				entityManager.getTransaction().begin();
				
				System.out.println("Enter Employee ID");
				int empid1=scanner.nextInt();
				Employee update= entityManager.find(Employee.class, empid1);
				System.out.println("Enter the salary to change");
				update.setEmpSalary(scanner.nextDouble());
				System.out.println(update);
				System.out.println("Entered data has updated in the Data Base");
				entityManager.getTransaction().commit();
				
				break;
			case 4:
				entityManager.getTransaction().begin();
				
				System.out.println("Enter Employee ID");
				int empid2=scanner.nextInt();
				Employee remove= entityManager.find(Employee.class, empid2);
				entityManager.remove(remove);
				System.out.println(remove);
				System.out.println("Retrived data has been Droped in DataBase");
				entityManager.getTransaction().commit();
				
				break;
			case 5:
				System.exit(0);
				
			default:
				System.out.println("Please enter the valid number within the range");
			
				scanner.close();
			}
		}
		
	}
}
