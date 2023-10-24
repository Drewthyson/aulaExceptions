package model.exceptions;

public class BalanceOutOfBound extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public BalanceOutOfBound(String msg) {
		super(msg);
	}
}
