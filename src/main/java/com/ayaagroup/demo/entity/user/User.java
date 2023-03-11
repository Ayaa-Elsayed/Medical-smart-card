package com.ayaagroup.demo.entity.user;

import com.ayaagroup.demo.entity.user.admin.Admin;
import com.ayaagroup.demo.entity.user.patient.Patient;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = "user_name")
    })

//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Builder
@AllArgsConstructor
public class User {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    @NotBlank
    @Size(max = 20)
    private String userName;

    @Column(name = "user_date_of_birth")
    private Date dateOfBirth;

    @Column(name = "user_pass")
    @NotBlank
    @Size(max = 120)
    private String userPass;



//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "user_roles",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id"))
//    private Set<Role> roles = new HashSet<>();



//    @JsonManagedReference
//    @OneToMany(mappedBy = "userEntity1")
//    private List<UserAddress> userAddress;
//
//    @JsonManagedReference
//    @OneToMany(mappedBy = "userEntity")
//    private List<UserContact> userContacts;
//
//    @JsonManagedReference
//    @OneToOne(mappedBy = "user")
//    private Patient patient;
}
