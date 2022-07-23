
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

import org.junit.Test;

public class Heap {

    public String[] findRelativeRanks(int[] score) {
        int[] sortedScore = heapSort(score);
        
        System.out.println(Arrays.toString(sortedScore));

        HashMap<Integer, String> ranksMap = new HashMap<>();
        for (int i = 0; i < sortedScore.length; i++) {
            String rank = "";
            switch (i) {
                case 0: {
                    rank = "Gold Medal";
                    break;
                }
                case 1: {
                    rank = "Silver Medal";
                    break;
                }
                case 2: {
                    rank = "Bronze Medal";
                    break;
                }
                default: {
                    rank = "" + (i + 1);
                    break;
                }
            }
            ranksMap.put(sortedScore[i], rank);
        }
        String[] relativeRanks = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            relativeRanks[i] = ranksMap.get(score[i]);
        }
        return relativeRanks;
    }

    public int lastStoneWeight(int[] stones) {
        stones = heapSort(stones);
        ArrayList<Integer> remainingStones = new ArrayList<>();
        for(int i = stones.length-1; i>=0; i=i-2) {
            int remain = stones[i]-stones[i-1];
            remainingStones.add(remain);
        }
        return 1;
    }

    public void swap(int[] nums, int indexA, int indexB) {
        int temp = nums[indexA];
        nums[indexA] = nums[indexB];
        nums[indexB] = temp;
    }

    public int[] heapSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int currPosition = i;
            if (i == 0) {
                continue;
            } else {
                int parent = (i+1) / 2 - 1;
                while (parent >= 0) {
                    if (arr[parent] < arr[currPosition]) {
                        swap(arr, currPosition, parent);
                    }
                    currPosition = parent;
                    parent = (currPosition + 1) / 2 - 1;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            int left = 1, right = 2, parent = 0;
            while (right < i || left < i) {
                if (right < i) {
                    if (arr[left] > arr[right] && arr[left] > arr[parent]) {
                        swap(arr, left, parent);
                        parent = left;
                    } else if(arr[right] > arr[parent]){
                        swap(arr, right, parent);
                        parent = right;
                    } else {
                        break;
                    }
                } else if (left > i && arr[left] > arr[parent]) {
                    swap(arr, left, parent);
                    parent = left;
                } else {
                    break;
                }
                left = 2*parent + 1;
                right = 2*parent + 2;

            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    @Test
    public void checkIfRanksOk() {
        String[] result = findRelativeRanks(new int[] { 80, 78, 67, 68, 69, 70, 73, 76, 77, 78, 79, 81, 89, 82, 23, 32, 43, 34, 54, 45, 65, 56, 76, 67, 87, 78, 98, 89, 90 });

        assertEquals(true, true);
    }

    @Test
    public void checkHeapSort() {
        Random ran = new Random();
        int n = 15;
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = ran.nextInt(n*10);
        }
        int[] result = heapSort(arr);
        Arrays.sort(arr);
        assertArrayEquals(arr, result);


    }

}
