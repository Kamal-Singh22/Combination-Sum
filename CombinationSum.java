import java.util.*;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        backtrack(candidates, target, 0, combination, result);
        return result;
    }

    private static void backtrack(int[] candidates, int target, int start, List<Integer> combination, List<List<Integer>> result) {
        if (target < 0) {
            return; // Stop exploring this path
        }
        if (target == 0) {
            result.add(new ArrayList<>(combination)); // Found a valid combination
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            combination.add(candidates[i]); // Choose a candidate
            backtrack(candidates, target - candidates[i], i, combination, result); // Explore further
            combination.remove(combination.size() - 1); // Backtrack
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the candidates array: ");
        int n = scanner.nextInt();

        int[] candidates = new int[n];
        System.out.println("Enter the candidates array: ");
        for (int i = 0; i < n; i++) {
            candidates[i] = scanner.nextInt();
        }

        System.out.println("Enter the target: ");
        int target = scanner.nextInt();

        List<List<Integer>> result = combinationSum(candidates, target);
        System.out.println("All unique combinations are: ");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}
