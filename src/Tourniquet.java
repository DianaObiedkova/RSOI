public class Tourniquet {
    public int tourId;
    public TourState entranceState;
    public TourState exitState;
    public boolean readingFromEntrance;
    public boolean readingFromExit;

    public Tourniquet(int id){//запустить систему
        tourId=id;
        entranceState=TourState.Yellow;
        exitState=TourState.Yellow;
    }

    //перевести вхід у режим очікування
    public void PutEntranceInWaitMode(){
        entranceState=TourState.Yellow;
    }
    //Перевести вихід у режим очікування
    public void PutExitInWaitMode(){
        exitState=TourState.Yellow;
    }
    //зчитати дані картки на вході
    public void ReadDataFromEntrance(int cardId){
        for(int i=0;i<DB.cards.size();i++){
            if(DB.cards.get(i).id==cardId && readingFromEntrance==true 
            && DB.people.get(i).card.id==cardId 
            && DB.people.get(i).card.damaged==false){
                


                ///????
            }
        }
    }
    //зчитати дані картки на виході
    public void ReadDataFromExit(int cardId){
        
    }
    // Розблокувати вхід
    public void UnblockEntrance(){
        entranceState=TourState.Green;
    }
    //Розблокувати вихід
    public void UnblockExit(){
        exitState=TourState.Green;
    }
    //Зафіксувати проходження у приміщення
    public void FixPassingIn(int cardId){
        
    }
    //Зафіксувати проходження з приміщення
    public void FixPassingOut(int cardId){
        
    }
    //Заблокувати вхід
    public void BlockEntrance(){
        entranceState=TourState.Red;
    }
    //Заблокувати вихід
    public void BlockExit(){
        entranceState=TourState.Red;
    }
    //Заблокувати зчитування на вхід
    public void BlockReadingFromEntrance(){
        readingFromEntrance=false;
    }
    //Заблокувати зчитування на вихід
    public void BlockReadingFromExit(){
        readingFromExit=false;
    }
    //Розблокувати зчитування на вхід
    public void UnblockReadingFromEntrance(){
        readingFromEntrance=true;
    }
    //Розблокувати зчитування на вихід
    public void UnblockReadingFromExit(){
        readingFromExit=true;
    }
    //Повідомити про помилку на вході
    public String ErrorEntrance(){
        return "Entrance Error";
    }
    //Повідомити про помилку на виході
    public String ErrorExit(){
        return "Exit Error";
    }

}
