public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        int count=0;
        int temp=n;
        while(temp>0)
        {
            int digit=temp%10;
            if(digit!=0&&n%digit==0)
            {
                count++;
            }
           
            temp/=10;

        }
        return count;

        

    }
}
