/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class MergeIntervals {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        int n=intervals.size();
        if(n==0){
             ArrayList<Interval> ans=new ArrayList<>();
             ans.add(newInterval);
             return ans;
        }
        for(int j=0;j<n;j++){
            if(intervals.get(j).start>intervals.get(j).end){
                int kk=intervals.get(j).start;
                intervals.get(j).start=intervals.get(j).end;
                intervals.get(j).end=kk;
            }
        }
         if(newInterval.start>newInterval.end){
                int kk=newInterval.start;
                newInterval.start=newInterval.end;
               newInterval.end=kk;
            }
Stack<Interval> s=new Stack<>();
boolean newI=false;
int i;
if(newInterval.start<intervals.get(0).start){
    s.push(newInterval);
    newI=true;
    i=0;
}else{
    s.push(intervals.get(0));
     i=1;
}
    while(i<n){
        Interval t=s.peek();
        if(newI==false){
            if(newInterval.start<t.end){
                if(newInterval.end<t.start){
                    s.pop();
                    s.push(newInterval);
                    s.push(t);
                }else
                {
                    s.pop();
                    Interval k=new Interval();
                    int ss=Math.min(t.start,Math.min(t.end,Math.min(newInterval.start,newInterval.end)));
                     int ee=Math.max(t.start,Math.max(t.end,Math.max(newInterval.start, newInterval.end)));
                     k.start=ss;
                     k.end=ee;
                     s.push(k);
                }
                newI=true;
            }
            
        }
         t=s.peek();
         if(intervals.get(i).start<t.end){
             s.pop();
                    Interval k=new Interval();
                    int ss=Math.min(t.start,Math.min(t.end,Math.min(intervals.get(i).start,intervals.get(i).end)));
                     int ee=Math.max(t.start,Math.max(t.end,Math.max(intervals.get(i).start, intervals.get(i).end)));
                     k.start=ss;
                     k.end=ee;
                     s.push(k);
         }else{
             s.push(intervals.get(i));
         }
         i++;
    }
    
     Interval t=s.peek();
        if(newI==false){
            if(newInterval.start<t.end){
                if(newInterval.end<t.start){
                    s.pop();
                    s.push(newInterval);
                    s.push(t);
                }else
                {
                    s.pop();
                    Interval k=new Interval();
                    int ss=Math.min(t.start,Math.min(t.end,Math.min(newInterval.start,newInterval.end)));
                     int ee=Math.max(t.start,Math.max(t.end,Math.max(newInterval.start, newInterval.end)));
                     k.start=ss;
                     k.end=ee;
                     s.push(k);
                }}
                else{
                    s.push(newInterval);
                }
                newI=true;
            }
    
        
    ArrayList<Interval> ans=new ArrayList<>();
    while(s.isEmpty()==false)
    ans.add(s.pop());
    Collections.reverse(ans);
    return ans;
}
    }

