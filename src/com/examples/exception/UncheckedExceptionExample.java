package com.examples.exception;

public class UncheckedExceptionExample extends RuntimeException {
	private static final long serialVersionUID = -179377974530785075L;

	public UncheckedExceptionExample() {
		super();
	}
	
	public UncheckedExceptionExample(String msg) {
		super(msg);
	}
	
	public UncheckedExceptionExample(String msg, Throwable cause) {
		super(msg, cause);
	}
	
	public UncheckedExceptionExample(Throwable cause) {
		super(cause);
	}
}
