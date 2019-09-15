package pl.altkom.zad7_1;

// klasa testowa
public class Test {

	// metoda glowna
	public static void main(String[] args) {
		Employee emp = new Manager("Adam");
		System.out.println(emp.getInfo());
		System.out.println(emp.getEmployeeInfo());
	}
}
