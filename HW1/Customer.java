/*
 * @Author: Yavuz Duman 200101031 *
 * A class to represent a Customer
 */
public class Customer{
  //an instance for Bond
  private Bond bond;
  //an instance for Mutual
  private MutualFund mutual;
  //stores the total cash
  private double totalCash;
  //remember the first name of customer
  private String fname;
  //remember the last name of customer
  private String lname;
  
  /* A constructor to create a customer with fname lname and total cash
   * @param bond
   * @param mutual
   * @param fname
   * @param lname
   * @param totalcash
   */
  public Customer(Bond bond, MutualFund mutual, String fname, String lname, double totalCash){
    this.fname = fname;
    this.lname = lname;
    this.totalCash = totalCash;
  }
  
  /* Retrieve the first name of the customer
   * @return String fname
   */
  public String getFirstName(){
    return fname;
  }
  
  /* Change the first name of the customer
   * @param String customer fname
   */
  public void setFirstName(String fname){
    this.fname = fname;
  }
  
  /* Retrieve the last name of the customer
   * @return String lname
   */
  public String getLastName(){
    return lname;
  }
  
  /* Change the last name of the customer
   * @param String customer lname
   */
  public void setLastName(String lname){
    this.lname = lname;
  }
  
  
}