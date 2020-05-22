/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        Collections.sort(intervals, new SortI());
        int n=intervals.size();
        Stack<Interval> s=new Stack<>();
        for(int j=0;j<n;j++){
            if(intervals.get(j).start>intervals.get(j).end){
                int kk=intervals.get(j).start;
                intervals.get(j).start=intervals.get(j).end;
                intervals.get(j).end=kk;
            }
        }
        for(int i=0;i<n;i++){
            if(s.isEmpty()){
                s.push(intervals.get(i));
            }else{
                Interval t=s.pop();
                Interval c=intervals.get(i);
                Interval in=new Interval();
                if(t.start>=c.start && t.start>c.end){
                in.start=c.start;
                in.end=c.end;
                     s.push(in);
                     s.push(t);
                }
                if(t.end<c.start){
                    s.push(t);
                in.start=c.start;
                in.end=c.end;
                     s.push(in);
                     
                }
                else{
                    in.start=Math.min(t.start,c.start);
                    in.end=Math.max(t.end,c.end);
                     s.push(in);
                }
               
            }
        }
        ArrayList<Interval> ans=new ArrayList<>();
    while(s.isEmpty()==false)
    ans.add(s.pop());
    Collections.reverse(ans);
    return ans;
        
        
    }
}
class SortI implements Comparator<Interval> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(Interval a, Interval b) 
    { 
       if(a.start==b.start)
       return a.end-b.end;
        //decsending order
        return a.start-b.start;
    } 
}