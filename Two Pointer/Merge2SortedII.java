public class Merge2SortedII {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer>ans=new ArrayList<>();
        int i,j;
        for( i=0,j=0;i<a.size()&& j<b.size();){
            int x=a.get(i);
            int y=b.get(j);
            if(x==y){
                ans.add(x);
                ans.add(y);
                i++;j++;
            }else if(x<y){
                ans.add(x);
                i++;
            }else{
                ans.add(y);
                j++;
            }
        }
        int k=0;
       int t=a.size();
        while(i<t){
            ans.add(a.get(i));
            i++;
        }
      //  System.out.print(a.size()+"*");
        while(k<ans.size() && k<a.size()){
            a.set(k,ans.get(k));
            k++;
        }
        while(k<ans.size() && k>=a.size()){
            a.add(ans.get(k));
            k++;
        }
         
        while(j<b.size()){
            a.add(b.get(j));
            j++;
        }
    }
}