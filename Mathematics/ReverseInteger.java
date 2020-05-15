public class ReverseInteger {
    public int reverse(int A) {
        boolean neg=false;
        if(A<0){
        neg=true;
         A=A*(-1);
        }
        
        long ans=0;
        
        while(A!=0){
            int rem=A%10;
            ans=(ans*10)+rem;
            A=A/10;
           
        }
        if(neg==true)
        ans=ans*(-1);
        if(Integer.MIN_VALUE > ans)
return 0;

if(Integer.MAX_VALUE < ans)
return 0;
        return (int)ans;
    }
}
