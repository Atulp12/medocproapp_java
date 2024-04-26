package com.example.medocpro2app.model;

import java.io.Serializable;

public class ProductImage implements Serializable {
    String id, product_id, image;

    public ProductImage(String id, String product_id, String image) {
        this.id = id;
        this.product_id = product_id;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
