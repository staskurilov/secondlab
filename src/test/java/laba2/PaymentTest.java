package laba2;

import org.example.money.Payment;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaymentTest {
    @Test
    public void SetOrGetInformation(){
        Payment payment = new Payment("Зубенко Михаил Петрович",19,3,2024,8888);
        Assertions.assertEquals("Зубенко Михаил Петрович", payment.getFio());
        payment.setSumPay(123456);
        Assertions.assertEquals(123456,payment.getSumPay());
        Assertions.assertEquals(3,payment.getMonth());
        Assertions.assertEquals(2024,payment.getYear());
    }
    @Test
    public void equals(){
        Payment p1 = new Payment("Вася Васильев Васильевич",1,2,2004,132);
        Payment p2 = new Payment("Вася Васильев Васильевич",1,2,2004,132);
        Assertions.assertEquals(p1,p2);
    }
    @Test
    public void notEquals(){
        Payment p1 = new Payment("Вася Васильев Васильевич",1,2,2004,132);
        Payment p2 = new Payment("Вася Васильев Борисович",1,2,2004,132);
        Assertions.assertNotEquals(p1,p2);
    }

    @Test
    public void toStringTest(){
        Payment payment2= new Payment("Васильев Вася Васильевич",1,2,2004,7952);
        Assertions.assertEquals("Плательщик: Васильев Вася Васильевич, дата: 1.2.2004 сумма: 79 руб. 52 коп.",payment2.toString());
    }



}
