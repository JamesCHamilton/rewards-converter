
public class RewardValue {
    private double cash;
    private int miles;
    private final double CONVERSIONRATE = 0.0035;


    public RewardValue(double cash){
        this.cash = cash;
    }
    public RewardValue(int miles){
        this.miles = miles;
    }

   public double getCashValue() {return cash;}
   public int getMilesValue() {return miles;}
   
    public int convert_from_cash_to_miles(){
        return (int)(getCashValue()/CONVERSIONRATE);
    }

   public double convert_from_miles_to_cash(){
        return (double)(getMilesValue()*CONVERSIONRATE); 
    }

}

