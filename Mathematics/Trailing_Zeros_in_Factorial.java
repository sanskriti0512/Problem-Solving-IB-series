public class Trailing_Zeros_in_Factorial {
    public int five_two(int A,int n){
        int i=n;
        int ans=0;
        while((A/i)!=0){
            ans=ans+(A/i);
            i=i*n;
        }
        return ans;
    }
    public int trailingZeroes(int A) {
        int five=five_two(A,5);
        int two=five_two(A,2);
        return Math.min(five,two);
    }
}
