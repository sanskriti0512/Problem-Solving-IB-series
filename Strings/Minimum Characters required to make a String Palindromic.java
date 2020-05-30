public class Solution {
    public boolean isPalindrome(String str, int s,int e ){
        while(s<e){
            if(str.charAt(s)!=str.charAt(e))
            return false;
            s++;
            e--;
        }
        return true;
    }
    public int solve(String A) {
        int n=A.length();
        for(int i=n-1;i>=0;i--){
            boolean t=isPalindrome(A,0,i);
            if(t==true){
                return n-i-1;
            }
        }
        return -1;
    }
}
