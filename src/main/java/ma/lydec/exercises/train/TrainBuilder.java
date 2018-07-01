package ma.lydec.exercises.train;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.common.base.Joiner;

public final class TrainBuilder {
	
	private String trainDesign;
	private List<TrainPart> parts;
	
	public TrainBuilder(String trainDesign) {
		this.trainDesign= trainDesign;
		// verify design
		verifyTrainDesign();
		
		// create train parts without content
		createParts();
		
	}
	
	/**
	 * Build train with all parts
	 */
	public String build() {
		
		// build train

		StringBuilder train = new StringBuilder();
		
		for(Iterator<TrainPart> trainPartIterator = parts.iterator(); trainPartIterator.hasNext();) {
			train.append(trainPartIterator.next());
		}
		
		Joiner joiner = Joiner.on(AppConstants.SEPARTOR);
		return joiner.join(parts);
	}
	
	public void detachEnd() {
		boolean isQueueExist = parts.get(parts.size()-1) instanceof End;
		if(isQueueExist)
			parts.remove(parts.size()-1);
		else {
			parts.remove(0);
		}
	}

	public boolean fill() {
		for(Iterator<TrainPart> trainPartIterator = parts.iterator(); trainPartIterator.hasNext();) {
			TrainPart trainPart = trainPartIterator.next();
			if(trainPart instanceof Fillable ) {
				Fillable fillable = ((Fillable) trainPart);
				if(!fillable.isFilled()) {
					fillable.fill();
					break;
				}
			}
		}
		
		
		return false;
	}
	
	private void createParts() {
		// build train parts
		parts = new ArrayList<>();
		for(int i = 0; i < trainDesign.length(); i++) {
			if(AppConstants.HEAD_CODE.equals(String.valueOf(trainDesign.charAt(i)))) {
				if(i == 0) {
					parts.add(new Head());
				} else {
					parts.add(new End());
				}
			} 
			else if(AppConstants.PASSENGER_CODE.equals(String.valueOf(trainDesign.charAt(i)))) {
				parts.add(new PassengerPart());
			} 
			else if(AppConstants.RESTAURANT_CODE.equals(String.valueOf(trainDesign.charAt(i)))) {
				parts.add(new Restaurant());
			} 
			else if(AppConstants.CARGO_CODE.equals(String.valueOf(trainDesign.charAt(i)))) {
				parts.add(new Cargo());
			} 
			
		}
	}
	
	private void verifyTrainDesign() {
		// log error if the design is not supported
		if(!TrainDesignVerifier.isDesignValid(trainDesign)) {
			System.err.println(AppConstants.DESIGN_ERROR_MESSAGE);
		}
	}

}
