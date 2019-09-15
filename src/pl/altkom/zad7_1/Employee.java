package pl.altkom.zad7_1;

// klasa reprezentujaca pracownika
public class Employee {
	// atrybuty
	private String name; // imie
	private int salary = 10_000; // zarobki
	private String info; // opis

	// konstruktor inicjujacy dane pracownika
	public Employee(String name) {
		this.name = name;
		this.info = getInfo();
	}

	// metoda zwracajaca opis (dane) pracownika
	public String getInfo() {
		return this.name + ", salary: " + salary;
	}

	// metoda dostepowa zwracajaca pole opisu pracownika (inicjowane w
	// konstruktorze)
	public String getEmployeeInfo() {
		return info;
	}
}
