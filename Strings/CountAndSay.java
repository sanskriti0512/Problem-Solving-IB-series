public class CountAndSay {
    public String countAndSay(int A) {
        if(A==1)
        return "1";
        String s=countAndSay(A-1);
        String ans="";
        int i,j;
        for( i=0,j=0;i<s.length() && j<s.length();){
            if(s.charAt(i)==s.charAt(j))
            j++;
            else{
                ans=ans+(j-i)+""+s.charAt(i);
                i=j;
            }
        }
          ans=ans+(j-i)+""+s.charAt(i);
          return ans;
    }
}
