public class Diffk {
    public int diffPossible(ArrayList<Integer> A, int B) {
        int i=0,j=1;
        int n=A.size();
        while(i<n && j<n){
            int diff=A.get(j)-A.get(i);
            if(diff==B && i!=j)
            return 1;
            else if(diff>B)
            i++;
            else
            j++;
        }
        return 0;
    }
}
