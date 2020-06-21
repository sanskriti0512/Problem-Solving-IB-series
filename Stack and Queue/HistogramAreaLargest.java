public class HistogramAreaLargest {
    public int largestRectangleArea(ArrayList<Integer> A) {
        Stack<Integer>s=new Stack<>();
        ArrayList<Integer> ll=new ArrayList<>();
        for(int i=0;i<A.size();i++){
            if(s.isEmpty())
            ll.add(-1);
            else{
                while(s.isEmpty()==false && A.get(s.peek())>=A.get(i))
                s.pop();
                  if(s.isEmpty())
            ll.add(-1);
            else
            ll.add(s.peek());
            }
            s.push(i);
        }
         Stack<Integer>r=new Stack<>();
        ArrayList<Integer> rr=new ArrayList<>();
        for(int i=A.size()-1;i>=0;i--){
            if(r.isEmpty())
            rr.add(A.size());
            else{
                while(r.isEmpty()==false && A.get(r.peek())>=A.get(i))
                r.pop();
                  if(r.isEmpty())
            rr.add(A.size());
            else
            rr.add(r.peek());
            }
            r.push(i);
        }
        int max=Integer.MIN_VALUE;
        Collections.reverse(rr);
        for(int i=0;i<A.size();i++){
          //  System.out.print(rr.get(i)+"*"+ll.get(i)+"/");
            max=Math.max(max,(rr.get(i)-ll.get(i)-1)*A.get(i));
        }
        return max;
    }
}
