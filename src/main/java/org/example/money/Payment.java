package org.example.money;

import java.util.Objects;

public class Payment {
    private String fio;
    private int day;
    private int month;
    private int year;
    private int sumPay;

    public Payment(String fio, int day, int month, int year, int sumPay) {
        this.fio = fio;
        this.day = day;
        this.month = month;
        this.year = year;
        this.sumPay = sumPay;
    }

    public String getFio() {
        return this.fio;
    }

    public int getDay() {
        return this.day;
    }
    public int getMonth() {
        return this.month;
    }
    public int getYear() {
        return this.year;
    }
    public int getSumPay() {
        return this.sumPay;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setSumPay(int sumPay) {
        this.sumPay = sumPay;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Payment payment = (Payment)o;
            return this.day == payment.day && this.month == payment.month && this.year == payment.year && this.sumPay == payment.sumPay && Objects.equals(this.fio, payment.fio);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(this.fio, this.day, this.month, this.year, this.sumPay);
    }

    public String toString() {
        return String.format("Плательщик: %s, дата: %d.%d.%d сумма: %d руб. %d коп.", this.fio, this.day, this.month, this.year, this.sumPay / 100, this.sumPay % 100);
    }
}