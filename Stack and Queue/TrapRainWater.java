public class TrapRainWater {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int trap(final List<Integer> A) {
        int  maxl=-1,maxr=-1;
        int l[]=new int[A.size()];
        int r[]=new int[A.size()];
        for(int i=0;i<A.size();i++){
            if(maxl<A.get(i)){
            l[i]=-1;
            maxl=A.get(i);
            }
            else
            l[i]=maxl;
        }
        for(int i=A.size()-1;i>=0;i--){
            if(maxr<A.get(i)){
            r[i]=-1;
            maxr=A.get(i);
            }
            else
            r[i]=maxr;
        }
        int ans=0;
        for(int i=0;i<A.size();i++){
        
            if(l[i]==-1 || r[i]==-1)
            continue;
            else{
                ans+=Math.min(l[i],r[i])-A.get(i);
            }
        }
        return ans;
    }
}
