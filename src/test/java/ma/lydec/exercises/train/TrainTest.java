package ma.lydec.exercises.train;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

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
    
    @Test
    public void cargoTrain() {
        Train train = new Train("HCCC");
        assertEquals("<HHHH::|____|::|____|::|____|", train.print());
        train.fill();
        assertEquals("<HHHH::|^^^^|::|____|::|____|", train.print());
        train.fill();
        assertEquals("<HHHH::|^^^^|::|^^^^|::|____|", train.print());
        train.fill();
        assertEquals("<HHHH::|^^^^|::|^^^^|::|^^^^|", train.print());
        assertFalse(train.fill());
    }
    
    @Test
    public void cargoTrainComplexTest() {
        Train train = new Train("HPPRCCPPCH");
        assertEquals("<HHHH::|OOOO|::|OOOO|::|hThT|::|____|::|____|::|OOOO|::|OOOO|::|____|::HHHH>", train.print());
        train.fill();
        assertEquals("<HHHH::|OOOO|::|OOOO|::|hThT|::|^^^^|::|____|::|OOOO|::|OOOO|::|____|::HHHH>", train.print());
        train.fill();
        assertEquals("<HHHH::|OOOO|::|OOOO|::|hThT|::|^^^^|::|^^^^|::|OOOO|::|OOOO|::|____|::HHHH>", train.print());
        train.fill();
        assertEquals("<HHHH::|OOOO|::|OOOO|::|hThT|::|^^^^|::|^^^^|::|OOOO|::|OOOO|::|^^^^|::HHHH>", train.print());
        assertFalse(train.fill());
        train.detachEnd();
        assertEquals("<HHHH::|OOOO|::|OOOO|::|hThT|::|^^^^|::|^^^^|::|OOOO|::|OOOO|::|^^^^|", train.print());
        train.detachEnd();
        assertEquals("|OOOO|::|OOOO|::|hThT|::|^^^^|::|^^^^|::|OOOO|::|OOOO|::|^^^^|", train.print());
    }
}
