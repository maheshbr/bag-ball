package com.sahaj.OOP.source;

/**
 * Created by maheshbr on 01/04/15.
 */
public class BlueBall extends Ball {
    @Override
    public boolean canAddBallToBagBasedOnColourRules(Bag bag) {
        return true;
    }

    @Override
    public Colour getBallColour() {
        return Colour.BLUE;
    }
}
