package com.coforge.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("lap")
@Scope("prototype")
public class Laptop {
//	@Value("Dell")
	@Value("${Laptop.brand}")
    private String brand;
//	@Value("70000")
	@Value("${Laptop.price}")
    private double price;
//	@Value("12GB")
	@Value("${Laptop.ramCapacity}")
    private String ramCapacity;
//	@Value("1TB")
	@Value("${Laptop.hardDiskCapacity}")
    private String hardDiskCapacity;
//	@Value("512GB")
	@Value("${Laptop.ssdCapacity}")
    private String ssdCapacity;
//	@Value("Pink")
	@Value("${Laptop.colour}")
    private String colour;
    @Autowired
    private Manufacture manufacture;

    // No-Argument Constructor
    public Laptop() {
        super();
    }

    // Parameterized Constructor
    public Laptop(String brand, double price, String ramCapacity,
                  String hardDiskCapacity, String ssdCapacity,
                  String colour, Manufacture manufacture) {
        super();
        this.brand = brand;
        this.price = price;
        this.ramCapacity = ramCapacity;
        this.hardDiskCapacity = hardDiskCapacity;
        this.ssdCapacity = ssdCapacity;
        this.colour = colour;
        this.manufacture = manufacture;
    }

    // Getter and Setter for brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter and Setter for ramCapacity
    public String getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(String ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    // Getter and Setter for hardDiskCapacity
    public String getHardDiskCapacity() {
        return hardDiskCapacity;
    }

    public void setHardDiskCapacity(String hardDiskCapacity) {
        this.hardDiskCapacity = hardDiskCapacity;
    }

    // Getter and Setter for ssdCapacity
    public String getSsdCapacity() {
        return ssdCapacity;
    }

    public void setSsdCapacity(String ssdCapacity) {
        this.ssdCapacity = ssdCapacity;
    }

    // Getter and Setter for colour
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    // Getter and Setter for manufacture
    public Manufacture getManufacture() {
        return manufacture;
    }

    public void setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return "Laptop [brand=" + brand +
                ", price=" + price +
                ", ramCapacity=" + ramCapacity +
                ", hardDiskCapacity=" + hardDiskCapacity +
                ", ssdCapacity=" + ssdCapacity +
                ", colour=" + colour +
                ", manufacture=" + manufacture + "]";
    }
}
