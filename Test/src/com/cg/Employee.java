package com.cg;

import java.util.Arrays;
import java.util.Comparator;

class Employee implements Comparable<Employee>
{

	private int id;
    private String name;
    private int age;
    private long salary;
    
    
    public int getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public long getSalary()
    {
        return salary;
    }

	public Employee(int id, String name, int age, int salary) 
	 {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	 }
	
	public static void main(String[] args) 
	{
		
	Employee[] empArr = new Employee[4];
	empArr[0]=new Employee(10, "Mikey", 25, 10000);
	empArr[1]=new Employee(20, "Arun", 29, 20000);
	empArr[2]=new Employee(5, "Lisa", 35, 5000);
	empArr[3]=new Employee(1, "Pankaj", 32, 50000);
	Arrays.sort(empArr);
	System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));
	
}

	@Override
	public int compareTo(Employee emp)
	{
		return (this.id - emp.id);	
		
	}
	
	 @Override
	    //this is required to print the user-friendly information about the Employee
	    public String toString()
	    {
	        return "[id=" + this.id + ", name=" 
	       + this.name + "\n"
	       + " age=" + this.age + "\n"
	       	+ " salary=" + this.salary + "]";
	    }
	 
	 
	 
	 /**
	     * Comparator to sort employees list or array in order of Salary
	     */
	    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {

	        @Override
	        public int compare(Employee e1, Employee e2) 
	        {
	            return (int) (e1.getSalary() - e2.getSalary());
	        }
	    };
	    
	    /**
	     * Comparator to sort employees list or array in order of Name
	     */
	    public static Comparator<Employee> NameComparator = new Comparator<Employee>()
	    {

	        @Override
	        public int compare(Employee e1, Employee e2) 
	        {
	            return e1.getName().compareTo(e2.getName());
	            
	        }
	    };
	}

	
	
	
