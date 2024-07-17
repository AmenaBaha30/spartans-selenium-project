package tek_intro;

import java.util.Random;

public class TestCase01 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(1000);
        String email = "baha20@gmail.com";
        String AutoEmail = email + x + " @gmail.com";
        System.out.println(AutoEmail);



    }
}
