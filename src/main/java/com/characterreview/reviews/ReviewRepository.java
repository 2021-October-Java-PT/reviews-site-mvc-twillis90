package com.characterreview.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository(){
        Review vegeta = new Review(1001L, "Vegeta", "8/10", "Top tier Anime Character. " +
                "A+ character Arch.  Villain turned anti-hero turned straight up hero. Motivated and driven. " +
                "Pride is his strength and his downfall. Entertaining, motivational, and about that smoke " +
                "for these reasons and more I give The Prince of All Saiyans a:", "images/vegeta.jpg");
        Review sasuke = new Review(1002L, "Sauske Uchiha", "4/10", "review here", "images/sasuke.jpg");
        Review leMillion = new Review(1003L, "Mirio Togata", "9/10", "review", "images/mirio.jpg");
        Review itachi = new Review(1004L, "Itachi Uchiha", "10/10", "review", "images/itachi.jpg");
        Review deku = new Review(1005L, "Izuku Midoriya", "6/10", "review", "images/deku.jpg");
        Review tanjiro = new Review(1006L, "Tanjiro Kamado", "7/10", "review", "images/tanjiro.jpg");
        Review rengoku = new Review(1007L, "Kyojuro Rengoku", "10/10", "review", "images/rengoku.jpg");

        reviewList.put(vegeta.getId(), vegeta);
        reviewList.put(sasuke.getId(), sasuke);
        reviewList.put(leMillion.getId(), leMillion);
        reviewList.put(itachi.getId(), itachi);
        reviewList.put(deku.getId(), deku);
        reviewList.put(tanjiro.getId(), tanjiro);
        reviewList.put(rengoku.getId(), rengoku);
    }

    public ReviewRepository(Review ...reviewsToAdd){
        for (Review character: reviewsToAdd){
            reviewList.put(character.getId(), character);
        }
    }
    public Review findOne(Long id) {
        return reviewList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewList.values();
    }
}
