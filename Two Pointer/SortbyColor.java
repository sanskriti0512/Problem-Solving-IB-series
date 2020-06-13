public class SortbyColor {
    public void sortColors(ArrayList<Integer> a) {
        int n=a.size();
        int i=0,z=0,t=n-1;
        for(;z<n;z++){
            if(a.get(z)!=0)
            break;
        }
          for(;t>=0;t--){
            if(a.get(t)!=2)
            break;
        }
        i=z;
        for(;i<=t ;){
            if(a.get(i)==1)
            i++;
            else if(a.get(i)==0 && z<n){
                if(i==z){
                    i++;z++;
                    continue;
                }
                int temp=a.get(z);
                a.set(z,0);
                z++;
                a.set(i,temp);
            }
            else if(a.get(i)==2 && t>=0){
                if(i==t){
                    i++;t--;
                    continue;
                }
                int temp=a.get(t);
                a.set(t,2);
                t--;
                a.set(i,temp);
            }
        }
    }
}
