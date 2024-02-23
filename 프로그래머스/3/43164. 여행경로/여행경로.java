import java.util.*;

class Solution {
    String[][] tickets;
    boolean[] visit;
    PriorityQueue<String> routes = new PriorityQueue<>();
    public String[] solution(String[][] tickets) {
        this.tickets=tickets;
        visit=new boolean[tickets.length];
        dfs("ICN","ICN",0);
        return routes.poll().split(",");
    }
    void dfs(String now,String route,int depth){
        if (depth>=tickets.length){
            routes.offer(route);
        }
        for (int i=0;i<tickets.length;i++){
            if (!visit[i]&&tickets[i][0].equals(now)){
                visit[i]=true;
                dfs(tickets[i][1],route+","+tickets[i][1],depth+1);
                visit[i]=false;
            }
        }
    }
}