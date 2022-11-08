package Plotter;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumGen {

    private static RandomNumGen instance;
    private Random ran = new Random();
    private ArrayList<Integer> numbers = new ArrayList<>();
    private RandomNumGen(){

    }
    public static RandomNumGen getInstance(){
        if( instance == null ){
            instance = new RandomNumGen();
        }
        return instance;
    }

    public ArrayList generateValues(){
        return new ArrayList(numbers);
    }
    public void generateRandomNumber(){
        int randomNumber = ran.nextInt(100) ;
        numbers.add(randomNumber);
    }
}
