class Solution {
    public boolean isPalindrome(String s) {
         s=s.toLowerCase().replaceAll("[^a-z0-9]","");
    //   String rev=new StringBuilder(s).reverse().toString();

    //   return s.equals(rev);

    int left=0;
    int right=s.length()-1;
    while(left<right){
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
        
        
    }
}