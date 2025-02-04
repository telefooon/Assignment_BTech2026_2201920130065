This Java program demonstrates the use of an Iterator to traverse an ArrayList and selectively print elements after encountering a specific marker. The program reads integer and string inputs from the user, processes them into a list, and then prints only the string elements after the marker "###".

Functionality

The program takes two integer inputs:

n: Number of integer elements.

m: Number of string elements.

It reads n integers and stores them in an ArrayList.

It adds a marker string ("###") to separate integer and string inputs.

It then reads m string elements and appends them to the ArrayList.

The func() method returns an Iterator positioned at the first string element after the marker.

The program iterates over and prints all string elements after "###".

How It Works

The func(ArrayList mylist) method initializes an Iterator and iterates over mylist.

It stops at the first String element using the instanceof operator.

The returned Iterator is used in main() to print only the string elements.

Input Format

The first line contains two integers, n and m.

The next n lines contain integer values.