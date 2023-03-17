
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int totalSugar = 0;

        int sugar = 2;

        int maxSugar = 10;

        // if (sugar < maxSugar) {
        //     totalSugar += sugar;
        //     System.out.println(totalSugar + " tsp's of sugar have been added to you glass!");
        // } else if (sugar == maxSugar) {
        //     totalSugar += maxSugar;
        //     System.out.println(totalSugar);
        // } else {
        //     System.out.println("We only allow " + maxSugar + " tsp's of sugar per glass ");
        // }
        // System.out.println("I run always!");

        while (totalSugar < maxSugar){
            totalSugar += sugar;
            System.out.println("Total sugar in glass " + totalSugar);
        }

    }

}
