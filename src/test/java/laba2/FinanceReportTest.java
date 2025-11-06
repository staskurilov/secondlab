package laba2;

import org.example.money.FinanceReport;
import org.example.money.Payment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinanceReportTest {
    @Test
    public void getQuantity() {
        Payment notElephant1 = new Payment("Первый Первак Первашевич", 1, 1, 2001, 11111);
        Payment notElephant2 = new Payment("Второй Вторяк Вторякевич", 1, 1, 2001, 11111);
        Payment notElephant3 = new Payment("Третий Третяк Третякевич", 1, 1, 2001, 11111);
        FinanceReport financeReport = new FinanceReport(new Payment[]{notElephant1, notElephant2, notElephant3}, "Директоров Директор Директорович", "11.09.2001");
        Assertions.assertEquals(3,financeReport.getQuantityPayments());
    }

    @Test
    public void setPayment(){
        Payment notElephant1 = new Payment("Первый Перваш Первашевич", 1, 1, 2001, 11111);
        Payment notElephant2 = new Payment("Второй Вторяк Вторякевич", 1, 1, 2001, 11111);
        FinanceReport financeReport = new FinanceReport(new Payment[]{notElephant1,notElephant2},"Директоров Директор Директорович","01.01.2001");
        financeReport.setPayment(notElephant1,1);
        Assertions.assertEquals(notElephant1,financeReport.getPayment(1));
    }

    @Test
    public void toStringTest(){
        Payment notElephant1 = new Payment("Первый Первак Первашевич", 1, 1, 2001, 11111);
        Payment notElephant2 = new Payment("Второй Вторяк Вторякевич", 1, 1, 2001, 11111);
        FinanceReport financeReport = new FinanceReport(new Payment[]{notElephant1,notElephant2},"Директоров Директор Директорович","11.09.2011");
        Assertions.assertTrue(financeReport.toString().contains("Директоров Директор Директорович"));
        System.out.println(financeReport);
    }
}
