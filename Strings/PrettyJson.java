public class PrettyJson {
    public ArrayList<String> prettyJSON(String A) {
        ArrayList<String> ans=new ArrayList<>();
        int i=0,j=0;
        int tab=0;
        while(i<A.length() && j<A.length()){
            char ch=A.charAt(j);
            if(ch==',')
            {
                 String k="";
                 for(int y=0;y<tab;y++)
                 k=k+"\t";
                 if(i!=j+1)
                ans.add(k+A.substring(i,j+1));
                j++;
                i=j;
            }
           else if(ch=='[')
            {
                 String k="";
                 for(int y=0;y<tab;y++)
                 k=k+"\t";
                 if(i!=j)
                ans.add(k+A.substring(i,j));
                ans.add(k+"[");
                j++;
                i=j;
                tab++;
            }
           else if(ch=='{')
            {
                 String k="";
                 for(int y=0;y<tab;y++)
                 k=k+"\t";
                if(i!=j)
                ans.add(k+A.substring(i,j));
                ans.add(k+"{");
                j++;
                i=j;
                tab++;
            }
          else  if(ch==']'){
               tab--;
                String k="";
                for(int y=0;y<tab;y++)
                 k=k+"\t";
                 if(i!=j)
               ans.add(k+"\t"+A.substring(i,j));
              if(j<A.length()-1 && A.charAt(j+1)==','){
               ans.add(k+"],");
               j++;
                   
               }
               else
                ans.add(k+"]");
               j++;
                i=j; 
               
            }
           else if(ch=='}'){
                tab--;
                 String k="";
                for(int y=0;y<tab;y++)
                 k=k+"\t";
                 if(i!=j)
               ans.add(k+"\t"+A.substring(i,j));
               if(j<A.length()-1 && A.charAt(j+1)==','){
               ans.add(k+"},");
               j++;
                   
               }
               else
                ans.add(k+"}");
               j++;
                i=j; 
               
            }
            else
            j++;
        }
         if(i!=j)
         ans.add(A.substring(i,j));
         return ans;
    }
}
