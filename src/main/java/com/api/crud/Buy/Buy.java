package com.api.crud.Buy;

import com.api.crud.Travel.Travel;
import com.api.crud.User.User;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Buy {
    @Id
    @GeneratedValue
    private Integer id;
    @Basic
    private Float amount;
    private Integer quantity;

    @OneToOne
    private User user;

    @OneToOne
    private Travel travel;

}
