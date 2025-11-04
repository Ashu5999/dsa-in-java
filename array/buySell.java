public class buySell {

    public static int buyAndsell(int prices[]){
        int buyprices = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0;i<prices.length;i++){
            if(buyprices < prices[i]){ // profit
           int profit = prices[i]-buyprices;
           maxprofit = Math.max(maxprofit , profit);
            }
            else{
                buyprices = prices[i];
            }
        }
        return maxprofit;
    }
    
    public static void main(String args[]){
        int prices[]= { 7,1,5,3,6,4}  ;
        System.out.println(buyAndsell( prices));
      }
}
