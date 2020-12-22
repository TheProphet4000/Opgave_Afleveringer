enum recipies{
    page1, page2
} //laver en enum der indenholder sider, som man kan slå op i.


public class Cookbook {
    public static void main(String[] args) {

        recipies lemonTea = recipies.page1; //sætter page1 til lemonTea (Citron tee)
        recipies glaze = recipies.page2; // sætter page2 til glaze (glassur)

        showLemonTea(lemonTea); //kalder metoden showLemonTea() der viser hvordan man laver citron tee
        showGlaze(glaze); // det sammen som linje 12, bare med glaze.
    }


    private static void showLemonTea(recipies lemonTea) {
        System.out.println("------------------------------------------Lemon tea-------------------------------------------");
        System.out.println("To make lemon tea, add a slice of lemon to your teacup and put boiling water in the teacup.");
        System.out.println("If the lemon taste is to sour add sugar, or add less lemon next time");
        System.out.println("----------------------------------------------end---------------------------------------------");
    }

    private static void showGlaze(recipies glaze){
        System.out.println("--------------------------------------------Glaze---------------------------------------------");
        System.out.println("To make glaze, add powdered suger in a small bowl and add water, mix it with a spoon");
        System.out.println("if to runny add more powdered sugar, if to chick add water");
        System.out.println("----------------------------------------------end---------------------------------------------");
    }
}
