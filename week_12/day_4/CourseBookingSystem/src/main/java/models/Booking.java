package models;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity

@Table(name = "bookings")

public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "date")
       
        @ManyToOne
        @JoinColumn(name = "course_id", nullable = false)
        @JsonIgnoreProperties({"bookings"})
        private Course course;

        @ManyToOne
        @JoinColumn(name = "customer_id", nullable = false)
        @JsonIgnoreProperties({"bookings"})
        private Customer customer;
        

    private String date;

    public Booking(String date, Customer customer, Course course){
        this.date = date;
        this.customer = customer;
        this.course = course;
    }
    public Booking(){

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
