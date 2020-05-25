public class SetMatrixZeroesApproach1 {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int r=a.size();
        int c=a.get(0).size();
        HashSet<Integer> rr=new HashSet<>();
        HashSet<Integer> cc=new HashSet<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a.get(i).get(j)==0)
                {
                    rr.add(i);
                    cc.add(j);
                }
            }
        }
          for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(rr.contains(i))
                a.get(i).set(j,0);
                if(cc.contains(j))
                a.get(i).set(j,0);
            }}
    }
}