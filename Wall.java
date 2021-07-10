public class Wall extends Barrier {

    private final int height;

    public Wall(String name, int heigth) {
        super(name);

        this.height = heigth;
    }

    public int getHeigth() {
        return height;
    }

    @Override
    protected boolean moving(Human human) {
        System.out.println(super.getName() + " высотой: " + this.height);

        human.jump();

        if (getHeigth() <= human.getJumpHeight()) {
            System.out.println("Человек успешно перепрыгнул");

            return true;
        } else {
            System.out.println("Человек не смог перепрыгнуть");

            return false;
        }
    }

    @Override
    protected boolean moving(Robot robot) {
        System.out.println(super.getName() + " высотой: " + this.height);

        robot.jump();

        if (getHeigth() <= robot.getJumpHeight()) {
            System.out.println("Робот успешно перепрыгнул");

            return true;
        } else {
            System.out.println("Робот не смог перепрыгнуть");

            return false;
        }
    }

    @Override
    protected boolean moving(Cat cat) {
        System.out.println(super.getName() + " высотой: " + this.height);

        cat.jump();

        if (getHeigth() <= cat.getJumpHeight()) {
            System.out.println("Кот успешно перепрыгнул");

            return true;
        } else {
            System.out.println("Кот не смог перепрыгнуть");

            return false;
        }
    }
}