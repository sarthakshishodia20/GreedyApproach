
import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSack {
    public static void main(String[] args) {
        int[] value = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int W = 50;
        Double[][] ratio = new Double[value.length][2];
        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = (double) i;
            ratio[i][1] = value[i] / (double) weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble((Double[] o) -> o[1]));
        int capacity = W;
        int finalVal = 0; // Corrected variable name
        for (int i = ratio.length - 1; i >= 0; i--) { // Corrected loop iteration
            int index = (int) (double) ratio[i][0];
            if (capacity >= weight[index]) {
                finalVal += value[index];
                capacity -= weight[index];
            } else {
                finalVal += ratio[i][1] * capacity; // Corrected variable name
                capacity = 0;
                break;
            }
        }
        System.out.println("Maximum value obtained: " + finalVal);
    }
}
