package Day07;

public class Q02_Menu {
    // create 2D array of food:
    // print all the foods sorted
        /*
        steak
        hot dog
        cheeseburger
        -----------------------
        pizza
        pasta
        canoli
        -----------------------
        sushi
        ramen
        fried rice
        dumplings
        -----------------------
        kebab
        manto
        -----------------------
        beriyani
        masal
        curry
        chicken tikka masala
        -----------------------
        */
    public static void main(String[] args) {
        System.out.println("---------for each loopcozumu-------");
        String[][] menu = {{"steak", "hot", "dog", "cheeseburger"}, {"sushi", "ramen", "fried rice",
                "dumplings"}, {" kebabn", " manto"}, {"beriyani", "masal", "curry", "chicken tikka masala"}};
        String[] ulkeler={"American","Italian","Corean","Afghan","Indian"};
        for (String[] each : menu) {

            for (String yemek : each) {
                System.out.println(yemek);

            }
            System.out.println("-----------------");
        }

        System.out.println("-------for loop cozumu-------");
        for (int i = 0; i < menu.length; i++) {

            System.out.println("------"+ulkeler[i]+"------");

            for (int j = 0; j < menu[i].length; j++) {

                System.out.println(menu[i][j]);

            }

        }

    }
}
