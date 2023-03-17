public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        numbers[0] = 4;

        int count = 1; 
        for (int i = 0; i < numbers.length; i++, count++) {
            numbers[i] = count;
            System.out.println(numbers[i]);
        }

    }
}
