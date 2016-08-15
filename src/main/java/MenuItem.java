    /**
    * Created by developer on 8/9/2016.
    */
    public class MenuItem {

    private DishType dishType;
    private HealthType healthType;
    private String name;
    private String description;
    private double price;

    public MenuItem(DishType dishType, HealthType healthType, String name, String description, double price) {
        this.dishType = dishType;
        this.healthType = healthType;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DishType getDishType() {
        return dishType;
    }

    public void setDishType(DishType dishType) {
        this.dishType = dishType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public HealthType getHealthType() {
        return healthType;
    }

    public void setHealthType(HealthType healthType) {
        this.healthType = healthType;
    }

    public String toString(){
        return name + "\n" + price + "\n" + description;
    }

    }
