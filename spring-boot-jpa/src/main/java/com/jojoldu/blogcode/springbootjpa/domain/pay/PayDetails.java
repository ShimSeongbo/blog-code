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
public class PayDetails {
    public static final PayDetails EMPTY = new PayDetails();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pay")
    private List<PayDetail> payDetails = new ArrayList<>();

    public void add (Pay pay, PayDetail payDetail) {
        this.payDetails.add(payDetail);
        payDetail.setPay(pay);
    }

    public PayDetail get(int index) {
        return payDetails.get(index);
    }

}
