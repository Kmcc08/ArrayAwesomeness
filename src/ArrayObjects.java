public class ArrayObjects {
    public static void main(String[] args) {
     ArrayObjects a = new ArrayObjects();
    }
Sushi[] soosh = new Sushi[10];

    public ArrayObjects(){
        System.out.println("Making arrays with objects!");
        Sushi s = new Sushi(9.99);
        soosh[0]=s;
        soosh[0].printInfo();

    }
}
