package Interface2;


public class Appclient {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Itransaction it=new Sbibank();
		it.withdraw("125",null, 100);
		
	}
}
