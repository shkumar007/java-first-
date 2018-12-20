package Mathlabprograms;

public class Seperaterealandimaginaryparts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="2.6+3.9i";
		String st[]=s.split("\\+");
		double real=0;
		double image=0;
		for (int i = 0; i < st.length; i++) {
			if(st[i].contains("i")) {
                 String str=st[i].replace("i", "");	
               
                 image=Double.parseDouble(str);
			}
			else {
				real=Double.parseDouble(st[i]);;
			}
			
		}
		
		System.out.println(real);
		System.out.println(image);
		
	}

}
