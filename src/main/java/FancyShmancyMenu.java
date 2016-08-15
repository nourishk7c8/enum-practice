import java.util.ArrayList;
import java.util.List;

/**
 * Created by developer on 8/9/2016.
 */
public class FancyShmancyMenu {

    private static List<MenuItem> menu;

    public static void createMenu(){
        menu = new ArrayList<MenuItem>();
        createAppetizers();
        createEntrees();
        createDesserts();
    }//end createMenu

    public static List<MenuItem> getMenu() {
        return menu;
    }

    private static void createAppetizers() {
        DishType type = DishType.APPETIZER;
        MenuItem item;

        item = new MenuItem(type, HealthType.VEGETARIAN,"Caesar Salad", "Small caesar salad", 3.89);
        menu.add(item);
        item = new MenuItem(type,HealthType.VEGETARIAN, "Waffle fries", "Our signature fries", 1.69);
        menu.add(item);
    }//end createAppetizers

    private static void createEntrees() {
        DishType type = DishType.ENTREE;
        MenuItem item;

        item = new MenuItem(type, HealthType.NORMAL, "Chicken Sandwich", "Chicken on wheat bread", 7.99);
        menu.add(item);
        item = new MenuItem(type, HealthType.NORMAL, "Hamburger", "Chipotle seasoned patty on bun with stuff", 9.99);
        menu.add(item);
        item = new MenuItem(type, HealthType.NORMAL, "Turkey burger", "Chipotle seasoned turkey patty on bun with stuff", 6.99);
        menu.add(item);
        item = new MenuItem(type, HealthType.GLUTEN_FREE, "Mediterranean Salad", "Whatever is in Mediterranean salads", 8.99);
        menu.add(item);
        item = new MenuItem(type, HealthType.NORMAL, "Salmon", "Smoked salmon with stuff", 13.99);
        menu.add(item);
    }//end createEntrees

    private static void createDesserts() {
        DishType type = DishType.DESSERT;
        MenuItem item;

        item = new MenuItem(type, HealthType.GLUTEN_FREE_AND_VEGETARIAN, "Ice Cream", "Vanilla or chocolate", 3.89);
        menu.add(item);
        item = new MenuItem(type, HealthType.VEGETARIAN, "Brownie", "Chocolate brownie", 2.69);
        menu.add(item);
    }//end create

}//end class FancyShmancyMenu
