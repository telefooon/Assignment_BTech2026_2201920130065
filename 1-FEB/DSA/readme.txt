This repository contains Java implementations of three fundamental binary tree problems:

Invert Binary Tree

Lowest Common Ancestor (LCA) of a Binary Tree

Binary Tree Right Side View

1. Invert Binary Tree

Problem Statement:

Invert a given binary tree, swapping the left and right children at every node.

Approach:

Recursively traverse the tree.

Swap the left and right child nodes at each level.

Return the modified root node.

Complexity:

Time Complexity: O(N), where N is the number of nodes.

Space Complexity: O(H), where H is the height of the tree (O(log N) for balanced trees and O(N) for skewed trees).

2. Lowest Common Ancestor (LCA) of a Binary Tree

Problem Statement:

Find the lowest common ancestor of two given nodes in a binary tree.

Approach:

Recursively traverse the tree.

If either node matches the root, return the root.

Recursively search for both nodes in the left and right subtrees.

If both nodes are found in different subtrees, return the current root.

If found in only one subtree, return that subtree.

Complexity:

Time Complexity: O(N)

Space Complexity: O(H)

3. Binary Tree Right Side View

Problem Statement:

Return the list of nodes that are visible when looking at the tree from the right side.

Approach:

Use BFS (Level Order Traversal) with a queue.

Store the last node of each level as part of the result.

Complexity:

Time Complexity: O(N)

Space Complexity: O(N)