package assignment0001;

public class CommisionSalaryEmployee extends AbstractEmployee {
	


	private double employeeSalary;
	public CommisionSalaryEmployee(String employeeName, String employeeNID, double employeeSalary) {
		super(employeeName, employeeNID);
		// TODO Auto-generated constructor stub
		this.employeeSalary=employeeSalary;
	}



	
	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}




	@Override
	public double calculateSalary() {
		double total=0;
		if( getEmployeeSalary()>20000){
			total=getEmployeeSalary()+getEmployeeSalary()*0.15;
			
		}
		else if( getEmployeeSalary()>10000){
			total=getEmployeeSalary()+getEmployeeSalary()*0.6;
			
		}
		else{
			total=getEmployeeSalary();
		}
		return total;
		
	}
	
	
}
