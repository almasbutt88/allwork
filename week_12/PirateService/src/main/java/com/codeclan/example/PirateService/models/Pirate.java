package com.codeclan.example.PirateService.models;

import javax.persistence.*;
import java.util.List;

@Entity // means table, this is an injector
@Table(name="pirates",
        uniqueConstraints={@UniqueConstraint(columnNames ={"first_name","last_name"})})
public class Pirate {
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "age") // you are setting column names here. This is creating a model for our db
    private int age;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") //if you dont, it will assume its just a name
    private Long Id; //db doesnt know if its an int or something else, so you make it long.

    @ManyToOne
    @JoinColumn(name = "ship_id",nullable = false)
    private Ship ship;

    @ManyToMany
    @JoinTable(
            name = "pirates_raids",
            joinColumns = { @JoinColumn(
                    name = "pirate_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = { @JoinColumn(
                    name = "raid_id",
                    nullable = false,
                    updatable = false)
            }
    )

    private List<Raid> raids;


    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }



    public Pirate(String firstName, String lastName, int age, Ship ship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ship = ship;
    }




    public Pirate() { //we are creating a second empty constructor for Spring to talk to. its a requirement
    } //spring requirement for jpa

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addRaid(Raid raid1) {
    }
}
