public class AddOneToNumber {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int sum=0,carry=1;
        int n=A.size();
        ArrayList<Integer> ans=new ArrayList<>();
        int j;
        
        for( j=0;j<n;j++)
        {
            if(A.get(j)!=0)
            break;
        }
        if(j==n){
            ans.add(1);
            return ans;
        }
        for(int i=n-1;i>=j+1;i--){
             sum=A.get(i)+carry;
             carry=sum/10;
            ans.add(sum%10);
        }
         sum=A.get(j)+carry;
             carry=sum/10;
             if(sum%10!=0 || (sum%10==0 && carry!=0))
            ans.add(sum%10);
            if(carry!=0)
            ans.add(carry);
        Collections.reverse(ans);
        return ans;
    }
}
