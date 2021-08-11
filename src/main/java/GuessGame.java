import java.util.logging.Logger;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player(); // create 3 objects
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0; // create 3 variable for objects answers
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false; // create checker answers boolean for show
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10); // create hidden number
        System.out.println("Я загадываю число от 0 до 9...");

        while (true) {
            System.out.println("Число, которое нужно угадать, - " + targetNumber);

            p1.guess(); // objects answers
            p2.guess();
            p3.guess();

            guessp1 = p1.number; // objects answers
            System.out.println("Первый игрок думает, что это " + guessp1);
            guessp2 = p2.number;
            System.out.println("Второй игрок думает, что это " + guessp2);
            guessp3 = p3.number;
            System.out.println("Третий игрок думает, что это " + guessp3);

            if (guessp1 == targetNumber) { // here we check answers players
                p1isRight = true;
            }
            if (guessp2 == targetNumber) { // check player two
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {// check player three
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал? " + p1isRight);
                System.out.println("Второй игрок угадал? " + p2isRight);
                System.out.println("Третий игрок угадал? " + p3isRight);
                System.out.println("Конец игры");
                break;
            } else {
                System.out.println("Игроки должны попробовать еще раз");
            }

        }
    }
}
