package MusicPlayerInterfaceAbstract;

interface Playable {
    void play();
}
abstract class MusicDevice {

    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void info() {
        System.out.println("เครื่องเล่นเพลงยี่ห้อ " + getBrand() + " กำลังเล่นเพลง");
    }

    abstract void connect();
}

class CDPlayer extends MusicDevice implements Playable {
    public void play() {
        System.out.println("เครื่องเล่นเพลงยี่ห้อ " + getBrand() + " กำลังเล่นเพลง");
    }

    public void connect() {
        System.out.println("เชื่อมต่อแผ่น CD...");
    }
}

class SmartPhone extends MusicDevice implements Playable {
    public void play() {
        System.out.println("เครื่องเล่นเพลงยี่ห้อ " + getBrand() + " กำลังเล่นเพลงผ่าน Spotify");
    }

    public void connect() {
        System.out.println("เชื่อมต่อผ่าน Bluetooth...");
    }

    public static void main(String[] args) {
        CDPlayer cdPlayer = new CDPlayer();
        cdPlayer.setBrand("Sony");
        cdPlayer.play();
        cdPlayer.connect();
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setBrand("Apple");
        smartPhone.play();
        smartPhone.connect();
    }
}