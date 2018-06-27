package ma.lydec.exercises.train;

import ma.lydec.exercises.train.exception.DesignException;

public final class TrainBuilder {
	
	private String trainDesign;
	
	public TrainBuilder(String trainDesign) {
		this.trainDesign= trainDesign;
	}
	
	public String build() throws DesignException {
		
		// throw exception if the design is not supported
		if(!trainDesign.matches(AppConstants.TRAIN_ALLOWED_DESIGN)) {
			throw new DesignException(AppConstants.DESIGN_ERROR_MESSAGE);
		}
		
		// build train
		StringBuilder train = new StringBuilder(AppConstants.HEAD_DESIGN);
		
		for(int i = 1; i < trainDesign.length(); i++) {
			train.append(AppConstants.SEPARTOR);
			train.append(AppConstants.PASSENGER_DESIGN);
		}
		
		return train.toString();
		
	}

}
