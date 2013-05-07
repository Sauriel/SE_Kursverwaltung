public class Student {

	private String vorname;
	private String name;
	private int matrikelnummer;
	private String[] belegteKurse = new String[4];
	private int anzahlBelegteKurse = 0;
	

	public Student(String vorname, String name, int matrikelnummer) {
		this.vorname = vorname;
		this.name = name;
		this.matrikelnummer = matrikelnummer
	}
	
	public String toString() {
		return "Name: " + vorname + " " + name + ", Matrikelnummer: " + matrikelnummer;
	}
	
	public void kursBelegen(String kursname) {
		if (belegteKurse < 4) {
			belegteKurse[anzahlBelegteKurse] = kursname;
			anzahlBelegteKurse++;
		} else {
			System.out.println("Du hast " + anzahlBelegteKurse + " Kurse belegt, das ist die maximale Anzahl.");
		}
	}
	
	
	public static void main(String[] args) {
		Student tester = new Student("Max", "Mustermann", 1234567);
		System.out.println(tester.toString());
	}
}
