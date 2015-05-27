package com.sahaj.OOP.source;

/**
 * Created by maheshbr on 01/04/15.
 */
public class YellowBall extends Ball {

    @Override
    public boolean canAddBallToBagBasedOnColourRules(Bag bag) {
        int fortyPercent = (int) (0.4 * bag.getNumberItems());
        int numberOfYellowBalls = bag.getNumberOfBalls(Colour.YELLOW);

        return(numberOfYellowBalls < fortyPercent);

    }

    @Override
    public Colour getBallColour() {
        return Colour.YELLOW;
    }
}
