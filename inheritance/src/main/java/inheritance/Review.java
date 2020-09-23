package inheritance;

public class Review {
    public String body;
    public String author;
    public int stars;


    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public String toString() {
        return String.format("body: " + body + " ,author: " + author + " ,stars:" + stars);
    }public int getStars() {
        return this.stars;
    }

}