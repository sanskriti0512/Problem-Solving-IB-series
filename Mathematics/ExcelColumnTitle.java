public class ExcelColumnTitle {
    public String convertToTitle(int A) {
        StringBuilder ans=new StringBuilder();
        int in=0;
        int i=1;
        int len=0;
        while(in<A){
            in=in+(int)Math.pow(26,i);
            i++;
            len++;
        }
        
        while(len>0){
            int l=(int)Math.pow(26,len-1);
            int d=(A/l);
            if(d==0)
            d=26;
            char ch=(char)('A'+(d-1));
         if(d==26 && ans.length()!=0){
             int k=ans.length()-1;
             char c=ans.charAt(k);
             ans.deleteCharAt(k);
             c--;
             if(c=='A'-1)
            c='Z';
                          ans.append(c);
                          k--;
             while(c=='Z' && k>=0){
                 c=ans.charAt(k);
             ans.deleteCharAt(k);
             c--;
             if(c=='A'-1)
            c='Z';
                          ans.replace(k,k,c+"");
                          k--;
             }

         } 
             ans.append(ch);
             
            A=A%l;
            
             
            
            len--;
        }
        return ans.toString();
    }
}
