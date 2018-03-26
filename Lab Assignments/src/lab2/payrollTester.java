package lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import lab2.Education.Degree;
import lab2.Employee.Gender;
import lab2.Employee.Level;

public class payrollTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		/*---Initializing lists of employees--*/
		ArrayList<Staff> staffList = new ArrayList<Staff>();
		ArrayList<Faculty> facultyList = new ArrayList<Faculty>();
		ArrayList<Partime> partimeList = new ArrayList<Partime>();
		
		ArrayList<Employee> allEmployees = new ArrayList<Employee>();
		
		/*---Initializing Staff List----*/
		Staff allen = new Staff(50);
		allen.setName("Paita", "Allen");
		allen.setID("123");
		allen.setBD(2, 23, 59);
		allen.setGender(Gender.M);
		
		Staff steven = new Staff(35);
		steven.setName("Zapata", "Steven");
		steven.setID("456");
		steven.setBD(7, 12, 64);
		steven.setGender(Gender.F);
		
		Staff enrique = new Staff(40);
		enrique.setName("Rios", "Enrique");
		enrique.setID("789");
		enrique.setBD(6, 2, 70);
		enrique.setGender(Gender.M);
		
		staffList.add(allen);
		staffList.add(steven);
		staffList.add(enrique);
		
		allEmployees.add(allen);
		allEmployees.add(steven);
		allEmployees.add(enrique);
		
		
		System.out.println("\n---------------------PART A--------------------------");
		/*---Print Staff List----*/
		System.out.println("\n\nSTAFF: \n");
		for(Employee e : staffList)
		{
			System.out.println(e + "\n");
		}

		/*----Initializing Faculty list---*/
		Education eduA = new Education(Degree.PhD, "Engineering", 3);
		Faculty anne = new Faculty(Level.FU, eduA);
		anne.setName("Johnson", "Anne");
		anne.setID("243");
		anne.setBD(4, 27, 62);
		anne.setGender(Gender.F);
		
		Education eduW = new Education(Degree.PhD, "English", 1);
		Faculty will = new Faculty(Level.AO, eduW);
		will.setName("Bouris", "William");
		will.setID("791");
		will.setBD(3, 14, 75);
		will.setGender(Gender.F);
		
		Education eduC = new Education(Degree.MS, "Physical Education", 0);
		Faculty chris = new Faculty(Level.AS, eduC);
		chris.setName("Andrade", "Christopher");
		chris.setID("623");
		chris.setBD(5, 22, 80);
		chris.setGender(Gender.F);
		
		facultyList.add(anne);
		facultyList.add(will);
		facultyList.add(chris);
		
		allEmployees.add(anne);
		allEmployees.add(will);
		allEmployees.add(chris);
		
		/*---Print Staff List----*/
		System.out.println("\n\nFACULTY: \n");
		for(Employee e : facultyList)
		{
			System.out.println(e + "\n");
		}
		
		/*---Initializing Partime List---*/
		Partime aug = new Partime(30);
		aug.setName("Guzman", "Augusto");
		aug.setID("455");
		aug.setBD(8, 10, 77);
		aug.setHourlyRate(35);
		aug.setGender(Gender.F);
		
		Partime mart = new Partime(15);
		mart.setName("Depirro", "Martin");
		mart.setID("678");
		mart.setBD(9, 15, 87);
		mart.setHourlyRate(20);
		mart.setGender(Gender.F);
		
		Partime marq = new Partime(35);
		marq.setName("Aldaco", "Marque");
		marq.setID("945");
		marq.setBD(11, 24, 88);
		marq.setHourlyRate(30);
		marq.setGender(Gender.M);
		
		partimeList.add(aug);
		partimeList.add(mart);
		partimeList.add(marq);
		
		allEmployees.add(aug);
		allEmployees.add(mart);
		allEmployees.add(marq);
		
		System.out.println("\n\nPART-TIME: \n");
		for(Employee e : partimeList)
		{
			System.out.println(e + "\n");
		}
		
		
		/*----total monthly salaries--*/
		
		// for part time employees:
		double partimeSalary = 0.0;
		for(int i = 0; i < partimeList.size(); i++)
		{
			partimeSalary += partimeList.get(i).earning();
		}
		
		// for all employees:
		double totalSalary = partimeSalary;
		for(int i = 0; i < facultyList.size(); i++)
		{
			totalSalary += facultyList.get(i).monthlyEarning();
		}
		for(int i = 0; i < staffList.size(); i++)
		{
			totalSalary += staffList.get(i).monthlyEarning();
		}
		
		System.out.println("\n\n---------------------PART B--------------------------");
		System.out.printf("\nTotal monthly salary, Part-time staff: $%.2f\n", partimeSalary);
		System.out.println("\n\n---------------------PART C--------------------------");
		System.out.printf("Total monthly salary, all employees: $%.2f\n\n", totalSalary);

		
		/*-----display info ascending-----*/
		System.out.println("\n\n---------------------PART D--------------------------");
		System.out.println("\n\nALL EMPLOYEES, ASCENDING ID: \n");
		allEmployees.sort(new IDAscending());
		for(Employee e : allEmployees)
		{
			System.out.println(e + "\n");
		}
		
		/*-----display info descending-----*/
		System.out.println("\n\n---------------------PART E--------------------------");
		System.out.println("\n\nALL EMPLOYEES, DESCENDING NAME: \n");
		Collections.sort(allEmployees);
		for(Employee e : allEmployees)
		{
			System.out.println(e + "\n");
		}
		
		/*-----faculty clone------*/
		Faculty clone = (Faculty) anne.clone();
		System.out.println("\n\n---------------------PART F--------------------------");
		System.out.println("\n\nCLONING FACULTY OBJECT: \n");
		System.out.println("Original: \n\n" + anne + "\n");
		System.out.println("Clone: \n\n" + clone + "\n");
		
		//change education for testing
		System.out.println("\n\nTesting.. Updating Education... \n");
		Education newEdu = new Education(Degree.MS, "Mathematics", 2);
		anne.setEdu(newEdu);
		System.out.println("Original, Updated Education: \n\n" + anne + "\n");
		System.out.println("Clone: \n\n" + clone + "\n\n");
		
	}

}
