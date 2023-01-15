package Pertemuan2;

public class Utility {

	private static Utility instance;

	public static Utility getInstance() {
		
		if (instance == null) {
			instance = new Utility();
		}
		
		return instance;
		
	}
	
	public String addS(String input) {
		return input + "s";
	}
		
}