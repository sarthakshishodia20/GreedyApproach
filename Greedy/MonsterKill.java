class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        PriorityQueue<Double> pq=new PriorityQueue<>();
        for(int i=0;i<dist.length;i++){
            pq.add((double)dist[i]/speed[i]);
        }
        int currentTime=0;
        int kill=0;
        while(!pq.isEmpty()){
            double nextTime=pq.poll();
            if(nextTime<=currentTime){
                break;
            }
            kill++;
            currentTime++;
        }
        return kill;

    }
}
