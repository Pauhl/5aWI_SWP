public class Main {
    public static void main(String[] args) {

        lampe lampesepp = new lampe(1234);
        lampesepp.addLightelement(new lightelement("COB LED", "green", 10, false));
        lampesepp.addLightelement(new lightelement("COB LED", "blue", 8, false));
        lampesepp.addLightelement(new lightelement("SMD LED.", "yellow", 15, false));



        lampesepp.getOverallPowerUsage();
        lampesepp.getLightelements().get(0).turnOn();
        lampesepp.getLightelements().get(0).turnOn();
        lampesepp.getOverallPowerUsage();


        lampesepp.turnAllOn();
        System.out.println(lampesepp.getLightelements().get(0).status);
        lampesepp.getOverallPowerUsage();
        lampesepp.printNamesOfLightElements();


    }
}