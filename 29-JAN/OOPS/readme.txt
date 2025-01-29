Program Name: Divisor Sum Calculator
Language: Java
Description:
This Java program calculates the sum of all divisors of a given integer n. It uses an interface-based approach to enforce the implementation of the divisor_sum(int n) method.

How It Works:
Interface (divSum):

Declares an abstract method divisor_sum(int n), which must be implemented by any class that extends it.
Class (AdvancedArithmetic):

Implements the divSum interface.
Defines divisor_sum(int n), which calculates the sum of all divisors of n.
Main Class (Solution):

Reads an integer n from user input.
Creates an object of AdvancedArithmetic.
Calls divisor_sum(n) and prints the result.
Also prints the class name to indicate the implemented interface.