public class Numbers_of_length_N_and_value_less_than_K
 {
    public int solve(ArrayList<Integer> A, int B, int C) {
        if(A.size()==0)
        return 0;
        if(B==1){
                    int ans=0;
            for(int i=0;i<A.size();i++){
                if(A.get(i)<C)
               ans++;
        }
            return ans;
        }
        int ans=0;
        String b=C+"";
        if(b.length()<B)
        return 0;
        if(b.length()>B){
            if(A.get(0)==0)
            return (A.size()-1)*(int)Math.pow(A.size(),B-1);
            else{
                return (int)Math.pow(A.size(),B);
            }
        }
        for(int j=0;j<b.length();j++){
            int d=b.charAt(j)-'0';
            int f=0;
            int d_p=0;
            for(int i=0;i<A.size();i++){
                if(j==0 && A.get(i)==0)
                continue;
                if(A.get(i)<d)
                f++;
                if(A.get(i)==d)
                d_p=1;
                if(A.get(i)>d)
                break;
            }
            ans=ans+(f*(int)(Math.pow(A.size(),B-j-1)));
            if(d_p==0)
            break;
           // System.out.print(ans+" ");
        }
        return ans;
        
    }
}
