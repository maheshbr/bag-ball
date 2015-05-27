package com.sahaj.OOP.source;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maheshbr on 01/04/15.
 */
public class Bag {

    private static int SIZE = 12;
    private List<Ball> BallList;

    public Bag()
    {
        BallList = new ArrayList<Ball>();
    }

    public int getMaxSize()
    {
        return SIZE;
    }

    public void addBall(Ball ball) throws Exception {

        if(ball.canBeAddedToBag(this)){
           BallList.add(ball);
        }else{
            throw new Exception("This ball cannot be added");
        }
    }

    public int getNumberOfBalls(Colour colour)
    {
        int count = 0;
        for(Ball ball:BallList)
        {
            if(ball.getBallColour() == colour)
            {
                count++;
            }
        }
        return count;
    }

    public int getNumberItems() {
        return BallList.size();
    }
}
