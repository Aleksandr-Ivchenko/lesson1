public class Cat implements Actions {
    private final String name;
    private final int runDistance;
    private final int jumpHeight;

    public Cat(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Кот " + this.name + " пробежал " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Кот " + this.name + " прыгнул " + this.getJumpHeight());
    }

    public int getRunDistance() {
        return this.runDistance;
    }

    public int getJumpHeight() {
        return this.jumpHeight;
    }
}