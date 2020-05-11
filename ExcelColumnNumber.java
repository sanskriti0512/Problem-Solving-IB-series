public class ExcelColumnNumber {
    public int titleToNumber(String A) {
        int n=A.length();
        int ans=0;
        for(int i=1;i<n;i++){
            ans=ans+(int)Math.pow(26,i);
        }
       int rank=1;
        for(int i=0;i<n;i++){
            int k=A.charAt(i)-'A';
            rank=rank+(k*(int)Math.pow(26,n-1-i));
        }
        ans=ans+rank;
        return ans;
        
    }
}
