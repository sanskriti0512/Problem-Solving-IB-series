public class SortedPermutationRank {
     long factorial(long n) 
  { 
  
    // single line to find factorial 
    return (n == 1 || n == 0) ? 1 : (n * factorial(n - 1)%1000003)%1000003; 
  
  } 
    public int findRank(String A) {
        char[]arr=new char[A.length()];
        int n=A.length();
        if(n==1)
        return 1;
        for(int i=0;i<n;i++){
            arr[i]=A.charAt(i);
        }
        Arrays.sort(arr);
       
        HashMap<Character,Integer>h=new HashMap<>();
         for(int i=0;i<n;i++){
         
             h.put(arr[i],i);
         }
        int rank=1;
        for(int i=n-2;i>=0;i--){
            int sortedin=h.get(A.charAt(i));
            int diff=0;
             for(int j=i+1;j<n;j++){
               if(h.get(A.charAt(j))<sortedin)
               diff++;
           }
           
         // System.out.print(diff+"*");
                
                int s=n-i-1;
                long f=factorial((long)s);
                rank=(int)(rank+(f*diff)%1000003+1000003)%1000003;;
                // rank=(rank%1000003+1000003)%1000003;
                }
              
        
        return (rank%1000003+1000003)%1000003;
    }
}
