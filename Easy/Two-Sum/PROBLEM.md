<h3>Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
<br>
You may assume that each input would have exactly one solution, and you may not use the same element twice.
<br>
You can return the answer in any order.
</h3>
 <hr>

Example 1:<br>
Input: nums = [2,7,11,15], target = 9   <br>
Output: [0,1]   <br>
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].   <br>

Example 2:   <br>
Input: nums = [3,2,4], target = 6   <br>
Output: [1,2]   <br>

Example 3:   <br>
Input: nums = [3,3], target = 6   <br>
Output: [0,1]   
 
<hr>
Constraints:   <br>

2 <= nums.length <= 10^4   <br>
-10^9 <= nums[i] <= 10^9   <br>
-10^9 <= target <= 10^9   <br>
Only one valid answer exists.  
 
<hr>
Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
