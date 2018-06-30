package ma.lydec.exercises.train;

public final class Cargo extends TrainPart implements Fillable {

	private String content = AppConstants.CARGO_DESIGN;
	@Override
	public String getCode() {
		return AppConstants.CARGO_CODE;
	}

	@Override
	public String getShape() {
		return content;
	}

	@Override
	public void fill() {
		content= AppConstants.CARGO_DESIGN_FILLED;
	}
	
	@Override
	public boolean isFilled() {
		return AppConstants.CARGO_DESIGN_FILLED.equals(content);
	}

}
