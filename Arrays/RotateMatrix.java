public class RotateMatrix {
    public void transpose(ArrayList<ArrayList<Integer>>a){
        for(int i=0;i<a.size();i++){
            for(int j=0;j<i;j++){
                int temp=a.get(i).get(j);
                a.get(i).set(j,a.get(j).get(i));
                a.get(j).set(i,temp);
            }
        }
    }
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        transpose(a);
        int i=0,j=a.size()-1;
        for(;i<j;i++,j--){
            for(int k=0;k<a.size();k++){
                int temp=a.get(k).get(j);
                a.get(k).set(j,a.get(k).get(i));
                a.get(k).set(i,temp);
            }
        }
    }
}
