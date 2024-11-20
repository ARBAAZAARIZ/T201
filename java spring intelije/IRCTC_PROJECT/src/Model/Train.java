package Model;

public class Train {

    private int trainNumber;
    private String trainName;
    private Routes origin;
    private Routes destination;
    private int seatsAvailable;

    public Train(int trainNumber, String trainName, Routes origin, Routes destination, int seatsAvailable) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.origin = origin;
        this.destination = destination;
        this.seatsAvailable = seatsAvailable;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public Routes getOrigin() {
        return origin;
    }

    public void setOrigin(Routes origin) {
        this.origin = origin;
    }

    public Routes getDestination() {
        return destination;
    }

    public void setDestination(Routes destination) {
        this.destination = destination;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    @Override
    public String toString() {
        return "Train name       : "+trainName+"\n"+
                "Train number    : "+trainNumber+"\n"+
                "Origin          : "+origin+"\n"+
                "Destination     : "+destination+"\n"+
                "Seat Available  : "+seatsAvailable;
    }
}
