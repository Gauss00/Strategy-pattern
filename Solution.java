package strategy;

import strategy.fly.FlyRocketPowered;

import java.io.IOException;

public class Solution {
    public static void main(String[] args){
        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        decoyDuck.setFlyBehavior(new FlyRocketPowered());
        decoyDuck.performFly();
        System.out.println("-------------------------------------------------------");

        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        System.out.println("-------------------------------------------------------");

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        System.out.println("-------------------------------------------------------");

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();

    }
}
