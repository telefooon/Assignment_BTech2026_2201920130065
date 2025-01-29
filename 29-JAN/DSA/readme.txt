Binary Tree Operations in Java

This Java program implements various operations on binary trees, including height calculation, node counting, diameter computation, subtree checking, and lowest common ancestor determination. The program also includes functionality for level-wise traversal and top view display of the binary tree.

Features & Implemented Functions

Height Calculation (height(Node root)) - Returns the height of the tree.

Node Count (countnodes(Node root)) - Returns the total number of nodes in the tree.

Sum of Nodes (sum(Node root)) - Computes the sum of all node values.

Diameter Calculation (diamtere(Node root), diameter(Node root)) - Determines the longest path between any two nodes.

Subtree Checking (issubtress(Node root, Node subroot)) - Checks if a given subtree exists within the main tree.

Top View of Tree (topview(Node root)) - Displays the nodes visible from the top.

K-Level Nodes (klevel(Node root, int level, int k)) - Prints all nodes at level K.

Lowest Common Ancestor (LCA)

LCA(Node root, int n1, int n2) - Determines the LCA using path storage.

lca2(Node root, int n1, int n2) - Optimized LCA calculation.

Minimum Distance Between Two Nodes (mindis(Node root, int n1, int n2)) - Calculates the shortest path between two nodes.

Kth Ancestor of a Node (kthanc(Node root, int n, int k)) - Finds the Kth ancestor of a given node.

Example Tree Structure

        1
       / \
      2   3
     / \ / \
    4  5 6  7

Usage

The main function initializes a sample binary tree.

Calls various functions to demonstrate tree operations.

Outputs the results of different functions such as top view, LCA, and subtree checking.

How to Run

Compile the Java file:

javac binarytrees.java

Run the program:

java binarytrees

This program provides fundamental operations useful for learning and implementing binary trees in Java.