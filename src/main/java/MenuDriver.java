import java.util.ArrayList;
import java.util.List;

/**
 * Created by developer on 8/9/2016.
 */
public class MenuDriver {

    public static void main(String[]args){

        FancyShmancyMenu.createMenu();
        List menu = FancyShmancyMenu.getMenu();

        System.out.println("Listing Gluten Free and/or Vegetarian items:");
        for(MenuItem m : FancyShmancyMenu.getMenu()){
            boolean glutenFree = (m.getHealthType()==HealthType.GLUTEN_FREE);
            boolean veg = m.getHealthType()==HealthType.VEGETARIAN;
            boolean both = m.getHealthType()==HealthType.GLUTEN_FREE_AND_VEGETARIAN;

            if(glutenFree || veg || both){
                System.out.println(m.getDishType() + "\n" + m.getName() + "\n" + m.getPrice() + "\n");
            }//end if
        }//end for
    }//end main
}//end class
