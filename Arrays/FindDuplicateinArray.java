public class FindDuplicateinArray {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int repeatedNumber(final List<Integer> A) {
        HashMap<Integer,Integer> h =  new HashMap<>();
        
        for(int i=0;i<A.size();i++){
            
            if(h.get(A.get(i))!=null){
                return A.get(i);
            } else {
                h.put(A.get(i),1);    
            }
            
        }
        return -1;
    }
}
