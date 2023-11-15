package com.jojoldu.blogcode.springbootjpa.domain.pay;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Getter
@NoArgsConstructor
@Entity
public class PayEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String eventName;

    @ManyToOne
    @JoinColumn(name = "pay_id")
    private Pay pay;

    public PayEvent(String eventName) {
        this.eventName = eventName;
    }

    public void setPay(Pay pay) {
        this.pay = pay;
    }
}
