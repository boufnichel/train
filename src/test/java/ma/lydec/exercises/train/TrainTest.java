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
    
    @Test
    public void doubleHeadedTrain() {
        Train train = new Train("HPRPH");
        assertEquals("<HHHH::|OOOO|::|hThT|::|OOOO|::HHHH>", train.print());
    }
    
    @Test
    public void modifyTrain() {
        Train train = new Train("HPRPH");
        train.detachEnd();
        assertEquals("<HHHH::|OOOO|::|hThT|::|OOOO|", train.print());
        train.detachEnd();
        assertEquals("|OOOO|::|hThT|::|OOOO|", train.print());
    }
}
