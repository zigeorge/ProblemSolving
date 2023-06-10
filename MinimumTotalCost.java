import java.util.ArrayList;
import java.util.List;

public class MinimumTotalCost {
    public static int minimumTotalCost(List<Integer> arr) {
        int minValue = Integer.MAX_VALUE;
  int maxValue = Integer.MIN_VALUE;
  for (int element : arr) {
    minValue = Math.min(minValue, element);
    maxValue = Math.max(maxValue, element);
  }

  // Initialize a variable `minCost` to the cost of changing all elements to the maximum value.
  int minCost = Math.abs(maxValue - minValue);

  // For each value `x` between the minimum and maximum values, do the following:
  // Find the cost of changing all elements to `x`.
  // If the cost is less than `minCost`, then update `minCost` to the cost.
  for (int x = minValue; x <= maxValue; x++) {
    int cost = 0;
    for (int element : arr) {
      cost += Math.abs(element - x);
    }

    if (cost < minCost) {
      minCost = cost;
    }
  }

  // Return `minCost`.
  return minCost;
    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(1);
        array.add(2);

        int minCost = minimumTotalCost(array);
        System.out.println("Minimum total cost: " + minCost);
    }
}
