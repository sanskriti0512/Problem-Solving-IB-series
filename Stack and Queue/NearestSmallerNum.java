public class NearestSmallerNum {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        Stack<Integer>s=new Stack<>();
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<A.size();i++){
            if(s.isEmpty())
            a.add(-1);
            else{
                while(s.isEmpty() ==false && s.peek()>=A.get(i))
                s.pop();
                 if(s.isEmpty())
            a.add(-1);
            else
            a.add(s.peek());
            }
            s.push(A.get(i));
        }
return a;
    }
}