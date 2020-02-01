package assignment0001;

public class EmployeeManage {
	public static void main(String[] args) {
		System.out.println("Design Pattern: Strategy\n\n");
		
		EmployeeObject employeeObject= new EmployeeObject("Md. ", "5697485", 12000);
		FixedSalaryEmployee abstractEmployee=new FixedSalaryEmployee("Md. ", "5697485", 12000);
		abstractEmployee.calculateSalary();
		employeeObject.salaryOfEmployee();
		
		HourlySalaryEmployee hourlysal=new HourlySalaryEmployee("sd. ", "5697485",200);
		EmployeeObject employeeObject2= new EmployeeObject("Md. ", "5697485", hourlysal.calculateSalary());
		employeeObject2.salaryOfEmployee();
		
		CommisionSalaryEmployee comission=new CommisionSalaryEmployee("fd. ", "5697485", 12000);
		EmployeeObject employeeObject3= new EmployeeObject("Md. ", "5697485", comission.calculateSalary());
		employeeObject3.salaryOfEmployee();
	}

}
