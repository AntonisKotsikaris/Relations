/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relations;

import java.util.List;

/**
 *
 * @author antoniskotsikaris
 */
public class Product {
    private String SKU;
    private String descrption;
    private Double price;
 private List<Customer> customerList;
    public Product() {
    }

    public Product(String SKU, String descrption, Double price, List<Customer> customerList) {
        this.SKU = SKU;
        this.descrption = descrption;
        this.price = price;
        this.customerList = customerList;
    }

    
    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public String toString() {
        return "Product{" + "SKU=" + SKU + ", descrption=" + descrption + ", price=" + price + '}';
    }
    
    public void basket(Customer c){
        // ...
    
    }
}
