package com.api.crud.Travel;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Travel {

    @Id
    @GeneratedValue
    private Integer id;
    @Basic
    private String province;
    private String place;
    private String activities;
    private String image;
    private String description;
    private Integer price;
}
