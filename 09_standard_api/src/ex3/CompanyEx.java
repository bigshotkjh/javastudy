package ex3;

public class CompanyEx {

  public static void main(String[] args) {
    
    Company company = new Company("samsung");
    
    new CompanyHandler(company).manage();

  }

}
