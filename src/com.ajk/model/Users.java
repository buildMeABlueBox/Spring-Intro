package com.ajk.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")

public class Users{

    @Id
    private String id;

    private String firstName;
    private String lastName;

    /**
     *
     * @param firstName - user's first name
     * @param lastName - user's last name
     */
    public Users(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     *
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @return the id
     */
    public String getId(){
        return id;
    }

    /**
     *
     * @return the lastName
     */
    public String getLastName(){
        return lastName;
    }

    /**
     *
     * @param name - name to be set as firstName
     */
    public void setFirstName(String name){
        this.firstName = name;
    }

    /**
     *
     * @param name - name to be set as lastName
     */
    public void setLastName(String name){
        this.lastName = name;
    }

    /**
     *
     * @param id - id to be set
     */
    public void setId(String id){
        this.id = id;
    }

}