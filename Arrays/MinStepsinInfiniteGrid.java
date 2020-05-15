public class MinStepsinInfiniteGrid {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int num=0;
        for(int i=0;i<A.size()-1;i++){
        int sx=A.get(i);
        int sy=B.get(i);
        int dx=A.get(i+1);
        int dy=B.get(i+1);
        if(sx<dx && sy<dy){
            int x=dx-sx;
            int y=dy-sy;
            if(x<y){
                sx=dx;
                sy=sy+x;
                num+=x;
            }else{
                 sx=sx+y;
                sy=sy+y;
                num+=y;
            }
        }
        if(sx<dx && sy>dy){
            int x=dx-sx;
            int y=sy-dy;
            if(x<y){
                sx=sx+x;
                sy=sy-x;
                num+=x;
            }else{
                 sx=sx+y;
                sy=sy-y;
                num+=y;
            }
        }
        if(sx>dx && sy<dy){
            int x=sx-dx;
            int y=dy-sy;
            if(x<y){
                sx=sx-x;
                sy=sy+x;
                num+=x;
            }else{
                 sx=sx-y;
                sy=sy+y;
                num+=y;
            }
        }
        if(sx>dx && sy>dy){
            int x=sx-dx;
            int y=sy-dy;
            if(x<y){
                sx=sx-x;
                sy=sy-x;
                num+=x;
            }else{
                 sx=sx-y;
                sy=sy-y;
                num+=y;
            }
        }
        if(sy==dy){
            int x=dx-sx;
            num=num+Math.abs(x);
            sx=dx;
        }
        if(sx==dx){
             int y=dy-sy;
            num=num+Math.abs(y);
            sy=dy;
        }
        }
        return num;
    }
}
