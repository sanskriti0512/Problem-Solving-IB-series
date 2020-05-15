public class PalindromeInteger {
    public int isPalindrome(int A) {
        if(A<0)
        return 0;
                long ans=0;
        int k=A;
        while(A!=0){
            int rem=A%10;
            ans=(ans*10)+rem;
            A=A/10;
           
        }
        if(k==ans)
        return 1;
        else
        return 0;
    }
}
