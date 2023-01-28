package com.infy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.Objects;


@Entity
@Table(name = "customer", schema = "customer_db")
public class Customer {
    @Id
    private Integer customerId;
    private String emailId;
    private String name;
    private LocalDate dateOfBirth;

    public Integer getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(final Integer customerId) {
        this.customerId = customerId;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailId(final String emailId) {
        this.emailId = emailId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(final LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", emailId='" + emailId + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (null == o || this.getClass() != o.getClass()) return false;
        final Customer customer = (Customer) o;
        return this.customerId.equals(customer.customerId) && this.emailId.equals(customer.emailId) && this.name.equals(customer.name) && this.dateOfBirth.equals(customer.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.customerId, this.emailId, this.name, this.dateOfBirth);
    }
}
