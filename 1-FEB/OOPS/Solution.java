// When a method in a subclass overrides a method in superclass, it is still possible to call the overridden method using super keyword. If you write super.func() to call the function func(), it will call the method that was defined in the superclass.

// You are given a partially completed code in the editor. Modify the code so that the code prints the following text:

// Hello I am a motorcycle, I am a cycle with an engine.
// My ancestor is a cycle who is a vehicle with pedals.

import java.util.*;

public class Solution {

public static void main(String[] args) {
  cycle c = new cycle();
  c.print();

  }
}

class Motorcycle{ 
    public void print(){ 
    System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");

};
} class cycle extends Motorcycle{ 
    @Override public void print(){ 
        super.print();

System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
}

}