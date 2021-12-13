package com.characterreview.reviews;


public class Review {

    private Long id;
    private String characterName;
    private String rating;
    private String reviewContent;
    private String imageUrl;


    public Review(Long id, String characterName, String rating, String reviewContent, String imageUrl) {
        this.id = id;
        this.characterName = characterName;
        this.rating = rating;
        this.reviewContent = reviewContent;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public String getCharacterName() {
        return characterName;
    }

    public String getRating() {
        return rating;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public String getImageUrl(){
        return imageUrl;
    }
}
