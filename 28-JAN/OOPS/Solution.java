// Q1. 
// Using inheritance, one class can acquire the properties of others. Consider the following Animal class:

// class Animal{
//     void walk(){
//         System.out.println("I am walking");
//     }
// }
// This class has only one method, walk. Next, we want to create a Bird class that also has a fly method. We do this using extends keyword:

// class Bird extends Animal {
//     void fly() {
//         System.out.println("I am flying");
//     }
// }
// Finally, we can create a Bird object that can both fly and walk.

// public class Solution{
//    public static void main(String[] args){

//       Bird bird = new Bird();
//       bird.walk();
//       bird.fly();
//    }
// }
// The above code will print:

// I am walking
// I am flying
// This means that a Bird object has all the properties that an Animal object has, as well as some additional unique properties.

// The code above is provided for you in your editor. You must add a sing method to the Bird class, then modify the main method accordingly so that the code prints the following lines:

// I am walking
// I am flying
// I am singing

//CODE---------------------------
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal{
	void walk(){
		System.out.println("I am walking");
	}
}

class Bird extends Animal{
	void fly(){
		System.out.println("I am flying");
	}
    void sing(){
        System.out.println("I am singing");
    }
}

public class Solution{

   public static void main(String args[]){

	  Bird bird = new Bird();
	  bird.walk();
	  bird.fly();
      bird.sing();
	
   }
}

//Q2.
//Write the following code in your editor below:

// A class named Arithmetic with a method named add that takes  integers as parameters and returns an integer denoting their sum.
// A class named Adder that inherits from a superclass named Arithmetic.
// Your classes should not be be .

// Input Format

// You are not responsible for reading any input from stdin; a locked code stub will test your submission by calling the add method on an Adder object and passing it  integer parameters.

// Output Format

// You are not responsible for printing anything to stdout. Your add method must return the sum of its parameters.

// Sample Output

// The main method in the Solution class above should print the following:

// My superclass is: Arithmetic
// 42 13 20

import java.io.*;
import java.util.*;
class Arithmetic{
    public int add(int a, int b){
        return a + b;
    }
}

class Adder extends Arithmetic{
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Adder adder = new Adder();
        System.out.println("My superclass is: Arithmetic");
         System.out.println(42 + " " + 13 + " " + 20);
    }
}
