public class SpecialTech {

    private String specialName;
    private int specialPower;
    private String specialelement;
    //cons
    public SpecialTech(String specialName,int specialPower,String specialelement){
        this.specialelement = specialelement;
        this.specialName =  specialName;
        this.specialPower = specialPower;
    }
    //mthods
    public String getSepcicalname(){
        return specialName;
    }
    public int getSpecialPower(){
        return specialPower;
    }
    public String getElementspecial(){
        return specialelement;
    }
    @Override
    public String toString(){
        return String.format("Speical: %s\n Power: %d\n Element: %s\n",specialName,specialPower,specialelement);
    }
}
