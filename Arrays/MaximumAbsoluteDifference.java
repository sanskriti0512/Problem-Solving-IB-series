public class MaximumAbsoluteDifference {
    public int maxArr(ArrayList<Integer> A) {
        int n=A.size();
        int a[]=new int[n];
        int b[]=new int[n];
        int maxa=Integer.MIN_VALUE;
        int mina=Integer.MAX_VALUE;
        int maxb=Integer.MIN_VALUE;
        int minb=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            a[i]=A.get(i)+i+1;
            b[i]=A.get(i)-i-1;
            }
         for(int i=0;i<n;i++)
         {
             maxa=Math.max(maxa,a[i]);
             mina=Math.min(mina,a[i]);
         }
         for(int i=0;i<n;i++)
         {
             maxb=Math.max(maxb,b[i]);
             minb=Math.min(minb,b[i]);
         }
         int aa=maxa-mina;
         int bb=maxb-minb;
         return Math.max(aa,bb);
    }
}
