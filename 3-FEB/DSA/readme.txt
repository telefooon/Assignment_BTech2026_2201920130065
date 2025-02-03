This repository contains solutions to several common grid-based problems, each implemented in Java. These problems involve traversal techniques like Depth-First Search (DFS) and Breadth-First Search (BFS) to solve issues such as finding the number of islands, the maximum area of an island, rotten oranges, and more.

Table of Contents
Rotten Oranges
Islands and Treasures
Max Area of Island
Number of Islands
Problem 1: Rotten Oranges
Problem Statement:
Given a 2D grid of size m x n, each cell can have one of three values:

0 representing an empty cell
1 representing a fresh orange
2 representing a rotten orange
The rotting process starts when one of the rotten oranges turns all adjacent fresh oranges to rotten. Each minute, every rotten orange affects its adjacent fresh oranges (up, down, left, right).

Your task is to return the minimum number of minutes it will take to rot all the fresh oranges. If it is impossible to rot all the fresh oranges, return -1.

Solution Approach:
Use BFS to spread the rotting process from all initially rotten oranges.
Track the fresh oranges and ensure that all become rotten within the minimum time.
Problem 2: Islands and Treasures
Problem Statement:
Given a 2D grid of integers, find the shortest path from each water cell (value 0) to the nearest treasure cell (value Integer.MAX_VALUE).

Solution Approach:
Use BFS to explore each cell that is water (0) and propagate distances from water cells to treasure cells.
Problem 3: Max Area of Island
Problem Statement:
You are given a grid of 1s and 0s, where 1 represents land and 0 represents water. You need to find the maximum area of an island. An island is formed by connecting adjacent lands in all four directions (up, down, left, right).

Solution Approach:
Use DFS to explore all connected land cells and calculate the area of each island. Keep track of the maximum area found.
Problem 4: Number of Islands
Problem Statement:
Given a 2D grid of '1's (land) and '0's (water), you need to find the number of islands. An island is surrounded by water and is formed by connecting adjacent lands in all four directions.

Solution Approach:
Use DFS to traverse each unvisited land cell and count the number of connected components (islands)