package system_design.LLD.Car_Rental_System;

import system_design.LLD.Car_Rental_System.product.Vehicle;

import java.util.Date;

public class Reservation {
    private int reservationId;
    private User user;
    private Vehicle vehicle;
    private Store store;
    private Date bookingDate;
    private Date dateBookFrom;
    private Date dateBookTill;
    private Long fromTimeStamp;
    private Long toTimeStamp;
    Location pickUpLocation;
    Location dropLocation;
    private ReservationType reservationType;
    private ReservationStatus reservationStatus;


    public int createReserve(User user, Vehicle vehicle) {
        //generate new id
        this.reservationId = 12232;
        this.user = user;
        this.vehicle = vehicle;
        this.reservationType = ReservationType.DAILY;
        this.reservationStatus = ReservationStatus.SCHEDULED;
        return reservationId;
    }


    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getDateBookFrom() {
        return dateBookFrom;
    }

    public void setDateBookFrom(Date dateBookFrom) {
        this.dateBookFrom = dateBookFrom;
    }

    public Date getDateBookTill() {
        return dateBookTill;
    }

    public void setDateBookTill(Date dateBookTill) {
        this.dateBookTill = dateBookTill;
    }

    public Long getFromTimeStamp() {
        return fromTimeStamp;
    }

    public void setFromTimeStamp(Long fromTimeStamp) {
        this.fromTimeStamp = fromTimeStamp;
    }

    public Long getToTimeStamp() {
        return toTimeStamp;
    }

    public void setToTimeStamp(Long toTimeStamp) {
        this.toTimeStamp = toTimeStamp;
    }

    public Location getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(Location pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public Location getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(Location dropLocation) {
        this.dropLocation = dropLocation;
    }

    public ReservationType getReservationType() {
        return reservationType;
    }

    public void setReservationType(ReservationType reservationType) {
        this.reservationType = reservationType;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }
}
