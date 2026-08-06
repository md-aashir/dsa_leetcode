class Solution {
    public int smallestNumber(int n, int t) {
        int temp1,temp2,digits;
        for(int i=0;i<10;i++)
        {
            temp1=n+i;
            temp2=temp1;
            digits=1;
            while(temp1>0){
                digits*=(temp1%10);
                temp1/=10;
            }
            if(digits%t==0)
                return temp2;
        }
        return 0;
    }
}