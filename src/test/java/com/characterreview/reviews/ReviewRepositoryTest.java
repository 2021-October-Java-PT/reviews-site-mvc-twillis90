package com.characterreview.reviews;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepositoryTest {

    private ReviewRepository underTest;
    private Review reviewOne = new Review(1001L, "character name one", "review out of 10", "review description", "urlHere");
    private Review reviewTwo = new Review(1002L, "character name two", "rating number", "feelings about stuff","urlHere");

    @Test
    public void shouldFindReviewOne(){
        ReviewRepository underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findOne(1001L);
        assertEquals(reviewOne, foundReview);
    }

    @Test
    public void shouldFindReviewOneAndReviewTwo(){
        ReviewRepository underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review>foundReview = underTest.findAll();
        assertThat(foundReview).contains(reviewOne, reviewTwo);
    }
}
