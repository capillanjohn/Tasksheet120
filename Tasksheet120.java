public class Tasksheet120 {
    
    public static void calculateCumulativeSum(int... numbers) {
        int totalSum = 0; 
        
        for (int number : numbers) {
            int cumulativeSum = 0;
            
        
            for (int i = 1; i <= number; i++) {
                cumulativeSum += i;
            }
            
            System.out.println("Cumulative sum for " + number + ": " + cumulativeSum);
    
            totalSum += cumulativeSum;
        }
        
        // Print the total sum of all the cumulative sums
        System.out.println("Total sum of all cumulative sums: " + totalSum);
    }

    public static void main(String[] args) {
        calculateCumulativeSum(4, 5, 10);
    }
}
