package laba2;

import org.example.money.FinanceReport;
import org.example.money.FinanceReportProccesor;
import org.example.money.Payment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinanceReportProcessorTest {
    @Test
    public void getPaymentsSecondName() {
        Payment payment1 = new Payment("Кодер Програмист Универович", 1, 2, 2003, 1000);
        Payment payment2 = new Payment("Первак Первашевич Универович", 9, 10, 2005, 1234);
        Payment payment3 = new Payment("Вторякевич Вторяк Универович", 2, 12, 2003, 5678);
        Payment payment4 = new Payment("Вторякевич Вторяк Универович", 2, 12, 2003, 5678);
        FinanceReport financeReport = new FinanceReport(new Payment[]{payment1, payment2, payment3, payment4},
                "Директоров Директор Директорович",
                "26.11.24");
        FinanceReport financeReport2 = new FinanceReport(new Payment[]{payment2},
                "Директоров Директор Директорович",
                "26.11.24");
        Assertions.assertEquals(financeReport2, FinanceReportProccesor.getSecondNamesForFirstChar(financeReport, 'П'));
    }


    @Test
    public void getPaymentsForSumPay() {
        Payment payment1 = new Payment("Програмистов Програмист Универович", 1, 2, 2003, 1000);
        Payment payment2 = new Payment("Первак Первашевич Универович", 9, 10, 2005, 1234);
        Payment payment3 = new Payment("Вторякевич Вторяк Универович", 2, 12, 2003, 5678);
        Payment payment4 = new Payment("Вторякевич Вторяк Универович", 2, 12, 2003, 5678);
        FinanceReport financeReport = new FinanceReport(new Payment[]{payment1, payment2, payment3, payment4},
                "Директоров Директор Директорович",
                "26.11.24");
        FinanceReport financeReport2 = new FinanceReport(new Payment[]{payment1,payment2},
                "Директоров Директор Директорович",
                "26.11.24");
        Assertions.assertEquals(financeReport2, FinanceReportProccesor.paymentsLessThanASpecifiedNumber(financeReport, 2000));
    }

}