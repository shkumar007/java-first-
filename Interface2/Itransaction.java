package Interface2;

public interface Itransaction {
	public abstract void withdraw(String account,String atmpin,int amount) throws Exception;
}
