package HW42;

public class SecretCodeGenerator {
    public static void generateSecretCode() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println((new Object()).hashCode());
    }
}
