public class PrimeSum {
    static boolean isPrime(int n) { 
        if(n==1 || n==0)
        return false;
        if(n==2)
        return true;
        
    if (n%2==0) return false; 
    
    for(int i=3;i<=Math.sqrt(n);i+=2) { 
        if(n%i==0) 
            return false; 
    } 
    return true;
    }
    public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=2;i<A;i++){
            if(isPrime(i) && isPrime(A-i))
            {
                ans.add(i);
                ans.add(A-i);
                return ans;
            }
        }
        return ans;
    }
}
