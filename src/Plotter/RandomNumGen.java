package Plotter;

import java.util.ArrayList;

public class RandomNumGen {

    private static RandomNumGen instance;
    private ArrayList<Integer> numbers = new ArrayList<>();
    private RandomNumGen(){

    }
    public static RandomNumGen getInstance(){
        if( instance == null ){
            instance = new RandomNumGen();
        }
        return instance;
    }

    public ArrayList<ArrayList<Integer>> generateValues(){
        return new ArrayList(numbers);
    }
    public void generateRandomNumber(){
        int randomNumber = (int) ( (Math.random() * 200) + 1) % 100;
        numbers.add(randomNumber);
    }
}
