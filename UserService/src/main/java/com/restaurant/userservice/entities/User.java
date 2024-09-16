package com.restaurant.userservice.entities;

import com.restaurant.userservice.enums.RoleType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class representing a user in the system.
 */
@Entity
@Table(name = "users")
public class User {

    /** The unique identifier for the user. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /** The username of the user. */
    @Column(nullable = false)
    private String username;

    /** The password of the user. */
    @Column(nullable = false)
    private String password;

    /** The contact number of the user. */
    @Column(nullable = false, unique = true)
    private String contactNumber;

    /** The email address of the user. */
    @Column(unique = true, nullable = false)
    private String email;

    /** The role assigned to the user. */
    @Enumerated(EnumType.STRING)
    private RoleType role;

    /** The wallet balance associated with the user. */
    @Column(nullable = false)
    private Double walletBalance;

    /**
     * Default constructor.
     */
    public User() {
        super();
    }

    /**
     * Constructs a new User with the specified details.
     *
     * @param id             the unique identifier for the user
     * @param username       the username of the user
     * @param password       the password of the user
     * @param contactNumber  the contact number of the user
     * @param email          the email address of the user
     * @param role           the role assigned to the user
     * @param walletBalance  the wallet balance associated with the user
     */
    public User(int id, String username, String password, String contactNumber,
                String email, RoleType role, Double walletBalance) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.contactNumber = contactNumber;
        this.email = email;
        this.role = role;
        this.walletBalance = walletBalance;
    }

    /**
     * Gets the unique identifier for the user.
     *
     * @return the user ID
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the unique identifier for the user.
     *
     * @param id the new user ID
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the username of the user.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username of the user.
     *
     * @param username the new username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the password of the user.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password of the user.
     *
     * @param password the new password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the email address of the user.
     *
     * @return the email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the user.
     *
     * @param email the new email address
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the role assigned to the user.
     *
     * @return the role
     */
    public RoleType getRole() {
        return role;
    }

    /**
     * Sets the role assigned to the user.
     *
     * @param role the new role
     */
    public void setRole(RoleType role) {
        this.role = role;
    }

    /**
     * Gets the contact number of the user.
     *
     * @return the contact number
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * Sets the contact number of the user.
     *
     * @param contactNumber the new contact number
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * Gets the wallet balance associated with the user.
     *
     * @return the wallet balance
     */
    public Double getWalletBalance() {
        return walletBalance;
    }

    /**
     * Sets the wallet balance associated with the user.
     *
     * @param walletBalance the new wallet balance
     */
    public void setWalletBalance(Double walletBalance) {
        this.walletBalance = walletBalance;
    }
}
