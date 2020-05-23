public class WaveArray {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        int n=A.size();
        
        for(int i=0;i<n-1;i=i+2){
            Collections.swap(A,i,i+1);
        }
    
        return A;
    }
}
