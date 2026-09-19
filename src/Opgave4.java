public class Opgave4 {

    double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;
        return average;
    }

    int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    int countAboveAverage(int[] numbers) {
        int counter = 0;
        double average = calculateAverage(numbers);
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > average) {
                counter++;
            }
        }
        return counter;
    }

    void main() {
        int[] numbers = {45, 67, 23, 89, 34, 56, 78};
        System.out.println("Average: " + calculateAverage(numbers));
        System.out.println("Max value: " + findMax(numbers));
        System.out.println("Min value: " + findMin(numbers));
        System.out.println("Numbers larger than average: " + countAboveAverage(numbers));
    }
}
