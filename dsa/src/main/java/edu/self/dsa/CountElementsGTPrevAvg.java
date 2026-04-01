package edu.self.dsa;

public class CountElementsGTPrevAvg {

    public static void main(String[] args) {
        int[] responseTimes = new int[]{100, 200, 150, 300};
        int elementsCountGTPrevAvg = countResponseTimeRegressions(responseTimes);
        System.out.println(elementsCountGTPrevAvg);
    }

    private static int countResponseTimeRegressions(int[] responseTimes) {
        int count = 0;
        double sum = responseTimes[0];
        for(int i = 1; i < responseTimes.length; i++) {
            double avg = sum / i;
            if (responseTimes[i] > avg) {
                count++;
            }
            sum += responseTimes[i];
        }
        return count;
    }
}
