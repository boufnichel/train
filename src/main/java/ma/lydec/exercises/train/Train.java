package ma.lydec.exercises.train;

public class Train {

	private TrainBuilder trainBuilder;
	
	public Train(String structure) {
		trainBuilder = new TrainBuilder(structure);
	}

	public String print(){
		return trainBuilder.build();
	}

	public void detachEnd() {
		trainBuilder.detachEnd();
	}

	public boolean fill() {
		return trainBuilder.fill();
	}
}
