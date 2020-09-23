package inheritance;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

    public class Theater {
        private String name;
        private int price;
        private int aveStars;
        private int totalStars;
        private int numReviews;
        private ArrayList<Review> reviews;
        private Set<String> movies;

        public Theater(String name, int priceCategory) {
            this.name = name;
            this.price = price;
            this.aveStars = 0;
            this.totalStars = 0;
            this.numReviews = 0;
            this.reviews = new ArrayList<>();
            this.movies = new HashSet<>();
        }

        public int getAvgStar() {
            return this.aveStars;
        }

        public void addMovie(String movie) {
            this.movies.add(movie);
        }

        public void removeMovie(String movie) {
            boolean removed = this.movies.remove(movie);

            if (!removed) {
                throw new IllegalArgumentException("Not a legit movie!");
            }
        }

        public void addReview(TheaterReview review) {
            this.reviews.add(review);
            this.totalStars += review.getStars();
            this.numReviews++;
            this.aveStars = this.totalStars / this.numReviews;
        }

        public int getNumberOfReviews() {
            return numReviews;
        }

        public String toString() {
            StringBuilder output = new StringBuilder();

            output.append(this.name);
            output.append(", ");
            output.append(this.aveStars);
            output.append(", ");
            output.append(this.price);
            for (String movie: this.movies) {
                output.append(", ");
                output.append(movie);
            }

            return output.toString();
        }

        public static class TheaterReview extends Review {
            private String movie;

            public TheaterReview(String body, String author, int stars) {
                super(body, author, stars);
                this.movie = "";
            }

            public TheaterReview(String body, String author, int stars, String movie) {
                super(body, author, stars);
                this.movie = movie;
            }

            @Override
            public String toString() {
                StringBuilder output = new StringBuilder();

                output.append(this.getBody());
                output.append(", ");
                output.append (this.getAuthor());
                output.append(", ");
                output.append(this.getStars());
                if (this.movie != "") {
                    output.append(", ");
                    output.append(this.movie);
                }
                return output.toString();
            }
        }
    }