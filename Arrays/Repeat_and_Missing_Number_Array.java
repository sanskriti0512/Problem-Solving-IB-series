public class Repeat_and_Missing_Number_Array {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int ans[]= new int[2];
        int f[]= new int[A.length+1];
        for(int i=0;i<A.length;i++){
            f[A[i]]++;
        }
        for(int i=1;i<f.length;i++){
            if(f[i]==2)
            ans[0]=i;
            if(f[i]==0)
            ans[1]=i;
        }
        return ans;
    }
}
