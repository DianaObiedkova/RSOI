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
        this.name=name;
    }
    
    public void ComesInSuccess(Visitor v, int tourId){
        tours.get(tourId-1).entranceState=TourState.Green;
        peopleInBuilding.add(v);
        
        if(name=="A"){
            v.inBuildingA=true;
        }
        else{
            v.inBuildingB=true;
        }

        counter++;
    }

    public void ComesInFailed(Visitor v, int tourId){

        tours.get(tourId-1).entranceState=TourState.Red;
    }

    public void ComesOutSuccess(Visitor v, int tourId){
        tours.get(tourId-1).exitState=TourState.Green;
        peopleInBuilding.remove(v);
        
        if(name=="A"){
            v.inBuildingA=false;
        }
        else{
            v.inBuildingB=false;
        }

        counter--;
    }

    public void ComesOutFailed(Visitor v, int tourId){

        tours.get(tourId-1).exitState=TourState.Red;
    }
}
