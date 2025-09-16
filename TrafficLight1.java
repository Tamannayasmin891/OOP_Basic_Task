class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

public class TrafficLight1 {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("red", 30);

        System.out.println("The light is red: " + light.isRed());
        System.out.println("The light is green: " + light.isGreen());

        light.changeColor("green");
        System.out.println("The light is now green: " + light.isGreen());

        System.out.println("The light duration is: " + light.getDuration());
        light.setDuration(20);
        System.out.println("The light duration is now: " + light.getDuration());
    }
}
