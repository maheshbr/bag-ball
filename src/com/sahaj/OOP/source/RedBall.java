package com.sahaj.OOP.source;

/**
 * Created by maheshbr on 01/04/15.
 */
public class RedBall extends Ball {

    @Override
    public boolean canAddBallToBagBasedOnColourRules(Bag bag) {

        int numberOfGreenBalls = bag.getNumberOfBalls(Colour.GREEN);
        int numberOfRedBalls = bag.getNumberOfBalls(Colour.RED);

        if (numberOfRedBalls >= (2 * numberOfGreenBalls)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Colour getBallColour() {
        return Colour.RED;
    }
}
