public class Main {
    public static void main(String[] args) {
        Sim sim = new Sim(1, "0432324");
        SDCard card = new SDCard(5000);
        Camera cam = new Camera();

        Phone phone = new Phone(sim,cam,card);
        phone.doCall("324321840321");
        phone.takePicture();
        phone.getAllFiles();

        System.out.println(phone.getFreeSpace());

        PhoneGUI gui = new PhoneGUI(phone);
        gui.run();
    }
}