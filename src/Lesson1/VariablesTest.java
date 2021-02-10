package Lesson1;
import java.util.*;

// Create class with 5 diff variables of diff types. create or override method toString()

public class VariablesTest {
    private int age;
    private String name;
    private double sum;
    private char symbol;
    private boolean isTriggered;

// Constructor
    public VariablesTest(int age, String name, double sum, char symbol, boolean isTriggered) {
        this.age = age;
        this.name = name;
        this.sum = sum;
        this.symbol = symbol;
        this.isTriggered = isTriggered;
    }
        public String toString(){
        return " Name: " + this.name + " Age:" + this.age + " Sum: " +
                this.sum + " Symbol: " + this.symbol + " Is triggered: "+ this.isTriggered;



        }
    }

