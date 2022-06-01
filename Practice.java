import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
//        int[] nums = new int[] {0,2,2};
//        int[] nums = new int[] {-1000,-1000,-1000};
        // int[] nums = new int[] {2000000000,2099999999,2099999999};
        String[] operations = new String[] {"++X","--X","--X"};
//        List<Integer> result = findDisappearedNumbers(nums);
//        System.out.println("Result is" + result);
//        sortColors(nums);
        // System.out.println("Result is " + maximumProduct(nums));
        // System.out.println("Result of running sum is " + Arrays.toString(runningSum(nums)));
        System.out.println("Result of x is " + finalValueAfterOperations(operations));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
//        int max = nums.length;

        for(int i=0; i<nums.length; i++) {
            int index;
            if(nums[i] > nums.length) {
                index = nums[i] - nums.length -1;
            } else {
                index = nums[i] - 1;
            }
            
            if(nums[index] <= nums.length) {
                nums[index] = nums[index] + nums.length;
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            if(nums[i] <= nums.length)
                result.add(i+1);
        }
        return result;
    }

    public static void sortColors(int[] nums) {
        int[] arr = new int[] {0,1,nums.length-1};
        int i = arr[0]; int j = arr[2];
        while(i<nums.length && j>=0) {
            System.out.println("When i = "+i+" and j = "+j+" nums = "+Arrays.toString(nums));
            if(nums[j] > 1) {
                if (nums[arr[2]] != 2)
                    swap(nums, j, arr[2]);
                arr[2]--;
                i = arr[0];
                j = arr[2];
            } else j--;
            if(nums[i] < 1) {
                if (nums[arr[0]] != 0)
                    swap(nums, i, arr[0]);
                arr[0]++;
                arr[1]++;
                i = arr[0];
                j = arr[2];
            } else i++;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] nums, int indexA, int indexB) {
        int temp = nums[indexA];
        nums[indexA] = nums[indexB];
        nums[indexB] = temp;
    }

    public static int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = max1-1, max3 = max2-1, min1 = Integer.MAX_VALUE, min2 = min1-1;
        for (int i=0; i<nums.length; i++) {
            if(nums[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            } else if(nums[i] > max2) {
                max3 = max2;
                max2 = nums[i];
            } else if (nums[i] > max3) {
                max3 = nums[i];
            }
            if(nums[i] < min1) {
                min2 = min1;
                min1 = nums[i];
            } else if (nums[i] < min2) {
                min2 = nums[i];
            }
            System.out.println("max1 = "+max1+", max2 = "+max2+", max3 = "+max3+", min1 = "+min1+", min2 = "+min2);
        }
        int productOfMax2 = max3*max2;
        int productOfMin2 = min2*min1;
        if(productOfMin2 > productOfMax2 && max1 > 0) {
            return productOfMin2 * max1;
        } else return productOfMax2 * max1;
    }

    public static int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0; i<operations.length; i++) {
            if(operations[i].equals("X--") || operations[i].equals("--X")) x--;
            else x++;
        }
        return x;
    }



}
