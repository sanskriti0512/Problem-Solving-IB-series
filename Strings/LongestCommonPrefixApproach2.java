public class LongestCommonPrefixApproach2 {
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
        Collections.sort(A);
        String ans=LCP(A.get(A.size()-1),A.get(0));
        
        return ans;
    }
}
