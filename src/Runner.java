public class Runner {
    public static void main(String[] args){
        Car abby = new Car(2002, "bmw", "16");
        System.out.println(abby.toString());
        abby.drive(50);
        System.out.println(abby.toString());


        Rectangle test = new Rectangle(5,5);
        System.out.println(test.getArea());
        System.out.println(test.getDiagonal());
        System.out.println(test.isSquare());
    }
}
