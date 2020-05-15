public class LargestCoprimeDivisor
 {
    public static HashMap<Integer,Integer> primeFactors(int n) 
    { 
        // Print the number of 2s that divide n 
        HashMap<Integer,Integer> h=new HashMap<>();
        while (n%2==0) 
        { 
            if(h.containsKey(2)==false)
           h.put(2,1);
           else
           h.put(2,h.get(2)+1);
            n /= 2; 
        } 
  
        // n must be odd at this point.  So we can 
        // skip one element (Note i = i +2) 
        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            // While i divides n, print i and divide n 
            while (n%i == 0) 
            { 
              if(h.containsKey(i)==false)
                h.put(i,1);
                 else
           h.put(i,h.get(i)+1);
                n /= i; 
            } 
        } 
  
        // This condition is to handle the case whien 
        // n is a prime number greater than 2 
        if (n > 2) 
            h.put(n,1);
            return h;
    } 
    public int cpFact(int A, int B) {
        HashMap<Integer,Integer> a=primeFactors(A);
       HashMap<Integer,Integer> b=primeFactors(B);
       Set<Integer> keys=a.keySet();
       int ans=1;
       for(int x:keys){
           if(b.containsKey(x)==false)
           ans=ans*(int)(Math.pow(x,a.get(x)));
       }
       return ans;
    }
}
