public class Road extends Barrier {
    private final int length;

    public Road(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Human human) {
        System.out.println(super.getName() + " длинной: " + this.length);

        human.run();

        if (getLength() <= human.getRunDistance()) {
            System.out.println("Человек успешно пробежал");

            return true;
        } else {
            System.out.println("Человек не смог пробежать");

            return false;
        }
    }

    @Override
    protected boolean moving(Robot robot) {
        System.out.println(super.getName() + " длинной: " + this.length);

        robot.run();

        if (getLength() <= robot.getRunDistance()) {
            System.out.println("Робот успешно пробежал");

            return true;
        } else {
            System.out.println("Робот не смог пробежать");

            return false;
        }
    }

    @Override
    protected boolean moving(Cat cat) {
        System.out.println( super.getName() + " длинной: " + this.length);

        cat.run();

        if (getLength() <= cat.getRunDistance()) {
            System.out.println("Кот успешно пробежал");

            return true;
        } else {
            System.out.println("Кот не смог пробежать");

            return false;
        }
    }
}