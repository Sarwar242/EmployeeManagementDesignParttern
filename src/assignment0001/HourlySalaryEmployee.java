package assignment0001;

public class HourlySalaryEmployee extends AbstractEmployee{

	private double workinghour;
	
	public HourlySalaryEmployee(String employeeName, String employeeNID,double workinghour ) {
		super(employeeName, employeeNID);
		
		setWorkingHour(workinghour);
	}
	
	public void setWorkingHour(double workinghour ) {
		this.workinghour = workinghour;
	}
	public double getWorkingHour() {
		return workinghour;
	}

	@Override
	public double calculateSalary() {
		double sal = 0.0;
		
		if( getWorkingHour()>168){
			sal= getWorkingHour()*120;
		}
		else{
			sal=getWorkingHour()*80;
		}
		return sal;
		
	}
}
