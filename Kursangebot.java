
public class Kursangebot {
	
	private String [] kursname = new String [5];  
	private final int MAXUSER = 100;
		
	
	public Kursangebot (){
	kursname [0] = "Programmieren 2";
	kursname [1] = "Software Engineering";
	kursname [2] = "Mathe 1";
	kursname [3] = "Netzwerktechnik / Internet";
	kursname [4] = "Camera Acting";
	}
	
	public String toString(){
		String rueckgabe ="Kurse: ";
		for (int i = 0; i <kursname.length; i++){
			rueckgabe += kursname[i]+ ", ";
		} 
		return rueckgabe;
	}
	
}
