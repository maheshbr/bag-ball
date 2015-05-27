package com.sahaj.OOP.source;

/**
 * Created by maheshbr on 01/04/15.
 */
public class GreenBall extends Ball {

    @Override
    public boolean canAddBallToBagBasedOnColourRules(Bag bag) {

        if (bag.getNumberOfBalls(Colour.GREEN) < 3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Colour getBallColour() {
        return Colour.GREEN;
    }
}
