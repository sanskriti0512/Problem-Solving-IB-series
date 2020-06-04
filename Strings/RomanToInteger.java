public class RomanToInteger {
    public int romanToInt(String A) {
        String s=A;
          HashMap<String,Integer>h=new HashMap<>();
        h.put("I",1);
        h.put("V",5);
        h.put("X",10);
        h.put("L",50);
        h.put("C",100);
          h.put("D",500);
        h.put("M",1000);
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='I'){
                if(i<n-1 && (s.charAt(i+1)=='V'||s.charAt(i+1)=='X'||s.charAt(i+1)=='L'||s.charAt(i+1)=='C'||s.charAt(i+1)=='D'||s.charAt(i+1)=='M')){
                    int k=h.get(s.charAt(i+1)+"");
                    ans=ans+k-1;
                    i++;
                }else{
                    ans=ans+1;
                }
            }
                 else       if(s.charAt(i)=='V'){
                if(i<n-1 && (s.charAt(i+1)=='X'||s.charAt(i+1)=='L'||s.charAt(i+1)=='C'||s.charAt(i+1)=='D'||s.charAt(i+1)=='M')){
                    int k=h.get(s.charAt(i+1)+"");
                    ans=ans+k-5;
                    i++;
                }else{
                    ans=ans+5;
                }
            }
                else        if(s.charAt(i)=='X'){
                if(i<n-1 && (s.charAt(i+1)=='L'||s.charAt(i+1)=='C'||s.charAt(i+1)=='D'||s.charAt(i+1)=='M')){
                    int k=h.get(s.charAt(i+1)+"");
                    ans=ans+k-10;
                    i++;
                }else{
                    ans=ans+10;
                }
            } else            if(s.charAt(i)=='L'){
                if(i<n-1 && (s.charAt(i+1)=='C'||s.charAt(i+1)=='D'||s.charAt(i+1)=='M')){
                    int k=h.get(s.charAt(i+1)+"");
                    ans=ans+k-50;
                    i++;
                }else{
                    ans=ans+50;
                }
            }
            else             if(s.charAt(i)=='C'){
                if(i<n-1 && (s.charAt(i+1)=='D'||s.charAt(i+1)=='M')){
                    int k=h.get(s.charAt(i+1)+"");
                    ans=ans+k-100;
                    i++;
                }else{
                    ans=ans+100;
                }
            }
            else             if(s.charAt(i)=='D'){
                if(i<n-1 && (s.charAt(i+1)=='M')){
                    int k=h.get(s.charAt(i+1)+"");
                    ans=ans+k-500;
                    i++;
                }else{
                    ans=ans+500;
                }
            }else{
                ans=ans+1000;
            }
        }
        return ans;
    }
}
