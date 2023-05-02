/*
 * @Author: Yavuz Duman 200101031 *
 * A class to represent Equity
 */
public class Equity extends Asset{
  //stores the symbol
  private char symbol;
  //remember number of shares
  private double numberShares;
  
  /* A constructor to create a Equity with name, symbol and currentPrice
   *@param name
   * @param symbol
   * @param currentprice
   */
  public Equity(String name, char symbol, double currentPrice){
    super(name, 0);
    this.symbol = symbol;
  }
  
  /* Retrieve the symbol
   * @return String symbol
   */
  public char getSymbol(){
    return symbol;
  }
  
  /* Retrieve the number of shares
   * @return double numberShares
   */
  public double getNumberShares(){
    return numberShares;
  }
  
  /* Change the name of shares
   * @param double numberShares
   */
  public void setNumberShares(double numberShares){
    this.numberShares = numberShares;
  }
}