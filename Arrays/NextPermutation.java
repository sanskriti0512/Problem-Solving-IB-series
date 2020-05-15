public class NextPermutation {
    public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {
        int mi=-1,mini=-1;int min=Integer.MAX_VALUE;
        int n=A.size();
        
        for(int i=n-1;i>0;i--){
            int j=i-1;
            while(j>=0 && A.get(j)>A.get(i))
            j--;
            if(j>=0){
                if(mi<j){
                    mi=j;
                    min=A.get(i);
                    mini=i;
                }else if(mi==j){
                    if(min>A.get(i))
                    {
                        min=A.get(i);
                        mini=i;
                    }
                }
            }
        }
        if(mi==-1){
             Collections.sort(A);
             return A;
        }
       // System.out.print(A.get(mi)+"*"+A.get(mini));
        Collections.swap(A,mi,mini);
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=mi+1;i<n;i++)
        temp.add(A.get(i));
        Collections.sort(temp);
        for(int i=mi+1;i<n;i++)
       A.set(i,temp.get(i-mi-1));
        return A;
    }
}
