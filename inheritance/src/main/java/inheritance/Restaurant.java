package inheritance;

public class Restaurant {
    private String name;
    private int stars;
    private String price;

    public Restaurant(String name, int stars, String price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

    public String toString() {
        return String.format("name: " + name + " ,stars: " + stars + " ,price: " + price);
    }
}
