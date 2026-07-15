package com.coforge.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("man")
public class Manufacture {
//	@Value("5556")
	@Value("${Manufacture.mid}")
    private int mid;
//	@Value("Dell Ltd.")
	@Value("${Manufacture.companny}")
    private String companny;
//	@Value("Chennai")
	@Value("${Manufacture.address}")
    private String address;

    // No-Argument Constructor
    public Manufacture() {
        super();
    }

    // Parameterized Constructor
    public Manufacture(int mid, String companny, String address) {
        super();
        this.mid = mid;
        this.companny = companny;
        this.address = address;
    }

    // Getter and Setter for mid
    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    // Getter and Setter for companny
    public String getCompanny() {
        return companny;
    }

    public void setCompanny(String companny) {
        this.companny = companny;
    }

    // Getter and Setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Manufacture [mid=" + mid +
                ", companny=" + companny +
                ", address=" + address + "]";
    }
}