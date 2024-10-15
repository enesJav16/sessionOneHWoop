public class Flowers {
    int freshness;
    int price;
    String name;

    void getFreshness(Flowers[] a) {
        Flowers[] freshhArr = a;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                Flowers q = a[j];
                Flowers w = a[j + 1];
                if (a[j].freshness < a[j+1].freshness) {
                    freshhArr[j] = w;
                    freshhArr[j + 1] = q;
                }
            }
        }
        for (int i = 0; i < freshhArr.length; i++) {
            System.out.println(freshhArr[i].name + " " + freshhArr[i].freshness);
        }
    }

    void getPrice(Flowers[] a){
        Flowers[] priceArr=a;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1; j++) {
                Flowers c=a[j];
                Flowers d=a[j+1];
                if(c.price<d.price){
                    priceArr[j]=d;
                    priceArr[j+1]=c;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(priceArr[i].name+" "+priceArr[i].price);
        }
    }
}
