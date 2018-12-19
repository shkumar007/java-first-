package Inheritance2;


public class Sbibank extends Transaction{

		@Override
		public void withdraw(String account, String atmpin, int amount) throws Exception {
			
			try {
				//int data=500/0;
			int x= atmpin.length();
				System.out.println("i am in withdraw try");
			}
			
			catch(Exception e)
			{
				throw new Exception("Hello sir amount will be refunded to your account with in a day");
			
				//System.out.println(e);
			}
		}
		
	
}
