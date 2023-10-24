package model.exceptions;

public class WithdrawOutOfBound extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public WithdrawOutOfBound(String msg) {
		super(msg);
	}
}
