package bhushan.leetcode_question.HashMap;

import java.util.HashMap;

public class ContaisDuplicate2 {

        public boolean containsNearbyDuplicate(int[] A, int k) {
            int n = A.length;
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0; i<n; i++){
                if(map.containsKey(A[i]) == false){
                    map.put(A[i], i);
                }else{
                    int temp = map.get(A[i]);
                    int abs = i - temp;
                    if(abs <= k){
                        return true;
                    }
                    map.put(A[i], i);
                }
            }
            return false;

        }

    }

/*
219. Contains Duplicate II
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 Constraints:
1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105
*/