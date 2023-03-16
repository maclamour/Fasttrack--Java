
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");


    int totalSugar = 0;

    int sugar = 15;

    int maxSugar = 10;

    if (sugar <= maxSugar){
        totalSugar += sugar;
        System.out.println(totalSugar);
    }else {
        System.out.println("We only allow " + maxSugar + " tsp's of sugar per glass ");
    }

    }

}
