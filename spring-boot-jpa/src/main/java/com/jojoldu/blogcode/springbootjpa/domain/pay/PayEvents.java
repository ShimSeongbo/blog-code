package com.jojoldu.blogcode.springbootjpa.domain.pay;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@Embeddable
public class PayEvents {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pay")
    private List<PayEvent> payEvents = new ArrayList<>();

    public void add (Pay pay, PayEvent payDetail) {
        this.payEvents.add(payDetail);
        payDetail.setPay(pay);
    }

    public PayEvent get(int index) {
        return payEvents.get(index);
    }
}
