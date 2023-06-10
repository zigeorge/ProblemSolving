import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.math.BigInteger;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

import org.junit.Test;

public class TopQuestions {
    
    public int[] twoSum(int[] nums, int target) {
        if(nums.length == 2) return new int[]{0,1};
        HashMap<Integer, ArrayList<Integer>> numsMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(numsMap.containsKey(nums[i])) {
                numsMap.get(nums[i]).add(i);
            } else {
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(i);
                numsMap.put(nums[i], arr);
            }
        }
        for(int i = 0; i< nums.length; i++) {
            int find = target - nums[i];
            if(numsMap.containsKey(find)) {
                for(Integer num: numsMap.get(find)) {
                    if(num != i) {
                        return new int[]{num, i};
                    }
                }
            }
        }
        return new int[]{-1,-1};
    }

    @Test
    public void testTwoSum() {
        int[] nums = new int[] {3,2,5};
        int[] result = twoSum(nums, 6);

        assertArrayEquals(new int[]{-1,-1}, result);
    }

    public int[] findBall(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] answer = new int[n];
        for(int j=0; j<n; j++) {
            int j1 = j, j2;
            for(int i=0; i<m; i++) {
                j2 = j1+grid[i][j1];
                if(j2<0 || j2 >= n || grid[i][j1] != grid[i][j2]) {
                    j1 = -1;
                    break;
                }
                j1 = j2;
            }
            answer[j] = j1;
        }
        return answer;
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        String lcp = strs[0];
        for(int i=0; i<strs.length; i++) {
            if(strs[i].length() < lcp.length()) {
                lcp = strs[i];
            }
        }
        for(int i=0; i<strs.length; i++) {
            if(strs[i] == lcp || strs[i].startsWith(lcp)) continue;
            else {
                do {
                    lcp = lcp.substring(0, lcp.length()-1);
                } while(!strs[i].startsWith(lcp) && !lcp.isEmpty());
            }
            if(lcp.isEmpty()) return "";
        }
        return lcp;
    }

    @Test
    public void testLongestCommonPrefix() {
        String[] strs = new String[]{"flo", "flow", "flight"};
        String prefix = longestCommonPrefix(strs);
        assertEquals("fl", prefix);
    }


    public String multiply(String num1, String num2) {
        if(numIsZero(num1) || numIsZero(num2)) {
            return "0";
        }
        String result = "";
        String smaller = num1, larger = num2;
        if(num1.length() > num2.length()) {
            smaller = num2;
            larger = num1;
        }
        String zeros = "";
        for(int i=smaller.length()-1; i>=0; i--) {
            String currentResult = reverse(multiplySingleDigit(larger, Character.getNumericValue(smaller.charAt(i))));
            if(result.isEmpty()) {
                result = currentResult;
            } else {
                result = reverse(addNums(result, currentResult+zeros));
            }
            zeros = "0"+zeros;
        }        
        return result;
        
    }

    public boolean numIsZero(String num) {
        return num.length() == 1 && Integer.valueOf(num) == 0;
    }

    public String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public String multiplySingleDigit(String num, int a) {
        String result = "";
        int carry = 0;
        for(int i=num.length()-1; i>=0; i--) {
            int mult = Character.getNumericValue(num.charAt(i)) * a + carry;
            if(mult > 9) {
                result = result.concat(String.valueOf(mult%10));
                carry = mult/10;
            } else {
                result = result.concat(String.valueOf(mult));
                carry = 0;
            }
        }
        if(carry > 0) {
            result = result.concat(String.valueOf(carry));
        }
        return result;
    }

    public String addNums(String num1, String num2) {
        if(num1.length() > num2.length()) {
            int diff = num1.length() - num2.length();
            while(diff > 0) {
                num2 = "0" + num2;
                diff--;
            }
        } else {
            int diff = num2.length() - num1.length();
            while(diff > 0) {
                num1 = "0" + num1;
                diff--;
            }
        }
        String result = "";
        int carry = 0;
        for(int i=num1.length()-1; i>=0; i--) {
            int a = Character.getNumericValue(num1.charAt(i));
            int b = Character.getNumericValue(num2.charAt(i));
            int sum = a+b+carry;
            if(sum > 9) {
                result = result.concat(String.valueOf(sum%10));
                carry = sum/10;
            } else {
                result = result.concat(String.valueOf(sum));
                carry = 0;
            }
        }
        if(carry > 0) {
            result = result.concat(String.valueOf(carry));
        }
        return result;
    }

    @Test
    public void testSingleDigitMultiplication() {
        String result = multiplySingleDigit("120", 60);
        assertEquals("0027", result);
    }

    @Test
    public void testAddString() {
        String result = addNums("89", "99");
        assertEquals("881", result);
    }

    public int[] getNumInArray(String num) {
        int[] nums = new int[num.length()];
        for(int i=0; i<nums.length; i++) {
            nums[i] = Character.getNumericValue(num.charAt(i));
        }
        return nums;
    }

    @Test
    public void testMultiplication() {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int index = 0;
        Random rand = new Random();
        while(index < 199) {
            sb1.append(rand.nextInt(9));
            sb2.append(rand.nextInt(9));
            index++;
        }
        String num1 = sb1.toString(); String num2 = sb2.toString();
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        String result = multiply(n1.toString(), n2.toString());
        BigInteger expected = n1.multiply(n2);
        assertEquals(expected.toString(), result);
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode hi = reversNode(slow);
        ListNode lo = head;
        while(lo.next != null) {
            if(hi.val != lo.val) return false;
            lo = lo.next;
            hi = hi.next;
        }
        return true;
    }

    public ListNode reversNode(ListNode head) {
        ListNode prev = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    @Test
    public void testReverse() {
        ListNode head = Practice.createLinkedList(new int[] {1,2,3});

        ListNode reverse = reversNode(head);
        int[] result = Practice.fromLinkedList(reverse);

        assertArrayEquals(new int[]{3,2,1}, result);

    }

    @Test
    public void testPalindromeLinkedList() {
        ListNode head = Practice.createLinkedList(new int[]{1,2,2,1});
        boolean result = isPalindrome(head);

        assertEquals(true, result);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) {
            return null;
        } else if(head.next.next == null) {
            if(n==1) {
                head.next = null;
                return head;
            } else {
                return head.next;
            }
        } else {
            ListNode sp = head, fp = head;
            int spPosition = 1;
            while(fp != null && fp.next != null) {
                fp = fp.next.next;
                if(fp != null) {
                    spPosition+=2;
                } else spPosition++;
            }
            head = sp;
            if(spPosition == n) {
                return head.next;
            }
            while(spPosition > n+1) {
                sp = sp.next;
                spPosition--;
            }
            if(sp.next.next == null) {
                sp.next = null;
            } else {
                sp.next = sp.next.next;
            }
        }
        return head;
    }

    @Test
    public void testDeletingNthNode() {
        ListNode head = Practice.createLinkedList(new int[] {1,2,3,4,5,6,7,8,9,10});
        ListNode afterDelete = removeNthFromEnd(head, 2);

        int[] result = Practice.fromLinkedList(afterDelete);
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,10}, result);
    }

    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return head;
        ListNode odd = head, even = head.next;
        ListNode nextOdd = odd, nextEven = even;
        int count = 2;
        head = head.next.next;
        while(head != null) {
            count++;
            ListNode next = head;
            head = head.next;
            if(count%2 == 0) {
                nextEven.next = next;
                nextEven = nextEven.next;
                if(head == null) {
                    nextOdd.next = head;
                }
            } else {
                nextOdd.next = next;
                nextOdd = nextOdd.next;
                if(head == null) {
                    nextEven.next = head;
                }
            }
        }
        nextOdd.next = even;
        return odd;        
    }

    @Test
    public void testOddEvenList() {
        ListNode head = Practice.createLinkedList(new int[] {1,2,3,4,5,6,7});
        ListNode newNodes = oddEvenList(head);

        int[] result = Practice.fromLinkedList(newNodes);
        assertArrayEquals(new int[]{1,3,5,7,2,4,6}, result);
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode left = head;
        ListNode right = getMid(head);
        ListNode tmp = right.next;
        right.next = null;
        right = tmp;

        left = sortList(left);
        right = sortList(right);
        return mergeList(left, right);
    }

    public ListNode getMid(ListNode head) {
        ListNode fast = head.next.next, slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode mergeList(ListNode left, ListNode right) {
        ListNode tail = new ListNode();
        ListNode merged = tail;
        while(left != null && right != null) {
            if(left.val < right.val) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }
        if(left != null) {
            tail.next = left;
        } else {
            tail.next = right;
        }
        return merged.next;
    }

    @Test
    public void testSortList() {
        ListNode head = Practice.createLinkedList(new int[] {5,6,4,3,7,2,8,2});
        ListNode sorted = sortList(head);

        int[] result = Practice.fromLinkedList(sorted);
        assertArrayEquals(new int[]{2,2,3,4,5,6,7,8}, result);
    }

    public int longestPalindrome(String[] words) {
        if(words.length == 1 && !isPalindrome(words[0])) return 0;
        else if(words.length == 1 && isPalindrome(words[0])) return 2;
        HashMap<String, Integer> palindromes = new HashMap<>();
        HashMap<String, Integer> nonPalindromes = new HashMap<>();
        for(int i=0; i<words.length; i++) {
            if(isPalindrome(words[i])) {
                palindromes.put(words[i], palindromes.getOrDefault(words[i], 0)+1);
            } else {
                nonPalindromes.put(words[i], nonPalindromes.getOrDefault(words[i], 0)+1);
            }
        }
        int longestPalindromeLength = 0;
        boolean singlePalindromeTaken = false;
        for(String key: palindromes.keySet()) {
            int total = palindromes.get(key);
            if(total == 0) continue;
            else if(total == 1) {
                if(!singlePalindromeTaken) {
                    singlePalindromeTaken = true;
                } else {
                    total = 0;
                }
            } else if(total % 2 == 1) {
                if(!singlePalindromeTaken) {
                    singlePalindromeTaken = true;
                } else {
                    total--;
                }
            }
            longestPalindromeLength = longestPalindromeLength + (total*2);
            palindromes.put(key, 0);
        }
        for(String key: nonPalindromes.keySet()) {
            String reverse = reverse(key);
            int keyCount = nonPalindromes.getOrDefault(key, 0);
            if(keyCount == 0) continue;
            int reverseCount = nonPalindromes.getOrDefault(reverse, 0);
            int palindromeLength = 0;
            if(keyCount == reverseCount) {
                palindromeLength = keyCount;
            } else if(keyCount > reverseCount){
                palindromeLength = reverseCount;
            } else {
                palindromeLength = keyCount;
            }
            nonPalindromes.put(key, 0);
            if(nonPalindromes.get(reverse) != null) {
                nonPalindromes.put(reverse, 0);
            }
            longestPalindromeLength = longestPalindromeLength + palindromeLength*4;
        }
        return longestPalindromeLength;
    }

    public boolean isPalindrome(String word) {
        String reverse = reverse(word);
        return word.equals(reverse);
    }

    @Test
    public void testLongestPalindromeLength() {
        int length = longestPalindrome(new String[]{"ab","ty","yt","lc","cl","ab","aa","bb","aa"});

        assertEquals(14, length);
    }

    @Test
    public void testIsPalindrome() {
        boolean result = isPalindrome("abccba");

        assertEquals(true, result);
    }
// 'A','A','A','A','A','A','B','C','D','E','F','G'
    public int leastInterval(char[] tasks, int n) {
        if(n == 0) return tasks.length;
        int time = 0;
        HashMap<Character, Integer> taskMap = new HashMap<>();
        for (char c : tasks) {
            taskMap.put(c, taskMap.getOrDefault(c, 0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(taskMap.size(), Collections.reverseOrder());
        for(int value: taskMap.values()) {
            pq.offer(value);
        }
        Queue<AbstractMap.SimpleEntry<Integer, Integer>> queue = new LinkedList<>();
        while(!pq.isEmpty() || !queue.isEmpty()) {
            time++;
            if(!pq.isEmpty()) {
                int task = pq.poll();                
                task--;
                if(task > 0) {
                    queue.add(new AbstractMap.SimpleEntry<>(time+n, task));
                }
            } 
            if(queue.size() > 0 && queue.peek().getKey() == time) {
                pq.add(queue.remove().getValue());
            }
        }

        return time;
        
    }

    public void testPQ() {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<10; i++) {
            hm.put(i, i);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(hm.size(), Collections.reverseOrder());
        for(int key: hm.keySet()) {
            pq.offer(key);
        }
        int i=0;
        while(i<5) {
            System.out.println(pq.poll());
            i++;
        }
        pq.offer(10);
        while(i<10) {
            System.out.println(pq.poll());
            i++;
        }
    }

    @Test
    public void testingPQ() {
        testPQ();
        assertEquals(true, true);
    }

    // "A","A","A","A","A","A","B","C","D","E","F","G"
    @Test
    public void testLeastInterval() {
        int result = leastInterval(new char[]{}, 1);

        assertEquals(1000, result);
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        else {
            TreeNode left = root.right;
            TreeNode right = root.left;
            root.left = left;
            root.right = right;
            invertTree(root.left);
            invertTree(root.right);
            return root;
        }
    }

    @Test
    public void testInvertTree() {
        TreeNode root = TreeNode.creatTreeNode(new Integer[] {1,2,3,4,5,6,7});
        TreeNode result = invertTree(root);
        int[] arr = TreeNode.toArray(result);
        assertArrayEquals(new int[]{1,3,7,6,2,5,4}, arr);
    }

    boolean isBalance=true; 
    public boolean isBalanced(TreeNode root) {
        isBalance=true;
        height(root);
        return isBalance;
    }

    int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        if(Math.abs(left-right)>1){
            isBalance=false;
        }
        return Math.max(left,right)+1;
    }

    @Test
    public void testIsBalancedTree() {
        TreeNode root = TreeNode.creatTreeNode(new Integer[]{1,2,2,3,3,null,null,4,4});
        boolean isBalanced = isBalanced(root);
        assertEquals(false, isBalanced);
    }

    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
    }

    public int dfs(TreeNode root) {
        if(root == null) return -1;
        int left = dfs(root.left);
        int right = dfs(root.right);
        max = Math.max(max, 2 + left + right);
        return 1 + Math.max(left, right);
    }

    @Test
    public void testDiameterOfTree() {
        TreeNode root = TreeNode.creatTreeNode(new Integer[]{1,2,2,3,3,null,null,4,4});
        int diameter = diameterOfBinaryTree(root);
        assertEquals(4, diameter);
    }

    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        return pathSum(root.left, targetSum) + dfs(root, targetSum) + pathSum(root.right, targetSum);
    }

    public int dfs(TreeNode root, long target) {
        if(root == null) {
            return 0;
        }
        int result = 0;
        if(root.val == target) result++;
        result += dfs(root.left, target-root.val);
        result += dfs(root.right, target-root.val);
        return result;
    }
// 1000000000,1000000000,null,294967296,null,1000000000,null,1000000000,null,1000000000
    @Test
    public void testPathSum() {
        TreeNode root = new TreeNode(1000000000, new TreeNode(1000000000, new TreeNode(294967296, new TreeNode(1000000000, 
        new TreeNode(1000000000, new TreeNode(1000000000), null), null), null), null), null);
        int pathSum = pathSum(root, 0);
        assertEquals(0, pathSum);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length-1);
    }

    public TreeNode dfs(int[] nums, int left, int right) {
        TreeNode root = null;
        if(left <= right) {
            int mid = (left + right)/2;
            root = new TreeNode(nums[mid]);
            root.left = dfs(nums, left, mid-1);
            root.right = dfs(nums, mid+1, right);
        }
        return root;
    }

    @Test
    public void testSortedArrayToBST() {
        TreeNode result = sortedArrayToBST(new int[]{1,2,3,4,5,6});
        int[] resArr = TreeNode.toArray(result);
        assertArrayEquals(new int[]{3,1,2,5,4,6}, resArr);
    }

    public int kthSmallest(TreeNode root, int k) {
        int[] arr = TreeNode.toArray(root);
        Arrays.sort(arr);
        return arr[k-1];
    }

    //if any adjacent cells are > cell value continue
    //if 
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        int m = heights.length, n = heights[0].length;
        boolean[][] pac = new boolean[m][n];
        boolean[][] atl = new boolean[m][n];
        for(int i = 0; i<n; i++) {
            dfs(heights, 0, i, heights[0][i], pac);
            dfs(heights, m-1, i, heights[m-1][i], atl);
        }
        for(int i = 0; i<m; i++) {
            dfs(heights, i, 0, heights[i][0], pac);
            dfs(heights, i, n-1, heights[i][n-1], atl);
        }
        for(int i = 0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(pac[i][j] && atl[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        return result;
    }

    public void dfs(int[][] heights, int r, int c, int prevHeight, boolean[][] stor) {
        if(stor[r][c]
            || r < 0 || r == heights.length
            || c < 0 || c == heights[0].length
            || heights[r][c] < prevHeight) {
            return;
        }
        stor[r][c] = true;;
        dfs(heights, r+1, c, heights[r][c], stor);
        dfs(heights, r-1, c, heights[r][c], stor);
        dfs(heights, r, c+1, heights[r][c], stor);
        dfs(heights, r, c-1, heights[r][c], stor);
    }

    @Test
    public void testPacificAtlantic() {
        List<List<Integer>> result = pacificAtlantic(new int[][]{
            {1, 2, 3,  4,  5,  6,  7,  8,  9,  10, 11, 12,13},//1
            {48,49,50, 51, 52, 53, 54, 55, 56, 57, 58, 59,14},//2
            {47,88,89, 90, 91, 92, 93, 94, 95, 96, 97, 60,15},//3
            {46,87,120,121,122,123,124,125,126,127,98, 61,16},//4
            {45,86,119,144,145,146,147,148,149,128,99, 62,17},//5
            {44,85,118,143,160,161,162,163,150,129,100,63,18},//6
            {43,84,117,142,159,168,169,164,151,130,101,64,19},//7
            {42,83,116,141,158,167,166,165,152,131,102,65,20},//8
            {41,82,115,140,157,156,155,154,153,132,103,66,21},//9
            {40,81,114,139,138,137,136,135,134,133,104,67,22},//10
            {39,80,113,112,111,110,109,108,107,106,105,68,23},//11
            {38,79,78, 77, 76, 75, 74, 73, 72, 71, 70, 69,24},//12
            {37,36,35, 34, 33, 32, 31, 30, 29, 28, 27, 26,25}//13
            });
        assertEquals(true, true);
    }
// [[1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13],
// [48,49,50,51,52,53,54,55,56,57,58,59,14],
// [47,88,89,90,91,92,93,94,95,96,97,60,15],
// [46,87,120,121,122,123,124,125,126,127,98,61,16],
// [45,86,119,144,145,146,147,148,149,128,99,62,17],
// [44,85,118,143,160,161,162,163,150,129,100,63,18],
// [43,84,117,142,159,168,169,164,151,130,101,64,19],
// [42,83,116,141,158,167,166,165,152,131,102,65,20],
// [41,82,115,140,157,156,155,154,153,132,103,66,21],
// [40,81,114,139,138,137,136,135,134,133,104,67,22],
// [39,80,113,112,111,110,109,108,107,106,105,68,23],
// [38,79,78,77,76,75,74,73,72,71,70,69,24],
// [37,36,35,34,33,32,31,30,29,28,27,26,25]]

/*
 * [[0, 12], [1, 0], [1, 1], [1, 2], [1, 3], [1, 4], [1, 5], [1, 6], 
 * [1, 7], [1, 8], [1, 9], [1, 10], [1, 11], [1, 12], [2, 0], [2, 1], 
 * [2, 2], [2, 3], [2, 4], [2, 5], [2, 6], [2, 7], [2, 8], [2, 9], [2, 10], 
 * [2, 11], [2, 12], [3, 0], [3, 1], [3, 2], [3, 3], [3, 4], [3, 5], [3, 6], 
 * [3, 7], [3, 8], [3, 9], [3, 10], [3, 11], [3, 12], [4, 0], [4, 1], [4, 2], 
 * [4, 3], [4, 4], [4, 5], [4, 6], [4, 7], [4, 8], [4, 9], [4, 10], [4, 11], 
 * [4, 12], [5, 0], [5, 1], [5, 2], [5, 3], [5, 4], [5, 5], [5, 6], [5, 7], 
 * [5, 8], [5, 9], [5, 10], [5, 11], [5, 12], [6, 0], [6, 1], [6, 2], [6, 3], 
 * [6, 4], [6, 5], [6, 6], [6, 7], [6, 8], [6, 9], [6, 10], [6, 11], [6, 12], 
 * [7, 0], [7, 1], [7, 2], [7, 3], [7, 4], [7, 5], [7, 6], [7, 7], [7, 8], 
 * [7, 9], [7, 10], [7, 11], [7, 12], [8, 0], [8, 1], [8, 2], [8, 3], [8, 4], 
 * [8, 5], [8, 6], [8, 7], [8, 8], [8, 9], [8, 10], [8, 11], [8, 12], [9, 0], 
 * [9, 1], [9, 2], [9, 3], [9, 4], [9, 5], [9, 6], [9, 7], [9, 8], [9, 9], 
 * [9, 10], [9, 11], [9, 12], [10, 0], [10, 1], [10, 2], [10, 3], [10, 4], [10, 5], 
 * [10, 6], [10, 7], [10, 8], [10, 9], [10, 10], [10, 11], [10, 12], [11, 0], [11, 1], 
 * [11, 2], [11, 3], [11, 4], [11, 5], [11, 6], [11, 7], [11, 8], [11, 9], [11, 10], [11, 11], 
 * [11, 12], [12, 0], [12, 1], [12, 2], [12, 3], [12, 4], [12, 5], [12, 6], [12, 7], [12, 8], [12, 9], [12, 10], [12, 11], [12, 12]]
 */

    public int numBusesToDestination(int[][] routes, int source, int target) {
        HashMap<Integer, List<List<Integer>>> paths = new HashMap<>();
        for(int i=0; i<routes.length; i++) {
            for(int j=0; j<routes[i].length; j++) {
                List<List<Integer>> busRoute = paths.getOrDefault(routes[i][j], new ArrayList<>());
                ArrayList<Integer> r = new ArrayList<>();
                for(int k=0; k<routes[i].length; k++) {
                    r.add(routes[i][k]);
                }
                busRoute.add(r);
                paths.put(routes[i][j], busRoute);
            }
        }
        List<List<Integer>> sourceRoutes = paths.getOrDefault(source, new ArrayList<>());
        List<List<Integer>> targetRoutes = paths.getOrDefault(target, new ArrayList<>());
        if(sourceRoutes.isEmpty() || targetRoutes.isEmpty()) return -1;
        int numOfBuses = 0;
        for(int i=0; i<sourceRoutes.size(); i++) {
            for(int j=0; j<sourceRoutes.get(i).size(); j++) {
                numOfBuses += dfs(sourceRoutes.get(i), paths, numOfBuses, target);
            }
        }
        return -1;
    }

    public int dfs(List<Integer> routes, HashMap<Integer, List<List<Integer>>> paths, int numOfBuses, int target) {
        if(routes.contains(target)) {
            return numOfBuses + 1;
        }
        return 1;
    }

    public void calc(double la1, double lo1, double heading) {
        long lngConst = 111320;
        long latConst = 110540;
        long distance = 1000;
        double dx = distance*Math.cos(heading);
        double dy = distance*Math.sin(heading);
        double deltaLat = dy/latConst;
        double deltaLon = dx/lngConst;
        double la2 = la1 + deltaLat;
        double lo2 = lo1 + deltaLon;
        // double lat = 53.46036882190762;
        // double heading = 344.19529122029735;
        System.out.println(la2+" "+lo2);
        
    }

    @Test
    public void testCalc() {
        calc(53.58500747958201, 9.807045083858156, 71.63840043828377);
        assertEquals(true, true);
    }

}

class Pair {
    int i;
    int j;

    Pair(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return this.i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return this.j;
    }

    public void setJ(int j) {
        this.j = j;
    }

}
