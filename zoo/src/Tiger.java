public class Tiger extends Animal implements Walk{
    private int numberOfStripes;
    private int speed;
    private double soundLevel;


    public Tiger() {
        super("Tiger");
    }

    // 2. Getters and Setters for all properties

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(double soundLevel) {
        this.soundLevel = soundLevel;
    }

    // --- Methods from original file (will be used later) ---
    @Override
    public void eatingCompleted(){
        System.out.println("Tiger: I Have eaten");
    }

    // This will be renamed to "walking" in a later TODO
    @Override
    public void walking(){
        System.out.println("I am walking at the speed " + speed + " mph");
    }
}


