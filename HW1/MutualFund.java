/* @Author: Yavuz Duman 200101031 *
 * A class to represent a MutualFund
 */
public class MutualFund extends Equity{
  //stores the load
  private double load;
  
  /* A constructor to create a MutualFund with name, symbol and currentPrice
   * @param name
   * @param symbol
   * @param currentPrice
   */
  public MutualFund(String name, char symbol, double currentPrice){
    super(name, symbol, currentPrice);
  }
  
  /* Retrieve the value of load
   * @return double load
   */
  public double getLoad(){
    return load;
  }
  
  /* Change the value of load
   * @param double load
   */
  public void setLoad(double load){
    this.load = load;
  }
}