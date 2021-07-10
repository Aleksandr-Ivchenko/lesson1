import java.util.Random;

public class Lesson1 {
    public static void main(String[] args) {

        Random rand = new Random();
        Actions[] actions = new Actions[3];

        int distance = rand.nextInt(10);
        int heigth = rand.nextInt(10);
        actions[0] = new Human("Paddy", distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[1] = new Robot("R2D2", distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[2] = new Cat("Tom", distance, heigth);

        Barrier[] barriers = new Barrier[6];

        boolean isRoad;
        for (int i = 0; i < barriers.length; i++) {
            distance = rand.nextInt(10);
            isRoad = rand.nextBoolean();
            if (isRoad) {
                barriers[i] = new Road("Дорожка " + i, distance);
            } else {
                barriers[i] = new Wall("Стена " + i, distance);
            }
        }

        for (Actions action : actions) {
            boolean result = true;
            for (Barrier barrier : barriers) {


                if (Human.class == action.getClass()) {
                    result = barrier.moving((Human) action);
                }

                if (Robot.class == action.getClass()) {
                    result = barrier.moving((Robot) action);
                }

                if (Cat.class == action.getClass()) {
                    result = barrier.moving((Cat) action);
                }

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Дистанцич успешно пройдена!!!");
            } else {
                System.out.println("Дистанция не пройдена!!!");
            }
        }
    }
}