package ma.lydec.exercises.train;

public final class TrainDesignVerifier {
	
	public static boolean isDesignValid(String trainDesign) {
		// throw exception if the design is not supported
		if(!trainDesign.matches(AppConstants.TRAIN_ALLOWED_DESIGN)) {
			return false;
		}
		return true;
	}

}
