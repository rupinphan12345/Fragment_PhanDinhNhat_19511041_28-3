package com.example.fragment_phandinhnhat_19511041;

public class Product {

    private int imgProduct;
    private String title;

    public Product(int imgProduct, String title) {
        this.imgProduct = imgProduct;
        this.title = title;
    }

    public Product() {
    }

    public int getImgProduct() {
        return imgProduct;
    }

    public String getTitle() {
        return title;
    }

    public void setImgProduct(int imgProduct) {
        this.imgProduct = imgProduct;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
