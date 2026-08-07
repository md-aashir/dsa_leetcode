class Solution {
    public boolean isPalindrome(int x) {
        int digits, rev=0, temp=x;
        while(temp>0){
            digits=temp%10;
            rev=(rev*10)+digits;
            temp/=10;
        }
        return rev==x;
    }
}