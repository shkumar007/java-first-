package Interface;

public interface Human {
	public void sayhi();
}
class Male implements Human{
	String filename="hello sir welcome!!!!!!!!!!!!";
	@Override
	public void sayhi() {
		Iplayer ip=new Vlc();
		ip.play(filename);
		System.out.println(filename);
	}

}
class Female implements Human{
	String filename="hello madam welcome!!!!!!!!!";
	@Override
	public void sayhi() {
		Iplayer ip=new Windows();
		ip.play(filename);
		System.out.println(filename);
	}

}
