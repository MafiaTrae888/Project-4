import java.util.ArrayList;

public class Samurai {
    // var instance
    private String name;
    private int hp;
    private ArrayList<SpecialTech> specialTechArrayList = new ArrayList<>();

    //constuor
    public Samurai(String name, int hp) {
        this.name = name;
        this.hp = hp;

    }

    //mehtods
    //getters for name,hp,and list
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public ArrayList<SpecialTech> getSpecialTechArrayList() {
        return specialTechArrayList;
    }

    public void addSpecTech(SpecialTech specialTech) {
        specialTechArrayList.add(specialTech);

    }

    public void removeSpecTech(SpecialTech specialTech) {
        specialTechArrayList.remove(specialTech);
    }

    public SpecialTech getspeicaltech(String specialName) {
        SpecialTech foundSpecial = null;
        //enhance
        for (SpecialTech specialTech : specialTechArrayList) {
            if (specialTech.getSepcicalname().equals(specialName)) {
                foundSpecial = specialTech;
                break;
            }


        }
        return  foundSpecial;
    }
}
