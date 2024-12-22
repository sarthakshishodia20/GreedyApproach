// User function Template for Java

class Solution{
    static List<Integer> minPartition(int N)
    {
        // code here
        List<Integer> coins=new ArrayList<>();
        coins.add(1);
        coins.add(2);
        coins.add(5);
        coins.add(10);
        coins.add(20);
        coins.add(50);
        coins.add(100);
        coins.add(200);
        coins.add(500);
        coins.add(2000);
        Collections.reverse(coins);
        List<Integer> list=new ArrayList<>();
        while(N>0){
            for(int i=0;i<coins.size();i++){
                if(coins.get(i)<=N){
                    while(coins.get(i)<=N){
                        list.add(coins.get(i));
                        N=N-coins.get(i);
                    }
                }
            }
        }
        return list;
    }
}
