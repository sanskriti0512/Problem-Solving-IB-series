class minStack {
     Stack<Integer>s;
     int min=-1;
    public Solution(){
        s=new Stack<>();
    }
    public void push(int x) {
        if(s.isEmpty()){
            s.push(x);
            min=x;
        }
        else if(x>=min){
            s.push(x);
        }else{
            s.push(2*x-min);
            min=x;
        }
    }

    public void pop() {
        if(s.isEmpty())
        return;
         if(s.peek()<min){
             min=2*(min)-s.pop();
        }else{
             s.pop();
        }
    }

    public int top() {
        if(s.isEmpty())
        return -1;
        if(s.peek()<min){
            return min;
        }else{
            return s.peek();
        }
    }

    public int getMin() {
        if(s.isEmpty())
        return -1;
        return min;
    }
}
