public class EmployeeTest
{
    
	public static void main(String[] args) {
	    Employee emp1 = new Employee("John", "Doe", 3000);
	    Employee emp2 = new Employee("Jane", "Doe", 4000);
	    System.out.println("Before the 10% salary increase:\n");
	    System.out.print(emp1.getFirstName() + " " + emp1.getLastName());
	    System.out.printf("’s monthly salary is $%.0f and his yearly salary is $%.0f.\n", emp1.getMontlySalary(), emp1.getMontlySalary()*12);
	    
	    System.out.print(emp2.getFirstName() + " " + emp2.getLastName());
	    System.out.printf("’s monthly salary is $%.0f and his yearly salary is $%.0f.\n", emp2.getMontlySalary(), emp2.getMontlySalary()*12);
	    
	    emp1.setMonthSalary(10.00);
	    emp1.setMonthSalary(10.00);
	    
	    System.out.println("\nAfter the 10% salary increase:\n");
	    System.out.print(emp1.getFirstName() + " " + emp1.getLastName());
	    System.out.printf("’s monthly salary is $%.0f and his yearly salary is $%.0f.\n", emp1.getMontlySalary(), emp1.getMontlySalary()*12);
	    
	    System.out.print(emp2.getFirstName() + " " + emp2.getLastName());
	    System.out.printf("’s monthly salary is $%.0f and his yearly salary is $%.0f.\n", emp2.getMontlySalary(), emp2.getMontlySalary()*12);
	    
	}
	
	
}




