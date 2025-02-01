Overview

This Java program demonstrates method overriding and the use of the super keyword to call an overridden method from a superclass. The super keyword allows a subclass to invoke a method that was defined in its superclass, even if it has been overridden.

Key Concepts

Method Overriding: When a subclass provides a specific implementation of a method that is already defined in its superclass.

super Keyword: Used to call a method from the immediate superclass.

Code Explanation

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        cycle c = new cycle();
        c.print();
    }
}

class Motorcycle {
    public void print() {
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
    }
}

class cycle extends Motorcycle {
    @Override
    public void print() {
        super.print(); // Calls the print() method from Motorcycle class
        System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
    }
}

How It Works

Class Hierarchy:

Motorcycle is the superclass.

cycle is a subclass of Motorcycle.

Method Overriding:

The print() method in cycle overrides the print() method in Motorcycle.

Calling Superclass Method:

Inside cycle.print(), the super.print() statement calls the print() method from Motorcycle before executing the additional print statement.

Output

Hello I am a motorcycle, I am a cycle with an engine.
My ancestor is a cycle who is a vehicle with pedals.

Why Use super?

Allows access to the overridden method of a superclass.

Helps in extending functionalities rather than completely replacing them.

Ensures that important logic from the superclass method is not lost.

