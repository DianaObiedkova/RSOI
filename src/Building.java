import java.util.ArrayList;
import java.util.List;

public class Building {

    List<Tourniquet> tours=new ArrayList<Tourniquet>();
    List<Visitor> peopleInBuilding=new ArrayList<Visitor>();
    public int counter;
    public String name;

    public Building(String name){

        tours.add(new Tourniquet(1));
        tours.add(new Tourniquet(2));
        for(var tour: tours){
            tour.PutEntranceInWaitMode();
            tour.PutExitInWaitMode();
        }
        this.name=name;
    }
    
    public void ComesInSuccess(Visitor v, int tourId){
        tours.get(tourId-1).ReadDataFromEntrance(v.card.id);
        tours.get(tourId-1).UnblockEntrance();
        tours.get(tourId-1).BlockReadingFromExit();
        tours.get(tourId-1).FixPassingIn(v.card.id);
        tours.get(tourId-1).BlockEntrance();
        tours.get(tourId-1).UnblockReadingFromExit();
        tours.get(tourId-1).PutEntranceInWaitMode();

        //tours.get(tourId-1).entranceState=TourState.Green;
        //peopleInBuilding.add(v);
        
        //if(name=="A"){
        //    v.inBuildingA=true;
        //}
        //else{
        //    v.inBuildingB=true;
        //}

        //counter++;
    }

    public void ComesInFailed(Visitor v, int tourId){
        tours.get(tourId-1).ReadDataFromEntrance(v.card.id);
        var str=tours.get(tourId-1).ErrorEntrance();
        
        //

        tours.get(tourId-1).PutEntranceInWaitMode();
    }

    public void ComesOutSuccess(Visitor v, int tourId){
        tours.get(tourId-1).ReadDataFromExit(v.card.id);
        tours.get(tourId-1).UnblockExit();
        tours.get(tourId-1).BlockReadingFromEntrance();
        tours.get(tourId-1).FixPassingOut(v.card.id);
        tours.get(tourId-1).BlockExit();
        tours.get(tourId-1).UnblockReadingFromEntrance();
        tours.get(tourId-1).PutExitInWaitMode();
    }

    public void ComesOutFailed(Visitor v, int tourId){

        tours.get(tourId-1).ReadDataFromExit(v.card.id);
        var str=tours.get(tourId-1).ErrorEntrance();
        
        //

        tours.get(tourId-1).PutExitInWaitMode();
    }
}
