//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Flowers flower1 = new Flowers();
        flower1.name ="Rose";
        flower1.freshness= 2;
        flower1.price=100;

        Flowers flower2 = new Flowers();
        flower2.name ="Lyly";
        flower2.freshness= 6;
        flower2.price=200;

        Flowers flower3 = new Flowers();
        flower3.name ="Moon-flower";
        flower3.freshness= 4;
        flower3.price=300;


        Flowers [] flowers={flower1,flower2,flower3};

        Flowers freshList = new Flowers();
        freshList.getFreshness(flowers);

        System.out.println("");

        Flowers priceList = new Flowers();
        priceList.getPrice(flowers);
    }
}