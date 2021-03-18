import java.util.ArrayList;
import java.util.List;

public class DB {

    private static DB instance;
    static List<Card> cards=new ArrayList<Card>();
    static List<Visitor> people=new ArrayList<Visitor>();
    //static int countInBuildingA;
    //static int countInBuildingB;

    private DB(){

        for(int i=0;i<200;i++){
            cards.add(new Card(i));

            if(i%4==0)
                cards.get(i).damaged=true;
        }

        for(int i=0;i<300;i++){
            people.add(new Visitor(i));

            if(i<200)
                people.get(i).card=cards.get(i);
        }

    }
   
    public static DB getInstance(){
        if(instance==null){
            instance=new DB();
        }
        return instance;
    }
}
