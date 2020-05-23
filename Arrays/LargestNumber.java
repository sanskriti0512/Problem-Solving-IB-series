public class LargestNumber {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String largestNumber(final List<Integer> A) {
        StringBuilder out=new StringBuilder();
        ArrayList<String> num=new ArrayList<>();
        int n=A.size();
        for(int i=0;i<n;i++){
            num.add(A.get(i)+"");
        }
        Collections.sort(num, new Srt());
        String ans="";
       
           if(num.get(0).charAt(0)=='0')
          return "0";
          for(int i=0;i<n;i++){
          
              out.append(num.get(i));
          }
          return out.toString();
    }
    
}

class Srt implements Comparator<String> 
{ 
   
    public int compare(String a, String b) 
    { 
      String xy = a.concat(b); 
    String yx = b.concat(a);
    return yx.compareTo(xy);
    } 
}