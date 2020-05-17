public class SortedPermutationRankwithRepeats {
    public int[] fact(int A) {
        int[] fact = new int[A + 1];
        fact[0] = 1;
        for (int i = 1; i <= A; i ++) {
            fact[i] = (fact[i - 1] * i) % 1000003;
        }
        return fact;
    }
    
    public long modExp(long xx, long yy) {
        int M = 1000003;
        long res = 1;
        long x = xx;
        long y = yy;
        while (y > 0) {
            if ((y & 1) == 1) {
                res = (res * x) % M;
            }
            x = (x * x) % M;
            y >>= 1;
        }
        return res;
    }
    
    public int findRank(String A) {
        char[] arr = A.toCharArray();
        int[] fact = fact(arr.length);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i ++) {
            int c = arr[i];
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        long rank = 1;
        for (int i = 0; i < arr.length; i ++) {
            int c = arr[i];
            Map<Integer, Integer> smaller = map.headMap(c);
            for (int key : smaller.keySet()) {
                long redundency = 1;
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getKey() != key) {
                        redundency = (redundency * fact[entry.getValue()]) % 1000003;
                    } else {
                        redundency = (redundency * fact[entry.getValue() - 1]) % 1000003;
                    }
                }
                
                rank += (fact[arr.length - i - 1] * modExp(redundency, 1000001)) % 1000003;
            }

            map.put(c, map.get(c) - 1);
            if (map.get(c) <= 0) map.remove(c);
    
        }
        return (int) (rank % 1000003);
    }
}
