public class Student {

	private String vorname;
	private String name;
	private int matrikelnummer;
	

	public Student(String vorname, String name, int matrikelnummer) {
		this.vorname = vorname;
		this.name = name;
		this.matrikelnummer = matrikelnummer
	}
	
	public String toString() {
		return "Name: " + vorname + " " + name + ", Matrikelnummer: " + matrikelnummer;
	}
	
	
	public static void main(String[] args) {
		Student tester = new Student("Max", "Mustermann", 1234567);
		System.out.println(tester.toString());
	}
}
