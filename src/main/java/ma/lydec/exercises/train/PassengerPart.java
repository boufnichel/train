package ma.lydec.exercises.train;

public class PassengerPart extends TrainPart{

	@Override
	public String getCode() {
		return AppConstants.PASSENGER_CODE;
	}

	@Override
	public String getShape() {
		return AppConstants.PASSENGER_DESIGN;
	}

}
