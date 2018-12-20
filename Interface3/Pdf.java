package Interface3;

public class Pdf extends Get implements Iprinter {

	@Override
	public void print() {
		open();
		System.out.println(" hi am in pdf print method printing the content ");
		close();
	}

	@Override
	public void read() {
		open();
		System.out.println(" hi am in pdf print method reding the content");
		close();
		// TODO Auto-generated method stub
		
	}

	

	
}
