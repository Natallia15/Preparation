public class Dog implements Animals{
    @Override
    public void move() {
        System.out.println("бегает");
    }

    @Override
    public void voice() {
        System.out.println("лает");
    }
}
