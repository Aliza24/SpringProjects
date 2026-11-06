package com.jecrc.model;

public class Cart {

    private Menu selectedItem;
    private int quantity;

    public Cart(Menu menu, int quantity) {
        this.selectedItem = menu;
        this.quantity = quantity;
    }

    public Menu getSelectedItem() {
        return selectedItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSubtotal() {
        return selectedItem.getPrice() * quantity;
    }
}