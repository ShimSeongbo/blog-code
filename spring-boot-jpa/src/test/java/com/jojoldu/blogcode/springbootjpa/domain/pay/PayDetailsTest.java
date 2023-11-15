package com.jojoldu.blogcode.springbootjpa.domain.pay;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class PayDetailsTest {

    @Test
    void PayDetails_test() throws Exception {
        //given
        Pay pay1 = new Pay();
        Pay pay2 = new Pay();

        //then
        System.out.printf("empty=%s\n pay1=%s\n pay2=%s\n", PayDetails.EMPTY, pay1.getPayDetails(), pay2.getPayDetails());
        assertThat(pay1.getPayDetails()).isEqualTo(pay2.getPayDetails());
    }

    @Test
    void PayEvents_test() throws Exception {
        //given
        Pay pay1 = new Pay();
        Pay pay2 = new Pay();

        //then
        System.out.printf("pay1=%s\n pay2=%s\n", pay1.getPayEvents(), pay2.getPayEvents());
        assertThat(pay1.getPayEvents()).isNotEqualTo(pay2.getPayEvents());
    }
}
