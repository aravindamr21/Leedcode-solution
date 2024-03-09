class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int n= numbers.length;
       int i=0;
       int j=n-1;
       int mid=0;
       int ans[]=new int[2];
      while(i < j) {
            mid = (i+j)/2;
            int sum = numbers[i] + numbers[j]; 
            if(sum == target) {
                ans[0] = i+1;
                ans[1] = j+1;
                return ans;
            }
           else if(sum<target)  
           {
               if(numbers[j]+numbers[mid]<target)
               {
                   i=mid+1;
               }
               else{
                   i++;
               }
              
           }
           else{
               if(numbers[i]+numbers[mid]>target) 
               {
                   j=mid-1;
               }
               else{
                   j--;
               }
           }
           
       }
       return ans;
    }
}
