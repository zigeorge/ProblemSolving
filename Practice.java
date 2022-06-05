import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
    //    int[] nums = new int[] {-10,-10,10,2,2};
//        int[] nums = new int[] {-1000,-1000,-1000};
        // int[] nums = new int[] {2000000000,2099999999,2099999999};
        // String[] operations = new String[] {"++X","--X","--X"};
        int[] digits = new int[] {2,8,4,8,0,2,8,8,3,8,3,6,6,7,9};
//        List<Integer> result = findDisappearedNumbers(nums);
//        System.out.println("Result is" + result);
//        sortColors(nums);
        // System.out.println("Result is " + maximumProduct(nums));
        // System.out.println("Result of running sum is " + Arrays.toString(runningSum(nums)));
        System.out.println("Result of search is " + searchMatrix(new int[][]{{-1,0,4},{5,9,10}}, -5));
        // System.out.println("Hello World");
        // int[] sample = {2,1,2,0,0,1};
        // boolean solution = solution(sample);
        // System.out.println("Result:: "+solution);
        // System.out.println(printRLE("xxxxcdfffxxxdcc"));
        // String[] words = new String[] { "cat", "baby", "ear", "bread", "dog", "bird", "car", "ax"};
        // String string1 = "tcabnihjs";
        // String string2 = "tbcanihjs";
        // String string3 = "baykkjl";
        // String string4 = "bbabylkkj";
        // String string5 = "ccc";
        // String string6 = "breadmaking";
        // System.out.println("The result is "+solutionT(words, string6));
        // sortColors(sample);
        // System.out.println("Result of x is " + finalValueAfterOperations(operations));
        // System.out.println("The Nums Contains duplicate " + containsDuplicate(nums));
        // System.out.println("The single number is " + singleNumber(nums));
        // System.out.println("Result of x is " + finalValueAfterOperations(operations));
        // int[] nums = new int[] {-10,-10,10,2};
        // System.out.println("Resulted 2D Array " + Arrays.toString(construct2DArray(nums, 2, 2)));System.out.println("Result of x is " + finalValueAfterOperations(operations));
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

    public static int[] findEvenNumbers(int[] digits) {
        HashMap<Integer, Integer> resultMap = new HashMap<>();
        HashMap<Integer, Integer> digitsMap = new HashMap<>();
        int resultIndex = 0;
        int i=0;
        while(i<digits.length){
            if(!digitsMap.containsKey(digits[i])){
                // System.out.println("Key "+digits[i]+" value "+1);
                digitsMap.put(digits[i], 1);
            } else {
                int val = digitsMap.get(digits[i]);
                val++;
                digitsMap.put(digits[i], val);
                // System.out.println("Key "+digits[i]+" Value "+val);
            }
            i++;
        }
        System.out.println(digitsMap);
        int minEven = 100;
        while(minEven < 1000) {
            int d1 = minEven%10;
            int md = (minEven-d1)/10;
            int d2 = md%10;
            md = (md-d2)/10;
            int d3 = md%10;
            // System.out.println("minEven= "+minEven+" d1= "+d1+" d2= "+d2+" d3= "+d3);
            if(digitsMap.containsKey(d1)&&digitsMap.containsKey(d2)&&digitsMap.containsKey(d3)) {
                if(minEven==888){
                System.out.println("minEven= "+minEven+" d1= "+d1+" d2= "+d2+" d3= "+d3);
                System.out.println("digitsMap.get(d1)= "+digitsMap.get(d1)+" digitsMap.get(d2)= "+digitsMap.get(d2)+" digitsMap.get(d3)= "+digitsMap.get(d3));}
                if(d1==d2 && d2==d3) {
                    if(digitsMap.get(d1) >= 3) {
                        resultMap.put(resultIndex, minEven);
                        // System.out.println("resultIndexed");
                        resultIndex++;
                    }
                } else if(d1==d2 || d1==d3) {
                    if(digitsMap.get(d1) >= 2) {
                        resultMap.put(resultIndex, minEven);
                        // System.out.println("resultIndexed");
                        resultIndex++;
                    }
                } else if(d2==d3) {
                    if(digitsMap.get(d2) >= 2) {
                        resultMap.put(resultIndex, minEven);
                        // System.out.println("resultIndexed");
                        resultIndex++;
                    }
                } else {
                    resultMap.put(resultIndex, minEven);
                    // System.out.println("resultIndexed");
                    resultIndex++;
                }
            }
            minEven+=2;
        }
        int[] result = new int[resultMap.size()];
        for(int m=0; m<resultMap.size(); m++) {
            result[m] = resultMap.get(m);
        }
        return result;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int[] targetArray = new int[]{};
        for(int i=0; i<matrix.length; i++) {
            if(target>=matrix[i][0] && target<=matrix[i][matrix[0].length-1]) {
                targetArray = matrix[i];
                break;
            }
        }
        System.out.println("Result even numbers " + Arrays.toString(targetArray));
        if(targetArray == null) return false;
        for(int i=0; i< targetArray.length; i++) {
            if(target == targetArray[i]) return true;
        }
        return false;
    }    
    public static String solutionT(String[] words, String string) {
        for(int i=0; i<words.length; i++) {
          HashMap<Character, Integer> strMap = getMapForString(string);
        //   System.out.println("Word:: "+words[i]);
          for(int j=0; j<words[i].length(); j++) {      
            // System.out.println("Character:: "+words[i].charAt(j));
            Integer value = strMap.get(words[i].charAt(j));
            if(value == null || value == 0) {
              break;
            } 
            // System.out.println("Value:: "+value);
            value--;
            if(j == words[i].length()-1) return words[i];
            strMap.put(words[i].charAt(j), value);
          }
        }
        return "null";
      }
      
      public static HashMap<Character, Integer> getMapForString(String string) {
        HashMap<Character, Integer> mapStr = new HashMap<Character, Integer>();
        for(int i=0; i<string.length(); i++) {
          if(mapStr.get(string.charAt(i)) != null) {
            Integer value = mapStr.get(string.charAt(i)) + 1;
            mapStr.put(string.charAt(i), value);
          } else {
            mapStr.put(string.charAt(i), 1);            
          }
        }
        return mapStr;
      }

    // Below is the problem of longest increasing subsequence
    public static boolean solution(int[] sequence) {
        int max = 0;
        int[] list = new int[sequence.length];
        Arrays.fill(list, 1);
        for(int i=1; i<sequence.length; i++) {
            for(int j=0; j<i; j++) {
                if(sequence[i] > sequence[j] && list[i] < list[j] + 1) {
                    list[i] = list[j] + 1;
                }
            }
            if(max < list[i]) max = list[i];
        }
        return sequence.length - max < 2;
    }

    public static String printRLE(String str) {
        String resultStr = "";
        int n = str.length();
        for(int i=0; i<n; i++) {
            int count = 1;
            while(i<n-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            resultStr = resultStr + count + str.charAt(i);
        }
        return resultStr;
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> uniqMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(uniqMap.get(nums[i]) != null) {
                return true;
            } else {
                uniqMap.put(nums[i], 1);
            }
        }
        return false;
    }

    public static int missingNumber(int[] nums) {
        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor ^= i ^ nums[i];
            System.out.println("xor " +xor+ " i "+i+" nums[i] " +nums[i]);
        }

        return xor ^ i;
    }
    
    public static int singleNumber(int[] nums) {
        int singleNumber = nums[0];
        for(int i=1; i<nums.length; i++) {
            singleNumber^=nums[i];
        }
        return singleNumber;
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n < original.length) return new int[][]{};
        int[][] resultMatrix = new int[m][n];
        int index=0, i=0, j=0;
        while(index<original.length) {
            if(i<m) {
                // System.out.println("i= "+i+" Index= "+index);
                if(j<n) {
                    // System.out.println("j= "+j+" Value = "+original[index]);
                    resultMatrix[i][j] = original[index];
                    index++; j++;
                } else {
                    i++; j=0;
                }
            } else break;
        }
        return resultMatrix;
    }
}
 /*

You are running a classroom and suspect that some of your students are passing around the answers to multiple choice questions disguised as random strings.

Your task is to write a function that, given a list of words and a string, finds and returns the word in the list that is scrambled up inside the string, if any exists. There will be at most one matching word. The letters don't need to be in order or next to each other. The letters cannot be reused.

Example:
words = ['cat', 'baby', 'dog', 'bird', 'car', 'ax']
string1 = 'tcabnihjs'
find_embedded_word(words, string1) -> cat (the letters do not have to be in order)

string2 = 'tbcanihjs'
find_embedded_word(words, string2) -> cat (the letters do not have to be together)

string3 = 'baykkjl'
find_embedded_word(words, string3) -> None / null (the letters cannot be reused)

string4 = 'bbabylkkj'
find_embedded_word(words, string4) -> baby

string5 = 'ccc'
find_embedded_word(words, string5) -> None / null

string6 = 'breadmaking'
find_embedded_word(words, string6) -> bird

All Test Cases:
find_embedded_word(words, string1) -> cat
find_embedded_word(words, string2) -> cat
find_embedded_word(words, string3) -> None / null
find_embedded_word(words, string4) -> baby
find_embedded_word(words, string5) -> None / null
find_embedded_word(words, string6) -> bird

Complexity analysis variables:

W = number of words in `words`
S = maximal length of each word or string



import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] argv) {
    String[] words = new String[] { "cat", "baby", "dog", "bird", "car", "ax"};
    String string1 = "tcabnihjs";
    String string2 = "tbcanihjs";
    String string3 = "baykkjl";
    String string4 = "bbabylkkj";
    String string5 = "ccc";
    String string6 = "breadmaking";
    System.out.println("The result is "+solution(words, string1));
  }
  
  public static String solution(String[] words, String string) {
    for(int i=0; i<words.length; i++) {
      HashMap<String, Integer> strMap = getMapForString(string);
      for(int j=0; j<words[i].length(); j++) {      
        if(strMap.get(words[i].charAt(j)) == null) {
          break;
        } 
        Integer value = strMap.get(words[i].charAt(j));
        if(j == words[i].length()-1) return words[i];
        strMap.put(words[i].charAt(j)+"", value--);
      }
    }
    return "null";
  }
  
  public static HashMap<String, Integer> getMapForString(String string) {
    HashMap<String, Integer> mapStr = new HashMap();
    for(int i=0; i<string.length(); i++) {
      if(mapStr.get(string.charAt(i)) != null) {
        Integer value = mapStr.get(string.charAt(i)) + 1;
        mapStr.put(string.charAt(i)+"", value);
      } else {
        mapStr.put(string.charAt(i)+"", 1);
        
      }
    }
    return mapStr;
  }
  
}

*/