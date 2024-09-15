package com.ordermicroservice.OrderMicroservice.dtos;

public class UserResponseDto {

    private int id;
    private String username;
    private String email;
    private String role; // e.g., 'customer' or 'restaurant_owner'

    // Default constructor
    public UserResponseDto() {}

    // Parameterized constructor
    public UserResponseDto(int id, String username, String email, String role) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

