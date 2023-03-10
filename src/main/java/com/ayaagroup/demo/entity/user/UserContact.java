package com.ayaagroup.demo.entity.user;

import com.ayaagroup.demo.entity.user.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_contact",
        uniqueConstraints = {
        @UniqueConstraint(columnNames = "user_email")
}
        )
public class UserContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id")
    private Integer contactId;

    //@Column(name = "user_id")
    private Integer userId;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "user_email")
    @NotBlank
    @Size(max = 50)
    @Email
    private String userEmail;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", insertable = false, updatable = false)
    private User userEntity;
}
