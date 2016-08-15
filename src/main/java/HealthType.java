/**
 * Created by developer on 8/15/2016.
 */
public enum HealthType {
    NORMAL(1),GLUTEN_FREE(2),VEGETARIAN(3),GLUTEN_FREE_AND_VEGETARIAN(4);

    private int code;

    private HealthType(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
