package ma.lydec.exercises.train;

public final class TrainBuilder {
	
	private String trainDesign;
	private String train;
	
	public TrainBuilder(String trainDesign) {
		this.trainDesign= trainDesign;
	}
	
	public void build() {
		
		// throw exception if the design is not supported
		if(!trainDesign.matches(AppConstants.TRAIN_ALLOWED_DESIGN)) {
			System.err.println(AppConstants.DESIGN_ERROR_MESSAGE);
		}
		
		// build train
		StringBuilder train = new StringBuilder(AppConstants.HEAD_DESIGN);
		
		for(int i = 1; i < trainDesign.length(); i++) {
			train.append(AppConstants.SEPARTOR);
			if(AppConstants.PASSENGER_CODE.equals(String.valueOf(trainDesign.charAt(i)))) {
				train.append(AppConstants.PASSENGER_DESIGN);
			} else if(AppConstants.RESTAURANT_CODE.equals(String.valueOf(trainDesign.charAt(i)))) {
				train.append(AppConstants.RESTAURANT_DESIGN);
			} else if(AppConstants.HEAD_CODE.equals(String.valueOf(trainDesign.charAt(i)))) {
				train.append(AppConstants.END_DESIGN);
			}
			
		}
		this.train = train.toString();
	}
	
	public String print() {
		return this.train;
	}

	public void detachEnd() {
		if(trainDesign.endsWith(AppConstants.HEAD_CODE) && train.endsWith(AppConstants.END_DESIGN)) {
			train = train.replace(AppConstants.SEPARTOR+AppConstants.END_DESIGN, AppConstants.EMPTY);
		}
		else if(trainDesign.startsWith(AppConstants.HEAD_CODE)) {
			train = train.replace(AppConstants.HEAD_DESIGN+AppConstants.SEPARTOR, AppConstants.EMPTY);
		}
	}

}
