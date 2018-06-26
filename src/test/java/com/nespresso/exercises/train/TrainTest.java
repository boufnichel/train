package com.nespresso.exercises.train;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrainTest {

    @Test
    public void passengerTrain() {
        Train train = new Train("HPP");
        assertEquals("<HHHH::|OOOO|::|OOOO|", train.print());
    }

}
