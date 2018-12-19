
package Inheritance1;

class Human {

	public void sayhi() {
		System.out.println("hi");
	} 
}
class Male extends Human{
	String filename="hello sir welcome!!!!!!!!!!!!";
	@Override
	public void sayhi() {
		Iplayer ip=new Vlc();
		ip.play(filename);
		System.out.println(filename);
	}

}
class Female extends Human{
	String filename="hello madam welcome!!!!!!!!!";
	@Override
	public void sayhi() {
		Iplayer ip=new Windows();
		ip.play(filename);
		System.out.println(filename);
	}

}