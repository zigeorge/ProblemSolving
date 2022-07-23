import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class Leetcode75 {

    public boolean isHappy(int n) {
        if(n==1) return true;
        Set<Integer> set = new HashSet<>();
        set.add(n);
        int nextInt = 0;
        while (true) {
            int remainder = n % 10;
            n = n / 10;
            nextInt = nextInt + remainder * remainder;
            if (n == 0) {
                if (set.contains(nextInt))
                    return false;
                else
                    set.add(nextInt);
                n = nextInt;
                nextInt = 0;
                if (n == 1) {
                    return true;
                }
            }
        }
    }

    @Test
    public void testIfHappyNumber() {
        boolean isHappy = isHappy(1);

        assertEquals(true, isHappy);
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralList = new ArrayList<>();
        int iMax = matrix.length-1, jMax = matrix[0].length-1;
        int iMin = 0, jMin = 0;
        int i=iMin, j=jMin;
        while(spiralList.size() < matrix.length*matrix[0].length) {
            spiralList.add(matrix[i][j]);
            if(j < jMax && i == iMin) {
                j++;
            } else if(j == jMax && i < iMax) {
                i++;
            } else if(j > jMin && i == iMax) {
                j--;
                if(j == jMin) {
                    iMax--;
                    iMin++;
                }
            } else {
                i--;
                if(i == iMin) {
                    jMin++;
                    jMax--;
                }
            }
        }
        return spiralList;
        
    }

    @Test
    public void testSpiralListCreation() {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> spiralList = spiralOrder(matrix);

        assertEquals(Arrays.asList(1,2,3,6,9,8,7,4,5), spiralList);
    }

    public int[] findBall(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] answer = new int[n];
        for(int j=0; j<n; j++) {
            int i = m-1;
            if(j == 0 && grid[i][j] == 1) answer[j] = -1;
            else if(j == n-1 && grid[i][j] == -1) answer[j] = -1;
            if(j<n-1) {
                int current = grid[i][j];
                while(i >= 0) {
                    if(grid[i][j] == grid[i][j+1] && grid[i][j] != current) {
                        current = grid[i][j];
                        i--;
                    } else if() {
                        
                    } else if(grid[i][j] != grid[i][j+1]) {
                        answer[j] = -1;
                        break;
                    }                    
                }
            }
        }
    }

}
