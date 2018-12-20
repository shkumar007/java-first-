package Interface3;

public class Generateobjects {

	static Iprinter ggg(String format) {
		if(format.equalsIgnoreCase("pdf"))
			return new Pdf();
		else
			return new Word();
	} 
	
}
