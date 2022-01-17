public class Jiraf extends Animal implements Animals {

    public Jiraf(int age, String color, int weight, String m) {
        super(age, color, weight, m);
    }

    @Override
    public void move() {
        System.out.println("топает");

    }

    @Override
    public void voice() {
        System.out.println("хрюкает");
            }


//    public Jiraf(int age, String color, int weight, String m) {
//        super(age, color, weight,m);
//            }
//
//    @Override
//    public void move() {
//
//    }
}
