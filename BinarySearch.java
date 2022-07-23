import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class BinarySearch {
    public int searchInsert(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        return searchInsert(nums, target, l, h);
    }

    public int searchInsert(int[] nums, int target, int l, int h) {
        int mid = (l + h) / 2;
        if (l == h) {
            if (target > nums[l]) {
                return l + 1;
            }
            return l;
        }
        while (l < h) {
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                return searchInsert(nums, target, mid + 1, h);
            } else {
                return searchInsert(nums, target, l, mid);
            }
        }
        return 0;
    }

    @Test
    public void shouldReturnInsertIndex() {
        int index = searchInsert(new int[] { 3, 5, 7, 9, 10 }, 8);

        assertEquals(3, index);
    }

    public int mySqrt(int x) {
        int[] nums = getNumsFromValue(x);
        StringBuilder result = new StringBuilder();
        int index = 0;
        int remainder = 0;
        while (index < nums.length) {
            int divisible = getDivisible(index, nums, remainder);
            int divider = getDivider(divisible, result.toString());
            remainder = getRemainder(divisible, divider, result.toString());
            result.append(divider);
            index += 2;
        }

        return Integer.parseInt(result.toString());
    }

    public int getRemainder(int divisible, int divider, String result) {
        if (result.isEmpty())
            return divisible - (divider * divider);
        int actualDivider = Integer.parseInt(result) * 2 * 10 + divider;
        return divisible - (actualDivider * divider);
    }

    public int getDivider(int divisible, String divider) {
        if (divider.isEmpty()) {
            return getNextDivider(divisible, divider, 0, 9);
        } else {
            int div = Integer.parseInt(divider);
            return getNextDivider(divisible, Integer.toString(div * 2), 0, 9);
        }
    }

    public int getNextDivider(int divisible, String divider, int l, int h) {
        int mid = (l + h) / 2;
        int div = Integer.parseInt(divider + mid);

        if (l < h) {
            if (div * mid == divisible)
                return mid;
            else if (div * mid > divisible) {
                return getNextDivider(divisible, divider, l, mid);
            } else {
                return getNextDivider(divisible, divider, mid + 1, h);
            }
        }
        if (div * mid > divisible) {
            return mid - 1;
        } else
            return mid;
    }

    public int getDivisible(int index, int[] nums, int remain) {
        boolean isEventDigits = nums.length % 2 == 0;
        StringBuilder divisible = new StringBuilder();
        if (remain > 0)
            divisible.append(remain);
        if (isEventDigits) {
            divisible.append(nums[index]).append(nums[index + 1]);
        } else {
            if (index == 0)
                return nums[index];
            divisible.append(nums[index - 1]).append(nums[index]);
        }
        return Integer.parseInt(divisible.toString());
    }

    public int[] getNumsFromValue(int value) {
        String valueString = Integer.toString(value);
        int length = valueString.length();
        int[] nums = new int[length];
        int index = length - 1;
        while (index >= 0) {
            value = Integer.parseInt(valueString.substring(0, index + 1));
            nums[index] = value % 10;
            index--;
        }
        return nums;
    }

    public int sqrt(int value) {
        if (value == 0)
            return 0;
        long start = 1, end = value;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long square = mid * mid;

            if (square == value)
                return (int) mid;
            else if (square < value) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (end * end == value)
            return (int) end;
        else
            return (int) start - 1;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums2);
        for (Integer num : nums1) {
            if (binarySearch(num, nums2)) {
                set.add(num);
            }
        }

        int[] result = new int[set.size()];
        int index = 0;
        for (Integer item : set) {
            result[index++] = item;
        }
        return result;
    }

    public boolean binarySearch(int num, int[] nums) {
        int l = 0, h = nums.length;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == num)
                return true;
            else if (nums[mid] > num) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        if (l >= 0 && l < nums.length) {
            return nums[l] == num;
        } else if (h >= 0 && h < nums.length) {
            return nums[h] == num;
        } else
            return false;
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> intersectors = new ArrayList<Integer>();
        Arrays.sort(nums2);
        for (Integer num : nums1) {
            if (binarySearch(num, nums2)) {
                intersectors.add(num);
            }
        }

        int[] result = new int[intersectors.size()];
        int index = 0;
        for (Integer item : intersectors) {
            result[index++] = item;
        }
        return result;
    }

    public boolean isPerfectSquare(int num) {
        long start = 1, end = num;

        while (start < end) {
            long mid = start + (end - start) / 2;
            long square = mid * mid;
            if (square == num)
                return true;
            else if (square < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (end * end == num)
            return true;
        else
            return false;
    }

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0)
            return new int[] { -1, -1 };
        else if (nums.length == 1 && nums[0] == target)
            return new int[] { 0, 0 };
        int start = 0, end = nums.length-1;
        int left = -1, right = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                left = findLeftTarget(nums, start, mid, target);
                right = findRightTarget(nums, mid, end, target);
                break;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid+1;
            }
        }
        return new int[] { left, right };
    }

    public int findLeftTarget(int[] nums, int start, int end, int target) {
        int mid = start + (end - start) / 2;
        if (start < end) {
            if (nums[mid] == target) {
                return findLeftTarget(nums, start, mid, target);
            } else if (nums[mid] < target) {
                return findLeftTarget(nums, mid + 1, end, target);
            } else {
                return findLeftTarget(nums, start, mid - 1, target);
            }
        }
        if (nums[end] == target)
            return end;
        return -1;
    }

    public int findRightTarget(int[] nums, int start, int end, int target) {
        int mid = start + (end - start) / 2;
        if (start < end && start < mid) {
            if (nums[mid] == target) {
                return findRightTarget(nums, mid, end, target);
            } else if (nums[mid] < target) {
                return findRightTarget(nums, mid + 1, end, target);
            } else {
                return findRightTarget(nums, start, mid - 1, target);
            }
        }
        if (nums[end] == target)
            return end;
        if(nums[mid] == target)
            return mid;
        return -1;
    }

    public int search(int[] nums, int target) {
        int pivot = findRotationIndex(nums, 0, nums.length-1);
        if(pivot != -1) {
            if(target <= nums[pivot] && target >= nums[0]) {
                return binarySearch(nums, 0, pivot, target);
            } else return binarySearch(nums, pivot+1, nums.length-1, target);
        } else return binarySearch(nums, 0, nums.length-1, target);
    }

    public int findRotationIndex(int[] nums, int left, int right) {
        if(left < right) {
            int mid = left + (right-left)/2;
            if(mid < nums.length-1 && nums[mid] > nums[mid+1]) {
                return mid;
            } else if(mid > 0 && nums[mid] < nums[mid-1]) {
                return mid-1;
            } else if(nums[mid] > nums[right]) {
                return findRotationIndex(nums, mid, right);
            } else {
                return findRotationIndex(nums, left, mid);
            }
        }
        return -1;
    }

    public int binarySearch(int[] nums, int left, int right, int target) {
        if(left < right) {
            int mid = left+(right-left)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) return binarySearch(nums, left, mid-1, target);
            else return binarySearch(nums, mid+1, right, target);
        }
        if(nums[left] == target) return left;
        return -1;
    }

    @Test
    public void search_returnsIndexOfTargetEementInRotatedArray() {
        int[] nums = new int[]{1,2,3,4,0};
        int result = search(nums, 0);

        assertEquals(4, result);
    }

    @Test
    public void findTarget_ReturnsLeftMostTargetIndex() {
        int[] nums = { 3, 3, 3, 3, 4, 5 };
        int result = findLeftTarget(nums, 0, 3, 3);

        assertEquals(0, result);
    }

    @Test
    public void searchRange_returnsArrayWithValidResult() {
        int[] nums = new int[] { 3, 4 };
        int[] result = searchRange(nums, 3);

        assertArrayEquals(new int[] { 0, 0 }, result);
    }

    @Test
    public void perfectSquare_returnsTrueIfNumIsPerfectSquare() {
        int value = (int) (Math.pow(2, 31) - 1);
        boolean result = isPerfectSquare(value);
        assertEquals(false, result);
    }

    @Test
    public void intersect_returnsIntersectedArray() {
        int[] result = intersect(new int[] { 1, 2 }, new int[] { 1, 1 });
        assertArrayEquals(new int[] { 1 }, result);
    }

    @Test
    public void intersection_returnsIntersectedArray() {
        int[] result = intersection(new int[] { 1, 2 }, new int[] { 1, 1 });
        assertArrayEquals(new int[] { 1 }, result);
    }

    @Test
    public void binarySearch_returnsTrueIfFound() {
        boolean result = binarySearch(5, new int[] { 1, 2, 3, 4, 5 });

        assertEquals(true, result);
    }

    @Test
    public void sqrt_returnsRootOfGivenValue() {
        int result = sqrt(802);

        assertEquals(28, result);
    }

    @Test
    public void mySqrt_returnsValidSqrt() {
        int result = mySqrt(625);

        assertEquals(25, result);
    }

    @Test
    public void getRemainder_returnsValidRemainder() {
        int result = getRemainder(10, 3, "");

        assertEquals(1, result);
    }

    @Test
    public void getDivider_returnsValidDivider() {
        int result = getDivider(124, "3");

        assertEquals(2, result);
    }

    @Test
    public void getNextDivider_returnsValidDivider() {
        int result = getNextDivider(124, "6", 0, 9);

        assertEquals(2, result);
    }

    @Test
    public void getDivisible_returnsValidDivisible() {
        int result = getDivisible(2, new int[] { 1, 0, 2, 4 }, 1);

        assertEquals(124, result);
    }

    @Test
    public void getNumsFromValue_returnsValidNumsArray() {
        int[] result = getNumsFromValue(1024);

        assertArrayEquals(new int[] { 1, 0, 2, 4 }, result);

    }
}
