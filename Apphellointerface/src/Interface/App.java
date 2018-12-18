package Interface;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
Human h;
String sensorinput="feMale";
if(sensorinput.equalsIgnoreCase("male")) {
		h=new Male();
		
	}
else 
{
	h=new Female();
}
h.sayhi();
	
	}


	}


