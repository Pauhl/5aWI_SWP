import java.util.ArrayList;
import java.util.List;
public class lampe {
    int lampeid;
    public List<lightelement> lightelements;

    public lampe(int lampeid) {
        this.lampeid=lampeid;
        this.lightelements= new ArrayList<>();

    }

    public List<lightelement> getLightelements() {
        return lightelements;
    }

    public void getOverallPowerUsage() {
        int power = 0;
        for (lightelement lightelement:this.lightelements) {
            power+=lightelement.consumption;
        }

        System.out.println("bisher verbrauchten Strom aller Glühelemente:" +power);
    }


    public void addLightelement(lightelement lightelement) {
        this.lightelements.add(lightelement);
    }

    public void turnAllOn() {
        for (lightelement lightelement:this.lightelements) {
            lightelement.status=true;
            lightelement.consumption+=5;
        }
    }

    public void printNamesOfLightElements() {
        String namelist = "";
        for (lightelement lightelement:this.lightelements) {
            namelist+=lightelement.name +"; ";
        }
        System.out.println(namelist);
    }

}
