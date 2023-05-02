/*
 * @Author: Yavuz Duman 200101031 *
 * A class to represent a Bond
 */
public class Bond extends Asset{
  //stores the principal
  private double principal;
  //remember the rate of interests
  private double interestRate;
  //remember the number of owned
  private int numberOwned;
  
  /* This is a constructor to create a new object of Bond class takes name, principal, interestRate
   * @param name
   * @param principal
   * @param interestRate
   */
  public Bond(String name, double principal, double interestRate){
    super(name, 0);
    this.interestRate = interestRate;
    this.principal = principal;
  }
  
  /* Retrieve the principal
   * @return double principal
   */
  public double getPrincipal(){
    return principal;
  }
  
  /* Retrieve number of owned
   * @return double numberOwned
   */
  public int getNumberOwned(){
    return numberOwned;
  }
  
  /* Change the value of numberOwned
   * @param int numberOwned
   */
  public void setNumberOwned(int numberOwned){
    this.numberOwned = numberOwned;
  }
  
  /* Retrieve the interest rate
   * @return double interest rate
   */
  public double getInterestRate(){
    return interestRate;
  }
  
  /* Change the value of interest rate
   * @param double interestRate
   */
  public void setInterestRate(double interestRate){
    this.interestRate = interestRate;
  }
  
  /* 
   * @return double result
   */
  public double payInterest(){
    double result = getInterestRate() * getPrincipal();
    result = result + getPrincipal();
    return result;
  }
  
  /* Return the current price
   * @return double currenPrice
   */
  public double buy(){
    setCostBasis(getCurrentPrice());
    setNumberOwned(getNumberOwned()+1);
    return getCurrentPrice();
  }
  
  /* Return the current price
   * @return double currenPrice
   */
  public double sell(){
    if(getNumberOwned() == 0)
      return 0;
    else{
      setCostBasis(getCostBasis() - (getCostBasis() / getNumberOwned()));
      setCapitalGains(getCurrentPrice() - getCostBasis());
      setNumberOwned(getNumberOwned() - 1);
      return getCurrentPrice();
    }
  }
}