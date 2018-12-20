package Interface3;

public class Word extends Get implements Iprinter {

	public void print() {
		System.out.println(" hi am in word print method");
		
		open();
		close();
	}

	@Override
	public void read() {
		System.out.println(" hi am in word read method");
		open();
		close();
		// TODO Auto-generated method stub
		
	}
}
