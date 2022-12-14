package com.carrot.mattro.DTO;

import com.carrot.mattro.domain.entity.Crawling;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CrawlingResponse {

    public CrawlingResponse(Crawling crawling){
        this.id = crawling.getId();
        this.storeIdx = crawling.getStoreIdx();
        this.rating = crawling.getRating();
        this.name = crawling.getName();
        this.menuList = crawling.getMenuList();
        this.foodCategory = crawling.getFoodCategory();
        this.keywordReviewList =crawling.getKeywordReviewList();
        this.mainImageURL = crawling.getMainImageURL();
        this.menuImageURL = crawling.getMenuImageURL();
        this.tell = crawling.getTell();
        this.storeURL = crawling.getStoreURL();
    }

    private String id;
    private String storeIdx;
    private String rating;
    private String name;
    private List<String> menuList;
    private String menuImageURL;
    private String mainImageURL;
    private org.bson.Document keywordReviewList;
    private String foodCategory;
    private String tell;
    private String storeURL;
}
