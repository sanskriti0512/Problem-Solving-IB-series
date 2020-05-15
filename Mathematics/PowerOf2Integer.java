public class PowerOf2Integer {
   
    public int isPower(int A) {
        if(A==1)
        return 1;
        for(int i=2;i<=Math.sqrt(A);i++){
            double k=Math.log(A)/Math.log(i);
         //  System.out.print(k+" "+i+"*");
           if((k-(int)k) < 0.000001)
                return 1;
           
        }
        return 0;
    }
}