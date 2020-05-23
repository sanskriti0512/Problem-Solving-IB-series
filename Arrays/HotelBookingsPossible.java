public class HotelBookingsPossible {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        int n=arrive.size();
        ArrayList<pair> a=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            a.add(new pair(arrive.get(i),depart.get(i)));
        }
        Collections.sort(a,new SortI());
       PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(); 
       pQueue.add(a.get(0).e);
        for(int i=1;i<n;i++){
            if(a.get(i).s==a.get(i).e)
            continue;
            if(pQueue.peek()<=a.get(i).s){
            pQueue.add(a.get(i).e);
            pQueue.poll();
            }else if(pQueue.size()<K){
                  pQueue.add(a.get(i).e);
            }
            else
            return false;
        }
        return true;
    }
}
class pair{
    int s;
    int e;
    public pair(int x,int y){
        s=x;e=y;
    }
}
class SortI implements Comparator<pair> 
{ 
    public int compare(pair a, pair b) 
    { 
       if(a.s==b.s)
       return a.e-b.e;
        return a.s-b.s;
    } 
}