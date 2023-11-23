package com.mongoDB.demo.repositories;

public interface CustomItemRepository {

    void updateItemQuantity(String name, float newQuantity);

}
