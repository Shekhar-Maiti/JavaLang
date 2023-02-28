public class Stock_price {

    public static int Stock_profit(int prices[]){
        int Buyprice=Integer.MAX_VALUE;
        int Max_profit=0;
        for(int i=0;i<prices.length;i++){
            if(Buyprice<prices[i]){
                int profit=prices[i]-Buyprice;
                Max_profit=Math.max(Max_profit, profit); 
            }
            else{
                Buyprice=prices[i];
            }
        }
        return Max_profit;
    }
    public static void main (String args[]){
        int prices[]={23,69,58,12,36,45,32};
        System.out.println("max profit in the stock is: "+Stock_profit(prices));
    }
}
