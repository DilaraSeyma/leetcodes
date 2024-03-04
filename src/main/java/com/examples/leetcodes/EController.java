package com.examples.leetcodes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

import static java.util.Arrays.sort;

@RestController
public class EController {

    @RequestMapping("/hey")
    public int hey(){

        /*
        //////////Soru 122. Best Time to Buy and Sell Stock II
        int[] prices = {1,2,3,4,5,1,6};
        int difference = 0;
        int buy = prices[0];
        int sell;
        for(int i = 1; i < prices.length; i++){
            sell = prices[i];
            if(sell > buy) {
                if((i == (prices.length - 1) || sell > prices [i+1])) {
                    difference += sell - buy;
                    if (i + 1 < prices.length)
                        buy = prices[i + 1];
                }
            }
            else
                buy = sell;

        }
        return difference;
        */

        //////////Soru121. Best Time to Buy and Sell Stock
        /*
        int[] prices = {1,2};
        int difference = 0;
        int buy = prices[0];
        int sell;
        for(int i = 1; i < prices.length; i++){
            sell = prices[i];
            if(sell > buy ){
                if(difference < (sell - buy))
                    difference = sell - buy;
            }
            else
                buy = sell;

        }
        return difference;
*/


        //////////Soru 189. Rotate Array
        /*int[] prices = {1,2};
        int k = 3;//6712345
        int length = prices.length;
        if(length < k)
            k = k % length;
        int firstNums [] = Arrays.copyOfRange(prices, length-k, length);
        int secondNums[] = Arrays.copyOfRange(prices, 0, length-k);
        System.arraycopy(firstNums, 0, prices, 0, firstNums.length);
        System.arraycopy(secondNums, 0, prices, firstNums.length, secondNums.length);
        
         return 0;*/


        //////////Soru 28. Find the Index of the First Occurrence in a String
        /*String haystack = "pppf", needle = "f";//-1
        //haystack = "sadbutsad", needle = "sad";0
        int length = haystack.length();
        int needLength = needle.length();
        for(int i=0; i < length ; i++){
            if(haystack.charAt(i) == needle.charAt(0) && (i+needLength) <= length && haystack.substring(i, (i+needLength)).equals(needle))
                return i;

        }
         return -1;*/


        //////////Soru 58. Length of Last Word
        /*String s = " l";
        int endIndex = - 1;
        int size = 0;
        int index = s.length() - 1;
        Boolean temp = true;

        for(int i=index; i > -1 ; i--){
            if(endIndex == -1 && s.charAt(i) != ' ') {
                endIndex = i;
                size++;
            }
            else if(endIndex != -1 && s.charAt(i) != ' ')
                size++;
            else if(endIndex != -1 && s.charAt(i) == ' ') {
                return size;
            }

        }
        return size;*/
        //////////Soru 169. Majority Element
        /*int[] prices = {47,47,72,47};
        Arrays.sort(prices);
        int size = prices.length;
        if(size == 0)
            return 0;
        int majorNum = prices[0];
        int lastNum = prices[0];
        int majorSize = 0;
        int tempSize = 0;
        for(int i = 0; i< size ; i++){
            if(prices[i] == lastNum)
                tempSize++;
            else if(i >0 && tempSize >= majorSize){
                majorNum = prices[i-1];
                lastNum = prices[i];
                majorSize = tempSize;
                tempSize = 1;
            }
            lastNum = prices[i];
        }
        if(tempSize > majorSize)
            majorNum = prices[size - 1];

        return majorNum;*/
       //////////Soru 80. Remove Duplicates from Sorted Array II
        /*int[] prices = {1,1,1};
        int uniqueSize = 1;
        int lastNum = prices[0];
        int size = prices.length;
        if(size == 0)
            return 0;
        Boolean temp = false;//true if the same num count is at least 2
        for(int i = 1; i< size ; i++){
            if(prices[i] == lastNum && !temp ){
                temp = true;
                prices[uniqueSize] = prices[i];
                uniqueSize++;
            }
            else if(prices[i] == lastNum && temp  && (i+1) < size && prices[i] != prices[i+1]){
                prices[uniqueSize] = prices[i+1];
                lastNum = prices[uniqueSize];
                uniqueSize++;
                temp = false;
                i++;
            }
            else if(prices[i] > lastNum ){
                lastNum = prices[i];
                prices[uniqueSize] = prices[i];
                uniqueSize++;
                temp = false;
            }
        }
        return uniqueSize;*/


        //////////Soru 26. Remove Duplicates from Sorted Array
       /* int[] prices = {0,0,1,1,1,2,2,3,3,4};
        int size = prices.length;
        int uniqueSize = 1;
        int lastNum = prices[0];
        for(int i = 1; i< size ; i++){
            if(prices[i] == lastNum && (i+1) < size) {
                if(prices[i] != prices[i+1]) {
                    prices[i] = prices[i + 1];
                    i--;
                }

            }else if(lastNum != prices[i]){
                prices[uniqueSize] = prices[i];
                lastNum = prices[i];
                uniqueSize++;
            }
        }
        return uniqueSize;*/
        //////////Soru 209. Minimum Size Subarray Sum
        /*int target = 213;
        int[] prices = {12,28,83,4,25,26,25,2,25,25,25,12};
        prices = Arrays.stream(prices).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        int size = prices.length; // The size of the input array.
        long sum = 0; // The sum of the current subarray.
        int minLength = -1;

        for(int i = 0; i< size ; i++){
            sum += prices[i];

            if(sum >= target ) {
                minLength = i + 1;
                return minLength;
            }
        }
        if(minLength == (-1))
            return 0;
        else
            return minLength;
        */

        ////////// soru Valid Palindrome
        /*
        String s ="0P".replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder reversedString = new StringBuilder();
        reversedString.append(s);
        reversedString = reversedString.reverse();
        if(s.equals(reversedString.toString()))
            return 1;
        return 2;
        */

        //////////soru remove element
        /*
        int[] prices = new int[]{0,1,2,2,3,0,4,2}; // Input array
        int val = 2; // Value to remove
        int[] expectedNums = new int[]{0,1,4,0,3}; // The expected answer with correct size.
        // It is sorted with no values equaling val.

        int k = removeElement(prices, val); // Calls your implementation

        assert k == expectedNums.size;
        sort(prices, 0, k); // Sort the first k elements of prices
        for (int i = 0; i < 5; i++) {
            assert prices[i] == expectedNums[i];
        }
        return k;
        */


        //////////soru merge sorted array
       /* int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int m =3;
        int size=3;
        return merge1(nums1,m,nums2,size);*/
    }
    public int[] merge1(int[] nums1, int m, int[] nums2, int n) {
        int size = m + n;
        int size1= 0;
        int size2= 0;
        int[] beforeNums1 = removeZeros(nums1, m);
        int[] beforeNums2 = removeZeros(nums2, n);
        sort(beforeNums1);
        sort(beforeNums2);

        for(int i = 0; i<size ; i++){
            if((size1 < m && size2 < n && beforeNums1[size1] < beforeNums2[size2]) ||
                size2 == n && size1 <m){
                nums1[i] = beforeNums1[size1];
                size1++;
            }

            else if((size1 < m && size2 <n && beforeNums1[size1] >= beforeNums2[size2]) ||
                    size1 == m && size2 < n){
                nums1[i] = beforeNums2[size2];
                size2++;
            }
        }

        return nums1;
    }

    public int[] removeZeros(int[] nums, int m){
        int[] beforeNums1 = new int[m];
        for(int i = 0; i < m; i++){
            if(nums[i] != 0)
                beforeNums1 [i] = nums[i];

        }

        return beforeNums1;

    }

    public int removeElement(int[] nums, int val) {

        int totalSize = nums.length;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                k++;
                for (int j = i ; j< nums.length -1; j++){
                    nums[j] = nums[j+1];//0 1 2 3 0 4 2  // 0 1 3 0 4 2
                }
                nums[totalSize - 1] = val+1;
                i--;
            }
        }
        return (totalSize - k);
    }


}
