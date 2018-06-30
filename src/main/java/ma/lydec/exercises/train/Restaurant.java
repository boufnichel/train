package ma.lydec.exercises.train;

public class Restaurant extends TrainPart {

	@Override
	public String getCode() {
		return AppConstants.RESTAURANT_CODE;
	}

	@Override
	public String getShape() {
		return AppConstants.RESTAURANT_DESIGN;
	}

}
