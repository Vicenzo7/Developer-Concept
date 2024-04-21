package system_design.LLD.Car_Rental_System;

public class Bill {

    private Reservation reservation;
    private boolean paid;
    private double amount;


    public Bill(Reservation reservation) {
        this.reservation = reservation;
        this.amount = computeBillAmount();
        this.paid = false;
    }

    private double computeBillAmount() {
        return 100.0;
    }
}
