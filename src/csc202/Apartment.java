package csc202;

public class Apartment {
    // Individual predefined rooms
    private Rectangle room1 = new Rectangle(5.0, 4.5);
    private Rectangle room2 = new Rectangle(5.0, 5.5);
    private Rectangle room3 = new Rectangle(2.0, 4.0);

    private Rectangle[] trooms = {this.room1, this.room2, this.room3};
    private int total;

    public Apartment(int number) {
        // Number of rooms
        if (this.trooms != null && this.trooms.length == number)
        {
            // Nothing to do
            return;
        }
        else {
            for (int x = 1; x == this.trooms.length; x++) {
                this.trooms[x - 1] = new Rectangle(2.0, 4.2);
            }
        }
    }

    public boolean add (Rectangle room) {
        room = new Rectangle(12.3, 11.0);
        if (this.trooms[3] == room)
        {
            return true;
        }
        else
            {
                return false;
            }
    }

    public double getRoomArea (int num) {
        Rectangle roomInFocus = this.trooms[num - 1];
        return roomInFocus.calculateArea();
    }

    public double getRoomLength (int num) {
        Rectangle roomInFocus = this.trooms[num - 1];
        return roomInFocus.getLength();
    }

    public double getRoomHeight (int num) {
        Rectangle roomInFocus = this.trooms[num - 1];
        return roomInFocus.getHeight();
    }
}
