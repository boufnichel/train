package ma.lydec.exercises.train;

import ma.lydec.exercises.train.exception.DesignException;

public class Train {

	private String trainDesign;
	
	public Train(String structure) {
		trainDesign = structure;
	}

	public String print(){
		try {
			return new TrainBuilder(trainDesign).build();
		} catch (DesignException e) {
			e.printStackTrace();
			return null;
		}
	}
}
