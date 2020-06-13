public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(ArrayList<Integer> a) {
        int s=0,i=0,j=0,n=a.size();
        for(;i<n && j<n ;){
            if(a.get(i).equals(a.get(j)))
            j++;
            else{
                a.set(s,a.get(i));
                s++;
                i=j;
            }
        }
         a.set(s,a.get(i));
                s++;
                i=j;
        return s;
    }
}
