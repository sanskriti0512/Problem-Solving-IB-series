public class AmazingSubarrays{
    public int solve(String A) {
        int ans=0;
        for(int i=0;i<A.length();){
            
            char ch= A.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                ans=(ans%10003+(A.length()-i)%10003)%10003;
            }
            i++;
        }
        return ans%10003;
    }
}
