package com.example.demo.user;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

/*
 * This class is used to represent a user.
 */
@Entity
@Table
public class User {
    // Connect to the database
    @Id
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")

    /*
     * The name of the user.
     */
    private String name;

    /*
     * The email of the user.
     */
    private String email;

    /*
     * The password of the user.
     */
    private String password;

    /*
     * The list of habits of the user.
     */
    private List<String> habits; // will be changed to a list of Habit objects

    /*
     * This constructor is used to create a new User object with a name, email,
     * password, and list of habits.
     * 
     * @param name The name of the user.
     * 
     * @param email The email of the user.
     * 
     * @param password The password of the user.
     * 
     * @param habits The list of habits of the user.
     */
    public User(String name, String email, String password, List<String> habits) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.habits = habits;
    }

    /*
     * This constructor is used to create a new User object with a name, email, and
     * password.
     * 
     * @param name The name of the user.
     * 
     * @param email The email of the user.
     * 
     * @param password The password of the user.
     */
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    /*
     * This method is used to get the name of the user.
     * 
     * @return The name of the user.
     */
    public String getName() {
        return name;
    }

    /*
     * This method is used to get the email of the user.
     * 
     * @return The email of the user.
     */
    public String getEmail() {
        return email;
    }

    /*
     * This method is used to get the password of the user.
     * 
     * @return The password of the user.
     */
    public String getPassword() {
        return password;
    }

    /*
     * This method is used to get the list of habits of the user.
     * 
     * @return The list of habits of the user.
     */
    public List<String> getHabits() {
        return habits;
    }
}
