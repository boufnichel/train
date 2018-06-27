package ma.lydec.exercises.train;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ma.lydec.exercises.train.Train;

public class TrainTest {

    @Test
    public void passengerTrain() {
        Train train = new Train("HPP");
        assertEquals("<HHHH::|OOOO|::|OOOO|", train.print());
    }
    
    @Test
    public void restaurantTrain() {
        Train train = new Train("HPRP");
        assertEquals("<HHHH::|OOOO|::|hThT|::|OOOO|", train.print());
    }
}
