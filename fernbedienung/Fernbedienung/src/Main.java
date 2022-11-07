public class Main {
    public static void main(String[] args) {

        remotecontrol fernbedienung = new remotecontrol();


        fernbedienung.powerinfo();
        fernbedienung.poweron();
        fernbedienung.powerinfo();
        fernbedienung.poweron();
        fernbedienung.powerinfo();
        fernbedienung.poweron();
    }
}