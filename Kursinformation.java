public class Kursinformation {
	
	private String daten;
	private String angebot;
	private String voraussetzungen;
	
	public Kursinformation(String daten, String angebot, String voraussetzungen) {
		this.daten = daten;
		this.angebot = angebot;
		this.voraussetzungen = voraussetzungen;
	}
	
	public String getDaten() {
		return daten;
	}
	
	public String getVoraussetzungen() {
		return voraussetzungen;
	}
	
	public void setAngebot(String angebot) {
		this.angebot = angebot;
	}
	
	public String toString() {
		return ("Daten: " + daten + "\nAngebot: " + angebot + "\nVoraussetzungen: " + voraussetzungen);
	}
	
	public static void main(String[] args) {
		Kursinformation k = new Kursinformation("a", "b", "c");
		System.out.println(k.toString());
	}
}
