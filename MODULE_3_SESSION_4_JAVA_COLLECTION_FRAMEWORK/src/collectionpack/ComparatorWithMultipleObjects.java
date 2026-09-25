package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Department{
	private int departmentId;
	private String deptName;
	public Department(int departmentId, String deptName) {
		this.departmentId = departmentId;
		this.deptName = deptName;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
}

class Staff{
	private int empId;
	private String empName;
	private double empSalary;
	private Department department;
	public Staff(int empId, String empName, double empSalary, Department department) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.department = department;
	}
	public int getEmpId() {
		return empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public double getEmpSalary() {
		return empSalary;
	}
	
	public Department getDepartment() {
		return department;
	}
	
}

//============Salary comparator============

class SalaryComparator implements Comparator<Staff>{

	@Override
	public int compare(Staff o1, Staff o2) {
		
		return Double.compare(o1.getEmpSalary(), o2.getEmpSalary());
	}
	
}

//============Department comparator============

class DepartmentComparator implements Comparator<Staff>{

	@Override
	public int compare(Staff o1, Staff o2) {
//		return o1.getDepartment().getDeptName().compareTo(o2.getDepartment().getDeptName());
		
		int result = o1.getDepartment().getDeptName().compareTo(o2.getDepartment().getDeptName());
		
		if(result == 0) {
			return Double.compare(o2.getEmpSalary(), o1.getEmpSalary());
		}
		return result;
	}
	
}

public class ComparatorWithMultipleObjects {

	public static void main(String[] args) {
		
		Department deptOne = new Department(100, "IT");
		Department deptTwo = new Department(103, "HR");
		Department deptThree = new Department(102, "FINANCE");

		ArrayList<Staff> employeeList = new ArrayList<Staff>();
		employeeList.add(new Staff(200, "DHAMU", 50000, deptOne));
		employeeList.add(new Staff(180, "RAMU", 54000, deptThree));
		employeeList.add(new Staff(200, "SAM", 40000, deptTwo));
		employeeList.add(new Staff(200, "SHAMBU", 51000, deptOne));
		employeeList.add(new Staff(200, "SHIBU", 20000, deptOne));
		
		System.out.println("Sort Employees based on Salary: ");
		Collections.sort(employeeList, new SalaryComparator());
		for(Staff e : employeeList) {
			System.out.println(e.getEmpId() + " " + e.getEmpName() + " " + e.getEmpSalary() + " " + e.getDepartment().getDeptName());
		}
		
		System.out.println("Sort Employees based on Department: ");
		Collections.sort(employeeList, new DepartmentComparator());
		for(Staff e : employeeList) {
			System.out.println(e.getEmpId() + " " + e.getEmpName() + " " + e.getEmpSalary() + " " + e.getDepartment().getDeptName());
		}
	}

}
