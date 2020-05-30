public class LongestCommonPrefix {
    public String LCP(String a,String b){
        String ans="";
        for(int i=0;i<a.length() && i<b.length();i++){
            if(a.charAt(i)==b.charAt(i))
            ans=ans+a.charAt(i);
            else
            break;
        }
        return ans;
    }
    public String longestCommonPrefix(ArrayList<String> A) {
        if(A.size()==1)
        return A.get(0);
        String ans=LCP(A.get(1),A.get(0));
        for(int i=2;i<A.size();i++){
            ans=LCP(ans,A.get(i));
        }
        return ans;
    }
}
