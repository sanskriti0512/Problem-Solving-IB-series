public class RedundantBraces {
    public int braces(String A) {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            if(ch=='('||ch=='+' ||ch=='-'||ch=='*'||ch=='/')
            s.push(ch);
            else if(ch==')'){
                if(s.peek()=='(')
                return 1;
                else{
                    while(s.peek()!='(')
                    s.pop();
                    s.pop();
                }
            }
        }
        return 0;
    }
}
