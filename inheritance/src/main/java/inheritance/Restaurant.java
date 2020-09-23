package inheritance;

import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.util.ArrayList;

public class Restaurant implements IReviewable {
    private String name;
    private int stars;
    private String price;
    ArrayList<Review> reviews;

    public Restaurant(String name, int stars, String price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
    }
    private int aveStars() {
        int sum = 0;

        for (Review review: this.reviews) {
            sum += review.getStars();
        }
        if (sum == 0) return 0;
        return sum / this.reviews.size();
    }
    public String toString() {
        return String.format("name: " + name + " ,stars: " + stars + " ,price: " + price);
    }
    
    public void addReview(Review review) {
        if (!this.reviews.contains(review)) {
            this.reviews.add(review);
            this.stars = this.aveStars();
        }
    }
}
