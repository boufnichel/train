package ma.lydec.exercises.train.exception;

public class DesignException extends Exception {

	private static final long serialVersionUID = 1L;

	public DesignException() {
		super();
	}

	public DesignException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DesignException(String message, Throwable cause) {
		super(message, cause);
	}

	public DesignException(String message) {
		super(message);
	}

	public DesignException(Throwable cause) {
		super(cause);
	}

	
}
