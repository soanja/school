package efrei.fr.domain;

public class Classroom {
    private String roomNumber;
    private int size;

    public Classroom(String roomNumber, int size) {
        this.roomNumber = roomNumber;
        this.size = size;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "roomNumber='" + roomNumber + '\'' +
                ", size=" + size +
                '}';
    }
}
