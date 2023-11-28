package com.api.crud.Buy;

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
public class Buy {
    @Id
    @GeneratedValue
    private Integer id;
    @Basic
    private String amount;
    private String quantity;
}
