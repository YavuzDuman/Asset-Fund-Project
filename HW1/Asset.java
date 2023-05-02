/*
 * @Author: Yavuz Duman 200101031 *
 * A class to represent a Asset
 * Asset have name, description, costbasis, capitalgains
 */

public class Asset{
  //remember the name of the asses
  private String name;
  //remember the description of asset
  private String description;
  //store the main price of the asset
  private double costBasis;
  //refers to the increase in the value of a capital asset when it is sold
  private double capitalGains;
  //store the price someone is willing to buy the asset for
  private double currentPrice;
  
  /**
   * Constructs a new Asset object with the given name and costBasis.
   *
   * @param name the name of the Asset
   * @param costbasis
   */
  public Asset(String name, double costBasis){
    this.name = name;
    this.costBasis = costBasis;
    this.capitalGains = 0;
  }
  
  /* Retrieve the name of the asset
   * @return String asset name
   */
  public String getName(){
    return name;
  }
  
  /* Change the name of the asset
   * @param String asset name
   */
  public void setName(String name){
    this.name = name;
  }
  
  /* Retrieve the description of the asset
   * @return String asset's desctiption
   */
  public String getDescription(){
    return "Asset name: "+ this.name;
  }
  
  /* Change the description of the asset
   * @param String asset description
   */
  public void setDescription(String description){
    this.description = description;
  }
  
  /* Retrieve the costbasis of the asset
   * @return String asset costBasis
   */
  public double getCostBasis(){
    return costBasis;
  }
  
  /* Change the costBasis value of the asset
   * @param String asset costBasis
   */
  public void setCostBasis(double costBasis){
    this.costBasis = costBasis;
  }  
  
  /* Retrieve the currentPrice of the asset
   * @return String asset currentPrice
   */
  public double getCurrentPrice(){
    return currentPrice;
  }
  
  /* Change the currentPrice of the asset
   * @param String asset currentPrice
   */
  public void setCurrentPrice(double currentPrice){
    this.currentPrice = currentPrice;
  }
  
  /* Retrieve the capitalGains of the asset
   * @return String asset capitalGains
   */
  public double getCapitalGains(){
    return capitalGains;
  }
  
  /* Change the capitalGains of the asset
   * @param String asset capitalGains
   */
  public void setCapitalGains(double capitalGains){
    this.capitalGains = capitalGains;
  }
}