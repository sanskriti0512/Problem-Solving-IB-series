public class MaximumUnsortedSubarray {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        ArrayList<Integer> a=new ArrayList<>();
        int n=A.size();
        for(int i=0;i<n;i++)
        a.add(A.get(i));
        Collections.sort(a);
        int s=0;
        for( s=0;s<n;s++){
            if(a.get(s)!=A.get(s))
            break;
        }
        int e=n-1;
        for(;e>s;e--){
            if(a.get(e)!=A.get(e))
            break;
        }
        ArrayList<Integer>ans=new ArrayList<>();
        if(s==n)
        {
            ans.add(-1);
            return ans;
        }
        ans.add(s);ans.add(e);
        return ans;
    }
}
