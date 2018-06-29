package ma.lydec.exercises.train;

public class Train {

	private TrainBuilder trainBuilder;
	
	public Train(String structure) {
		trainBuilder = new TrainBuilder(structure);
		trainBuilder.build();
	}

	public String print(){
		return trainBuilder.print();
	}

	public void detachEnd() {
		trainBuilder.detachEnd();
	}
}
