public class IntegerToRoman {
    public String intToRoman(int A) {
         int arr[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String s[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
       // StringBuilder str  = new StringBuilder();
        String str="";
        for(int i=0;i<arr.length && A!=0;i++){
            int k=A/arr[i];
            for(int j=0;j<k;j++){
                str=str+s[i];
            }
            A=A-(k*arr[i]);
        }
        return str;
    }
}
