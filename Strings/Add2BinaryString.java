public class Add2BinaryString {
    public String addBinary(String A, String B) {
        int c=0;
        int s=0;
        String ans="";
        int i=A.length()-1,j=B.length()-1;
        for(;i>=0 && j>=0;i--,j--){
            s=(A.charAt(i)-'0')+(B.charAt(j)-'0')+c;
            ans=s%2+""+ans;
            c=s/2;
        }
        while(i>=0){
             s=(A.charAt(i)-'0')+c;
            ans=s%2+""+ans;
            c=s/2;
            i--;
        }
         while(j>=0){
            s=(B.charAt(j)-'0')+c;
            ans=s%2+""+ans;
            c=s/2;
            j--;
        }
       if(c==1)
        ans="1"+ans;
        return ans;
    }
}