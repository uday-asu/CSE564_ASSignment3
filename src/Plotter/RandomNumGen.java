package Plotter;

import java.util.ArrayList;
import java.util.Random;

/**
 * A singleton Class to be instantiated only once
 * Keeps adds new number to the list when Button is clicked
 */
public class RandomNumGen {

    private static RandomNumGen instance;
    private Random ran = new Random();
    private ArrayList<Integer> numbers = new ArrayList<>();

    /**
     * private constructor so that
     * it cannot be called from anywhere outside
     */
    private RandomNumGen(){

    }

    /**
     * If instance is not initiated creates a instance
     * else returns the previous instance
     * @return
     */
    public static RandomNumGen getInstance(){
        if( instance == null ){
            instance = new RandomNumGen();
        }
        return instance;
    }

    /**
     * onclick listener creating randomNumber which is added
     * to the single Instance ArrayList
     * @return ArrayList < ArrayList <Integer>>
     */
    public ArrayList generateValues(){
        return new ArrayList(numbers);
    }

    /**
     * Generates Random numbers using Random class
     * provided by java
     */
    public void generateRandomNumber(){
        int randomNumber = ran.nextInt(100) ;
        numbers.add(randomNumber);
    }
}
