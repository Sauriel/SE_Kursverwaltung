public class Dozent {
	private String Vorname, Nachname;
	private int personalNr;
	
	
	public Dozent(String Vorname, String Nachname, int personalNr){
		this.Vorname = Vorname;
		this.Nachname = Nachname;
		this.personalNr = personalNr;
	}
	public String toString(){
		return ""+Nachname+", "+Vorname+" ("+personalNr+")";
	}
}