package com.company.org.customerprofileservice.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ViewCustomerProfileLookupId implements Serializable {
    private static final long serialVersionUID = 5450856928050220188L;
    @Size(max = 255)
    @NotNull
    @Column(name = "person_first_name", nullable = false)
    private String personFirstName;

    @Size(max = 255)
    @NotNull
    @Column(name = "person_last_name", nullable = false)
    private String personLastName;

    @Size(max = 255)
    @NotNull
    @Column(name = "ssn_last_four", nullable = false)
    private String ssn;

    public String getPersonFirstName() {
        return personFirstName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public String getSsn() {
        return ssn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ViewCustomerProfileLookupId entity = (ViewCustomerProfileLookupId) o;
        return Objects.equals(this.personLastName, entity.personLastName) &&
                Objects.equals(this.personFirstName, entity.personFirstName) &&
                Objects.equals(this.ssn, entity.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personLastName, personFirstName, ssn);
    }

    public ViewCustomerProfileLookupId() {
    }
    public ViewCustomerProfileLookupId(String personFirstName, String personLastName, String ssn) {
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.ssn = ssn;
    }
}