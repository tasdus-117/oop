package hus.oop.lab11.iterator.cafe;
import hus.oop.lab8.countrymanager.countryarraymanager.SouthAmericaCountry;

import java.util.*;
public class Cafe {
    public static void main(String[] args) {
        System.out.println("\nMenu\n-- --\nBREAKFAST");
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        List<String> breakfastItems = pancakeHouseMenu.getMenuItems();
        for (int i = 0; i < breakfastItems.size(); i++) {
            String menuItem = breakfastItems.get(i);
            System.out.println(menuItem);
        }
        System.out.println("\nLUNCH");
        DinnerMenu dinnerMenu = new DinnerMenu();
        String[] lunchItems = dinnerMenu.getMenuitems();
        for (int i = 0; i < lunchItems.length; i++) {
            String menuItems = lunchItems[i];
            System.out.println(menuItems);
        }
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerIterator = dinnerMenu.createIterator();
        System.out.println("\nMenu (with iterators)\n -- -- \nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinnerIterator);
    }
    private static void printMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            String menu = (String)iterator.next();
            System.out.println(menu);
        }
    }
}
