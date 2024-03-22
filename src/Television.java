
public class Television {
	public String brand;
    public String color;
    public int channel;
    public int volume;

    public Television(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.channel = 1;
        this.volume = 50;
    }
    
    public void turnOn() {
        System.out.println("Turning on the " + brand + " television.");
    }
    public void turnOff() {
        System.out.println("Turning off the " + brand + " television.");
    }

    public void changeChannel(int newChannel) {
        this.channel = newChannel;
        System.out.println("Changing channel to " + newChannel);
    }

    public void turnUpVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume up: " + volume);
        } else {
            System.out.println("Maximum volume reached.");
        }
    }

    public void turnDownVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume down: " + volume);
        } else {
            System.out.println("Minimum volume reached.");
        }
   }
}
