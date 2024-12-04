package application;

public class Review {
    private String reviewText;

    public Review(String reviewText) {
        this.reviewText = reviewText;
    }

    @Override
    public String toString() {
        return reviewText;
    }
}
