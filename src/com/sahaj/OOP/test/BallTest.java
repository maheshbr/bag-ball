package com.sahaj.OOP.test;

import com.sahaj.OOP.source.Bag;
import com.sahaj.OOP.source.Ball;
import com.sahaj.OOP.source.BlueBall;
import com.sahaj.OOP.source.GreenBall;
import com.sahaj.OOP.source.RedBall;
import com.sahaj.OOP.source.YellowBall;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by maheshbr on 01/04/15.
 */
public class BallTest {

    @Test(expected = Exception.class)
    public void testAddingMoreThanTwelveBallsThrowsException() throws Exception {
        Bag brownBag = new Bag();
        Ball blueBall = new BlueBall();

        for(int i=0; i < brownBag.getMaxSize(); i++)
        {
            brownBag.addBall(blueBall);
        }
        Assert.assertEquals(brownBag.getMaxSize(), brownBag.getNumberItems());

        brownBag.addBall(blueBall);

    }

    @Test
    public void testAddingUnlimitedBlueBall() throws Exception {
        Bag brownBag = new Bag();
        Ball blueBall = new BlueBall();

        for(int i=0; i < brownBag.getMaxSize(); i++)
        {
            brownBag.addBall(blueBall);
        }
        Assert.assertEquals(brownBag.getMaxSize(), brownBag.getNumberItems());
    }

    @Test(expected = Exception.class)
    public void testAddingMoreThanThreeGreenBallsThrowsException() throws Exception {
        Bag brownBag = new Bag();
        Ball greenBall = new GreenBall();

        for(int i=0; i < 3; i++)
        {
            brownBag.addBall(greenBall);
        }
        Assert.assertEquals(3, brownBag.getNumberItems());
        brownBag.addBall(greenBall);
    }

    @Test(expected = Exception.class)
    public void testAddingMoreThanDoubleRedBallsThrowsException() throws Exception {
        Bag brownBag = new Bag();
        Ball greenBall = new GreenBall();
        Ball redBall = new RedBall();

        for(int i=0; i < 2; i++)
        {
            brownBag.addBall(greenBall);
        }

        for(int i=0; i < 4; i++)
        {
            brownBag.addBall(redBall);
        }

        Assert.assertEquals(6, brownBag.getNumberItems());
        brownBag.addBall(redBall);
    }


    @Test(expected = Exception.class)
    public void testAddingMoreThan40PercentYellowBallThrowsException() throws Exception {
        Bag brownBag = new Bag();
        Ball blueBall = new BlueBall();
        Ball yellowBall = new YellowBall();

        for(int i=0; i < 6; i++)
        {
            brownBag.addBall(blueBall);
        }

        for(int i=0; i < 5; i++)
        {
            brownBag.addBall(yellowBall);
        }


    }
}
