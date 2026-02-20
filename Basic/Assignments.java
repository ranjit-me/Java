class Feb2026 {

    public String ass1(int cp, int profit, int loss) {

        int sellingPriceProfit = cp + profit;
        int sellingPriceLoss = cp - loss;

        StringBuffer sb = new StringBuffer();

        sb.append("Selling Price when Profit = ");
        sb.append(sellingPriceProfit);
        sb.append("\n");

        sb.append("Selling Price when Loss = ");
        sb.append(sellingPriceLoss);

        return sb.toString();   
    }
    public float areaOfTrangle(int base,int height){
        return 0.5f*base*height;
    }
    public float areaParallelogram(int base, int height){
        return base*height;
    }
}

public class Assignments {
    public static void main(String[] args) {

        Feb2026 f1 = new Feb2026();


        System.out.println("Hello");
        System.out.println(f1.ass1(1000, 200, 150));
        System.out.println(f1.areaOfTrangle(1, 2));
        System.out.println(f1.areaParallelogram(5, 8));
    }
}
