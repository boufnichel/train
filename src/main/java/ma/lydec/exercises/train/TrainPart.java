package ma.lydec.exercises.train;

/**
 * Train part abstract class
 * 
 * @author moboufnichel
 *
 */
public abstract class TrainPart {
	
	public abstract String getCode();
	public abstract String getShape();
	
	@Override
	public String toString() {
		return getShape();
	}
	
	
}
