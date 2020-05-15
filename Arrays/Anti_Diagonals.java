public class Anti_Diagonals {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        int n=A.size();
        ArrayList<ArrayList<Integer>>ans=new ArrayList<ArrayList<Integer>>();
        for(int c=0;c<n;c++){
            ArrayList<Integer> a=new ArrayList<>();
            int r=0;
          int i=c;
            while(i>=0 && r<n){
                  a.add(A.get(r).get(i));
                 //System.out.print(A.get(r).get(i)+"*");
                  i--;
                  r++;
                 
            }
            ans.add(a);
        }
        for(int row=1;row<n;row++){
            ArrayList<Integer> a=new ArrayList<>();
            int r=row;
          int i=n-1;
            while(i>=0 && r<n){
                  a.add(A.get(r).get(i));
                 //System.out.print(A.get(r).get(i)+"*");
                  i--;
                  r++;
                 
            }
            ans.add(a);
        }
        return ans;
    }
}
