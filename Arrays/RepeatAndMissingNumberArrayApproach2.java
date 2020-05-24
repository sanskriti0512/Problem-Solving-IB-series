public class RepeatAndMissingNumberArrayApproach2 {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int n=A.length;
        long k=0,kk=0,sum=0,sum2=0;
        for(int i=0;i<n;i++){
            k+= A[i];
            sum+=(i+1);
            kk+= (long)A[i]*(long)A[i];
            sum2+=(long)(i+1)*(long)(i+1);
        }
        long diff1=sum-k;
        long diff2=sum2-kk;
        long ba=diff2/diff1;
        long b=(diff1+ba)/2;
        long a=(ba-diff1)/2;
        int []d=new int[2];
        d[0]=(int)a;
        d[1]=(int)b;
        return d;
    }
}
