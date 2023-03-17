
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int totalSugar = 0;

        int sugar = 2;

        int maxSugar = 10;

        // else/else/else if

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

        // while loop 

        // while (totalSugar < maxSugar){
        //     totalSugar += sugar;
        //     System.out.println("Total sugar in glass " + totalSugar);
        // }

        // do {
        //     totalSugar += sugar;
        //     System.out.println("Total sugar in glass " + totalSugar);
        // } while(totalSugar < maxSugar);
        // System.out.println("I don't run until code is finsihed ");

        // for loop
        // for (int i = 1; i <= 10; i++){
        //     System.out.println(i);
        // }

        for (; totalSugar < maxSugar; totalSugar += sugar){
            System.out.println("Total sugar in glass: " + totalSugar);
        }
        System.out.println("I run always!");
    }

}
