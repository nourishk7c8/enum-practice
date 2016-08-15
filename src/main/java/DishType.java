/**
 * Created by developer on 8/9/2016.
 */
public enum DishType {
    APPETIZER(1),ENTREE(2),DESSERT(3);

    private int code;

    private DishType(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }
}
