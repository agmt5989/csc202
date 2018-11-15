package csc202;

// import java.awt.print.Book;

public class TimeTable {
    private Booking time1 = new Booking("A102", "Dr. Smart");
    private Booking time2 = new Booking("C001", "Professor Jackson");
    private Booking time3 = new Booking("F9", "Rev. Smith");
    private Booking time4 = new Booking("J201", "Mr. Michael");
/*
    private Booking times [] = {time1, time2};
*/

    private Booking [] [] times = new Booking {{time1, time2}, {time3, time4}};
    public TimeTable () {
        //
    }

    public boolean makeBooking () {
        //
    }

    public boolean isFree () {
        //
    }

    public Booking getBooking () {
        //
    }

    public int numberOfDays () {
        //
    }

    public int numberOfPeriods () {
        //
    }
}
