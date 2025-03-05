public class Sushi {
    String ingredient;
    String type;
    double price;
    int size;
    boolean isHot;

//    public static void main(String[] args) {
//
//    }
    public void  printInfo(){
        System.out.println("type" + type);
        System.out.println("type" + ingredient);
        System.out.println("type" + price);
        System.out.println("type" + size);
        System.out.println("type" + isHot);

    }




    public Sushi(double Sprice){
        ingredient = "salmon, rice, seaweed";
        type = "good sushi";
        price = Sprice;
        size = 10;
        isHot = false;



    }

}
