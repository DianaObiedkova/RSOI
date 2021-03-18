import java.util.ArrayList;
import java.util.List;

public class Environment {

    List<Visitor> people=new ArrayList<Visitor>();
    Building A;
    Building B;

    public Environment(){
        for(int i=0; i<100; i++){
            people.add(new Visitor(i));
        }

        A=new Building("A");
        B=new Building("B");
    }

}
