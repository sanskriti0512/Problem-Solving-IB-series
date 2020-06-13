public class RemoveElementFromArray {
    public int removeElement(ArrayList<Integer> a, int b) {
        int s=0,i=0;
        for(;i<a.size();i++){
            if(a.get(i)!=b){
                   a.set(s,a.get(i));
                s++;
            }
        }
        return s;
    }
}
