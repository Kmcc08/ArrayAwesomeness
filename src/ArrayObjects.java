public class ArrayObjects {
    public static void main(String[] args) {
        ArrayObjects a = new ArrayObjects();
    }

    Sushi[] soosh = new Sushi[10];

    public ArrayObjects() {
        System.out.println("Making arrays with objects!");
        Sushi s1 = new Sushi(9.99);
        soosh[0] = s1;
        soosh[0].printInfo();
        for (int x = 0; x < 10; x++) {
            soosh[x] = new Sushi(Math.random() * 250);
        }
        printArray();

    }

    public void printArray() {

        for (int x = 0; x < soosh.length; x++) {
            // soosh[x]=new Sushi(Math.random()*250);
            soosh[x].printInfo();
        }
    }

    public void changeSizes() {

        for (int x = 0; x < soosh.length; x++) {

            soosh[x].size = (int)(Math.random()*10)+10;

        }


    }
}