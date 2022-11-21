public class Main {
    public static void main(String[] args) {

        remotecontrol fernbedienung = new remotecontrol();


        fernbedienung.powerinfo();
        fernbedienung.poweron();
        fernbedienung.powerinfo();

        for(int i=0;i<20;i++){
            fernbedienung.poweron();
        }
        fernbedienung.powerinfo();
        fernbedienung.newbattery();
        fernbedienung.powerinfo();
    }
}
