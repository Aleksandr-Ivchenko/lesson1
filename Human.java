public class Human implements Actions {
    private final String name;
    private final int runDistance;
    private final int jumpHeight;

    public Human(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Человек " + this.name + " пробежал " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Человек " + this.name + " прыгнул " + this.getJumpHeight());
    }

    public int getRunDistance() {
        return this.runDistance;
    }

    public int getJumpHeight() {
        return this.jumpHeight;
    }

}
