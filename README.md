# Combination-Sum
Given an array of distinct integers candidates and a target integer target, return all unique combinations of candidates where the chosen numbers sum to target.
How it Works
Backtracking:

Use recursion to explore all possible combinations of the candidates array.
Add a candidate to the current combination and explore further until the target is either met or exceeded.
Pruning:

If the target becomes negative, stop exploring further.
If the target becomes zero, add the current combination to the result.
Reusing Elements:

Since the same element can be reused multiple times, the recursive call does not increment the index.
