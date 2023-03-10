package com.ayaagroup.demo.entity.user.admin;

import com.ayaagroup.demo.entity.user.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "admin",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "adminId")})
public class Admin extends User {

    //Unique id Not primary  Don't forget to make it unique in the DB
    @Column(name = "adminId")
    private Integer adminId;

    //Elcode ely bydeh permission mo7aded
    @Column(name = "admin_code")
    private Integer adminCode;

}
