package com.jojoldu.blogcode.springbootjpa.domain.pay;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@NoArgsConstructor
@Entity
public class PayDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String payName;

    @ManyToOne
    @JoinColumn(name = "pay_id")
    private Pay pay;

    public PayDetail(String payName) {
        this.payName = payName;
    }

    public void setPay(Pay pay) {
        this.pay = pay;
    }
}
