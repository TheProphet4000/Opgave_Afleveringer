public class Test {
    public static void main(String[] args) {
        System.out.println("Begin tests");
        findTests();
        test1();
    }

    private static void findTests() {
        int[] numberOfTests = {1};

        for (int i:numberOfTests) {
            System.out.println("there is " +i+ " tests");
            System.out.println("Showing tests");
            System.out.println(" ");
        }
    }


    private static void test1() {
        boolean working = false;
        while (!working) {
            System.out.println("test 1: Show all recipes. there should be 3 recipies");
            Recipy show = new Recipy();
            show.showLemonTea();
            show.showGlaze();
            show.showPggb();

            break;
        }
    }
}
