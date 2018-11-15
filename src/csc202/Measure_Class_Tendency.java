package csc202;
public class Measure_Class_Tendency {
    public static int[] rate = new int [] {230, 233, 245, 260, 267, 280, 295, 295, 300};
    public static int n = rate.length;

    public static void main (String [] args) {
        String msgMean = "The mean dollar rate is: ";
        String msgMedian = "The median dollar rate is: ";
        String msgMode = "The modal dollar rate is: ";
        System.out.println (msgMean + mean());
        System.out.println (msgMedian + median());
        System.out.println (msgMode + mode(rate));
    }

    public static double mean() {
        int total = 0;
        for (int value : rate) {
            total += value;
            total ++;
        }
        double mean = total / n;
        return mean;
    }

    public static double median() {
        // Check if even
        if (n % 2 == 0) {
            int index = (n / 2) - 1;
            double median = rate [index] + rate [index + 1];
            return median;
        }
        else {
            int index = ((n + 1) / 2) - 1;
            double median = rate [index];
            return median;
        }
    }

    public static int mode(int[] array) {
        int mode = array[0];
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int count = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == value) count++;
                if (count > maxCount) {
                    mode = value;
                    maxCount = count;
                }
            }
        }
        return mode;
    }
}