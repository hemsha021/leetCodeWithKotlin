package app.hoofzy.utils

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for(i in nums.indices){
            for(j in i+1 until nums.size){
                if(nums[i]+nums[j] == target){
                    return intArrayOf(i,j)
                }
            }
        }
        return IntArray(0)
    }

//        0     1     2     3     4     5     6     7
//    0 (0,0) (0,1) (0,2) (0,3) (0,4) (0,5) (0,6) (0,7)
//    1       (1,1) (1,2) (1,3) (1,4) (1,5) (1,6) (1,7)
//    2             (2,2) (2,3) (2,4) (2,5) (2,6) (2,7)
//    0                   (3,3) (3,4) (3,5) (3,6) (3,7)
//    0                         (4,4) (4,5) (4,6) (4,7)
//    0                               (5,5) (5,6) (5,7)
//    0                                     (6,6) (6,7)
//    0                                           (7,7)

}