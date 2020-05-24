public class NobleInteger {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer>h=new HashMap<>();
    int n =A.size();
        for(int i=0;i<n;i++){
            h.put(A.get(i),i);
        }
        Set<Integer> keys=h.keySet();
        for(int x:keys){
            if(x==n-1-h.get(x))
            return 1;
        }
        return -1;
    }
}
