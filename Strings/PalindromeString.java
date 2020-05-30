public class PalindromeString {
    public boolean isalphanum(char ch){
        if(ch>='a' && ch<='z')
            return true;
            if(ch>='0' && ch<='9')
                return true;
             if(ch>='A' && ch<='Z')
            return true;
            return false;
    }
    public int isPalindrome(String A) {
       
        int p=0,q=A.length()-1;
        while(p<A.length() && q>=0 && p<q){
            while(p<A.length() && isalphanum(A.charAt(p))==false)
            p++;
            while(q>=0 && isalphanum(A.charAt(q))==false)
            q--;
            if(p<A.length() && q>=0 && p<q){
           char s=A.charAt(p), e=A.charAt(q);
           if(s>='A' && s<='Z'){
               s=(char)(s-'A'+'a');
           }
            if(e>='A' && e<='Z'){
               e=(char)(e-'A'+'a');
           }
           if(s!=e){
          
           return 0;
           }
    p++;q--;       
        }
        }
        return 1;
        
    }
}
