public class Arrays {
    public static void main(String[] args) {
        // int[] numbers = new int[5];

        // numbers[0] = 4;

        // int count = 1;
        // for (int i = 0; i < numbers.length; i++, count++) {
        // numbers[i] = count;
        // System.out.println(numbers[i]);
        // }

        int[] numbers = new int[] { 1, 2, 3, 4, 5 };

        numbers = new int[] { 1, 2, 3, 4, 5, 6, 7 };

        int max = (int) (Math.random() * 10) + 1;

        int currentNumber = 6;

        for (int i = 0; i < max; i++, currentNumber++) {
            int temp[] = new int[numbers.length + 1];
            for (int j = 0; j < numbers.length; j++) {
                temp[j] = numbers[j];
            }
            temp[temp.length - 1] = currentNumber;
            numbers = temp;

        }

        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);

    }
}
