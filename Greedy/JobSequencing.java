import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {
    static class Job{
        int id;
        int deadline;
        int profit;
        public Job(int i,int d,int p){
            deadline=d;
            id=i;
            profit=p;
        }

    }
    public static void main(String[] args) {
        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs=new ArrayList<>();
        for(int i=0;i<jobsInfo.length;i++){
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        Collections.sort(jobs,(obj2,obj1)-> obj2.profit-obj1.profit);
        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }

        }
        System.out.println("max jobs are "+seq.size());
        System.out.println();
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
    }
    
}
