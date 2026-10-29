
package com.rest.models;

public class Table {

    public enum Availability {
        FREE, OCCUPIED
    }

    private int tableNumber;
    private int capacity;
    private Availability status;

    public Table(int tableNumber, int capacity) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.status = Availability.FREE;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public Availability getStatus() {
        return status;
    }

    public void freeTable() {
        this.status = Availability.FREE;
    }

    public void occupyTable() {
        this.status = Availability.OCCUPIED;
    }

    @Override
    public String toString() {
        return "Table Number: " + tableNumber
                + ", Capacity: " + capacity
                + ", Status: " + status;
    }
}
