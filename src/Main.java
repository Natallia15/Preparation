public class Main {
    public static void main (String [] args) {

        Horse horse = new Horse(5, "black", 100, "jump");

        Dog dog = new Dog();
        dog.move();
        dog.voice();

        int i = 5;


        try {

                throw new MyExeption("неправильный тип данных");

        }
        catch (MyExeption M){
            System.out.println(M.getMessage());
            }
        finally {
            System.out.println("на ноль делить нельзя");
        }
        }
}
