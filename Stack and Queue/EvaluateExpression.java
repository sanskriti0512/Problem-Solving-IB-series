public class EvaluateExpression {
    public int evalRPN(ArrayList<String> A) {
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<A.size();i++){
            if(A.get(i).equals("+") ){
                int k=s.pop();
                int l=s.pop();
                s.push(l+k);
                
            }else if(A.get(i).equals("*") ){
                int k=s.pop();
                int l=s.pop();
                s.push(l*k);
            }else if(A.get(i).equals("/") ){
                int k=s.pop();
                int l=s.pop();
                s.push(l/k);
            }else if(A.get(i).equals("-") ){
                int k=s.pop();
                int l=s.pop();
                s.push(l-k);
            }else{
                s.push(Integer.parseInt(A.get(i)));
            }
        }
        return s.pop();
    }
}
