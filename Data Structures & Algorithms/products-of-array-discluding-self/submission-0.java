class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] prefixProd = new int[n];
        int[] suffProd = new int[n];

        prefixProd[0] = 1;
        suffProd[n-1] = 1;

        for(int i = 1;i<n; i++) {
            prefixProd[i] =nums[i-1] * prefixProd[i-1] ; 
        }

        for(int j = n-2;j>=0;j--) {
            suffProd[j] = nums[j+1] * suffProd[j+1];
        }
        
        for(int i = 0;i<n;i++) {
            result[i] = prefixProd[i] * suffProd[i];
        }

        return result;
    }
}  
