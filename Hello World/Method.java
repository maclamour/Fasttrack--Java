public class Method {
    public static void main(String[] args) {
        System.out.println(add(1,5));
        System.out.println(concat("cat ", "dog"));
        System.out.println(divide(6, 6));

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static String concat(String a, String b){
        return a + b;
    }

    public static int divide(int numerator, int denominator){
        return numerator / denominator;
    }

}
