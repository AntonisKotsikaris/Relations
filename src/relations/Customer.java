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
public class Customer {
    private String name;
    private String address;
    private String email = "MyMail@G-Mail.com";
    private List<Product> puschesedProductList;

    public Customer() {
    }

    public Customer(String name, String address, List<Product> puschesedProductList) {
        this.name = name;
        this.address = address;
        this.puschesedProductList = puschesedProductList;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Product> getPuschesedProductList() {
        return puschesedProductList;
    }

    public void setPuschesedProductList(List<Product> puschesedProductList) {
        this.puschesedProductList = puschesedProductList;
    }
    
    

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", address=" + address + ", email=" + email + '}';
    }
    
    
    
    
}
    

