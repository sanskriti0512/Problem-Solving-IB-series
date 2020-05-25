public class  SetMatrixZeros {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int r=a.size();
        int c=a.get(0).size();
        boolean first_row=false,first_col=false;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a.get(i).get(j)==0)
                {
                a.get(i).set(0,0);
                 a.get(0).set(j,0);
                 if(i==0)
                 first_row=true;
                 if(j==0)
                 first_col=true;
                }
            }
        }
          for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(a.get(0).get(j)==0)
                a.get(i).set(j,0);
                if(a.get(i).get(0)==0)
                a.get(i).set(j,0);
            }}
            if(first_col==true){
                 for(int i=0;i<r;i++)
                  a.get(i).set(0,0);
            }
            if(first_row==true){
                 for(int i=0;i<c;i++)
                  a.get(0).set(i,0);
            }
    }
}
