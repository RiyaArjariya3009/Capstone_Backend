package com.restaurant.userservice.dto.in;

import javax.validation.constraints.NotBlank;

/**
 * Data Transfer Object for address request.
 * Contains information about an address to be added or updated.
 */
public class AddressRequestDto {

    /**
     * Unique identifier for the address.
     */
    private int id;

    /**
     * Street address. This field is mandatory.
     */
    @NotBlank(message = "Street is mandatory")
    private String street;

    /**
     * City of the address. This field is mandatory.
     */
    @NotBlank(message = "City is mandatory")
    private String city;

    /**
     * State of the address. This field is mandatory.
     */
    @NotBlank(message = "State is mandatory")
    private String state;

    /**
     * Zip code of the address. This field is mandatory.
     */
    @NotBlank(message = "Zip code is mandatory")
    private String zipCode;

    /**
     * Country of the address. This field is mandatory.
     */
    @NotBlank(message = "Country is mandatory")
    private String country;

    /**
     * Default constructor for AddressRequestDto.
     */
    public AddressRequestDto() {
        super();
    }

    /**
     * Parameterized constructor for AddressRequestDto.
     *
     * @param street  the street address
     * @param city    the city
     * @param state   the state
     * @param zipCode the zip code
     * @param country the country
     */
    public AddressRequestDto(String street, String city, String state, String zipCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    /**
     * Gets the unique identifier for the address.
     *
     * @return the address ID
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the unique identifier for the address.
     *
     * @param id the address ID
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the street address.
     *
     * @return the street address
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the street address.
     *
     * @param street the street address
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Gets the city of the address.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city of the address.
     *
     * @param city the city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the state of the address.
     *
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the state of the address.
     *
     * @param state the state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the zip code of the address.
     *
     * @return the zip code
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the zip code of the address.
     *
     * @param zipCode the zip code
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Gets the country of the address.
     *
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the country of the address.
     *
     * @param country the country
     */
    public void setCountry(String country) {
        this.country = country;
    }
}
