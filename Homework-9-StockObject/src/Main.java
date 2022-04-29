public class Main {
    public static void main(String[] args) {
        //ORACLE STOCK
    Stock ORCLStock = new Stock("ORCL","Oracle Corporation",34.5,34.35);
    System.out.println("Stock info: \n"+"Stock Name: "+ORCLStock.name+ "\n"+"Stock Symbol: " +ORCLStock.symbol);
    System.out.println("The percent change is "+ORCLStock.getChangePercent()+"% \n");

        // YAHOO STOCK
    Stock YAHOOStock = new Stock("YAHOO", "Yahoo",34.5,34.35);
    System.out.println("Stock info: \n"+"Stock Name: "+YAHOOStock.name+ "\n"+"Stock Symbol: " +YAHOOStock.symbol);
    System.out.println("The percent change is "+YAHOOStock.getChangePercent()+"%");

    }
}