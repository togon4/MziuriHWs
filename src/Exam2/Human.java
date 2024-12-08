package Exam2;

class Human implements Greetings, Actions {
    @Override
    public void jump() {
        System.out.println("Jumping");
    }

    @Override
    public void run() {
        System.out.println("Running");
    }

    @Override
    public void sayBye() {
        System.out.println("Bye bye!");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }

}
