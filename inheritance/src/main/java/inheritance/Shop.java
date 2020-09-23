package inheritance;

import java.util.ArrayList;

public class Shop implements IReviewable {
    private ArrayList<Review> reviews;
    private int numReviews;
    private int totalStars;
    private  int aveStars;
    private String name;
    private String description;
    private int price;

    public Shop(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.aveStars = 0;
        this.totalStars = 0;
        this.numReviews = 0;
        this.reviews = new ArrayList<>();

    }
    public void addReview(Review review) {
        this.reviews.add(review);
        this.totalStars += review.getStars();
        this.numReviews++;
        this.aveStars = this.totalStars / this.numReviews;
    }
        public String toString() {
          return String.format("name: " + name + " ,description: " + description + " ,price: " + price);
            }
        }

 //Create a new interface called IReview
//       - Put a method in IReview called addReview
//
//
//         - Make Restaurant and Shop implement IReview
//
//
//
//         - Write the logic for addReview() in Restaurant and Shop
//
//
//         (( should be the same for both ))
//
//
//
//         - They should both create a new Review, add content to the review, and then add it to their Review lists
//