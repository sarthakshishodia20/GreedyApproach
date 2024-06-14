import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MinCountOfCoins {
    public static void main(String[] args) {
        Integer[] coins={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());
        int countOfCoins=0;
        ArrayList<Integer> ans=new ArrayList<>();
        int amount=590;
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount=amount-coins[i];
                }
            }
        }
        System.out.println("maximum no. of coin change is "+countOfCoins);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" + ");
        }

    }
    
}
