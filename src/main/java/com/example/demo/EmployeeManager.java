package com.example.demo;



import org.springframework
	.stereotype
	.Repository;

@Repository

// Class to create a list
// of employees
public class EmployeeManager
 {

	private static Employees list
		= new Employees();

	// This static block is executed
	// before executing the main
	// block
	static
	{

		// Creating a few employees
		// and adding them to the list
		list.getEmployeeList().add(
			new Employee(
				1,
				"Prem",
				"Tiwari",
				"chapradreams@gmail.com",
                "Developer"));

		list.getEmployeeList().add(
			new Employee(
				2, "Vikash",
				"Kumar",
				"abc@gmail.com",
                "Analyst"));

		list.getEmployeeList().add(
			new Employee(
				3, "Ritesh",
				"Ojha",
				"asdjf@gmail.com",
                "Engineer"));

		 
	}

	// Method to return the list
	public Employees getAllEmployees()
	{

		return list;
	}

	 
		// Method to add an employee
		// to the employees list
		public void
		addEmployee(Employee employee)
	{
		list.getEmployeeList()
			.add(employee);
		 
	}

    //Method to update an employee data using id
    public void updateEmployee(String id, Employee entity){
        //List<Employee> templist=list.getEmployeeList();
        for(int i=0;i<list.getEmployeeList().size();i++)
        {
            if(list.getEmployeeList().get(i).getId().equals(Integer.parseInt(id)))
            {
                list.getEmployeeList().set(i, entity);
                break;
            }
        }
        
    }


    public void deleteEmployee(String id) {
        list.getEmployeeList().removeIf(t -> t.getId().equals(Integer.parseInt(id)));
    }
}
