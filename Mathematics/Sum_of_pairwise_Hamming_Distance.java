public class Sum_of_pairwise_Hamming_Distance {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int hammingDistance(final List<Integer> A) {
        long ans=0;
        long n=A.size();
        long max=0;
        
        for(int l=0;l<n;l++){
        max=Math.max(max,A.get(l));
            
        }
        for(long i=1;i<=max;i=i*2){
            long k=0;
            for(int j=0;j<n;j++){
                long x=A.get(j)&i;
                if(x==i)
                k++;
            }
            long temp=(2*(k%1000000007*(n-k)%1000000007))%1000000007;
            ans=(ans%1000000007+temp%1000000007)%1000000007;
        }
        return (int)ans%1000000007;
    }
}
