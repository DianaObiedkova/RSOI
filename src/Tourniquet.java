public class Tourniquet {
    public int tourId;
    public TourState entranceState;
    public TourState exitState;

    public Tourniquet(int id){
        tourId=id;
        entranceState=TourState.Yellow;
        exitState=TourState.Yellow;
    }
}
