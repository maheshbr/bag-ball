package com.sahaj.OOP.source;

/**
 * Created by maheshbr on 01/04/15.
 */
public abstract class Ball {

    public abstract boolean canAddBallToBagBasedOnColourRules(Bag bag);

    public boolean canAddBallToBagBasedOnCapacity(Bag bag)
    {
        return (bag.getNumberItems() < bag.getMaxSize());
    }

    public boolean canBeAddedToBag(Bag bag)
     {
        return (canAddBallToBagBasedOnCapacity(bag) && canAddBallToBagBasedOnColourRules(bag));
     }

    public abstract Colour getBallColour();

}
