enum recipies{
    page1, page2
} //laver en enum der indenholder sider, som man kan slå op i.


public class Cookbook {
    public static void main(String[] args) {

        recipies lemonTea = recipies.page1; //sætter page1 til lemonTea (Citrontee)
        recipies glaze = recipies.page2; // sætter page2 til glaze (glassur)

        showRecipies(); //kalder metoden showRecipies()
    }

    private static void showRecipies() {
    }
}
