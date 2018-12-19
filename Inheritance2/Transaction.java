package Inheritance2;

public abstract class Transaction {
	public abstract void withdraw(String account,String atmpin,int amount) throws Exception;
}
