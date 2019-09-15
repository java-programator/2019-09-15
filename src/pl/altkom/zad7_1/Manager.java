package pl.altkom.zad7_1;

// klasa menedzera (rozszerzenie klasy pracownika)
// (menedzer te� jest pracownikiem)
public class Manager extends Employee {
	private String responsibility = "Java"; // odpowiedzialnosc (cecha
	                                        // wyrozniajaca menedzera sposrod
	                                        // pracownikow)

	// poprzez konstruktor podajemy tylko imie menedzera
	public Manager(String name) {
		super(name); // wywolanie konstruktora nadklasy (pracownika)
	}

	// przedefiniowanie metody informacyjnej
	// uzupelnia informacje o pracowniku o odpowiedzialnosc
	@Override
	public String getInfo() {
		return super.getInfo() + ", responsibility: " + responsibility;
	}
}
