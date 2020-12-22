// 1.Variable (instansvariable, klassevariable)                                                                     DONE
// 2.Klasser og objekter (constructors, getters & setters, enum, metoder)              Mangler setters, og enum
// 3.Nedarvning, interface                                                                                          DONE
// 4.Kontrolstrukturer (if, switch & 2 slags løkker)                                   Mangler if, while, for
// 5.Array og ArrayList                                                                Mangler Array, Arraylist
// 6.Exceptions (try/catch)                                                            Mangler try/catch
// 7.GUI                                                                               Mangler GUI
// 8.Persistens (gemme i- / læse fra en fil)                                           Mangler save/load
// 9.Unit test (jUnit assertions)                                                      Mangler Tests
// 10.Algoritmer: Eksempel på søgning eller sortering                                  Mangler sortering
// 11.Dokumentation og versionsstyring                                                                              DONE

import java.util.Scanner;

public class Selector{
    public static void main(String[] args) {
        input();
    }

    static void input(){
        int page;
        Scanner scan = new Scanner(System.in);
        System.out.println("What page will you lookup: (Type ( 1 ) if you want to open page one )");
        page = scan.nextInt();

        switch (page) {
            case 1 -> {
                Recipy show = new Recipy();
                show.showGlaze();
                input();
            }
            case 2 -> {
                Recipy show = new Recipy();
                show.showLemonTea();
                input();
            }
            case 3 -> {
                Recipy show = new Recipy();
                show.showPggb();
                input();
            }
        }
    }
}
