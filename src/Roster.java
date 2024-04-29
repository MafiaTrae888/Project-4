import java.util.ArrayList;

public class Roster {
    //
    private ArrayList<Samurai> samuraiArrayList = new ArrayList<>();

    public void addSamurai(Samurai samurai){
        samuraiArrayList.add(samurai);
    }
    public void removeSamurai(Samurai samurai){
        samuraiArrayList.remove(samurai);
    }
    public ArrayList<Samurai> getSamuraiArrayList(){
        return samuraiArrayList;
    }
    public Samurai getSamurai(String samuraiName){
        Samurai foundSamurai=null;
        for (Samurai samurai: samuraiArrayList){
            if (samurai.getName().equals(samuraiName)){
                foundSamurai =samurai;
                break;
            }
        }
        return foundSamurai;
    }
}
