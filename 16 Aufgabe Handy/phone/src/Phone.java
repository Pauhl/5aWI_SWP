import java.util.List;

public class Phone {
    private Sim sim;
    private Camera cam;
    private SDCard card;

    public Phone(Sim sim, Camera cam, SDCard card) {
        this.cam=cam;
        this.sim=sim;
        this.card=card;
    }

    public void doCall(String number) {
        sim.doCall(number);
    }

    public int getFreeSpace() {
        return this.card.getFreeSpace();
    }

    public void takePicture() {
        if(this.getFreeSpace()>999) {
            PhoneFile file = this.cam.takePicture();
            this.card.save(file);
        }
        else {
            System.out.println("No free space left");
        }



    }

    public List<PhoneFile> getAllFiles() {
        return this.card.getFiles();
    }
}
