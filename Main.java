import java.util.Scanner;

public class Main 
{
public static void main(String[] args) 
	{
//	data ko memory main manage karne ka lya dow ka use kare ge to main ka pass dao ka class ka object ka refrance hona cahya
//	iss lya ham yaha dao clss ka object ka refrance banye ga
	ProductDao dao = new ProductDao();
	Scanner sc = new Scanner(System.in);//here in ka data type inputStream hai. 
	do {
		//yaha product ki detials show karne ka code hai 
      System.out.println("Product Management\n");
      System.out.println("1: Add Product");
      System.out.println("2: Show Product");
      System.out.println("3: Delete Product");
      System.out.println("4: Exit");
      System.out.println("Enter your choice:");
      //user se input lene ka lya input nextInt ka use kya gya hai
      int ch=sc.nextInt();
      sc.nextLine();
      //number ko accept karne ka lya switch case ka use kya gya hai
      switch(ch)
      {
      case 1:
    	  //data ko variable mai wo run karne per delete ho jata hai iss lya ham object ka use kare ge
    	 // ya data ko object main rake ga
//    	  yaha ham product name ka object banye ge jo 
    	  //ki abhi null hai but jab haam user se input lage 
    	  //to us main user se inter ki gai valu save ho jya ge.
    	  Product product = new Product();
    	  
          System.out.println("\nEnter product name:");
          product.setName(sc.nextLine());
          
          System.out.println("\nEnter product brand:");
          product.setBrand(sc.nextLine());
          
          System.out.println("\nEnter product price:");
          product.setPrice(sc.nextInt());
          
          //daoProduct class ka add product method call kar ke product ka object ka reference dao ko pass kya hai 
          dao.addProduct(product);
    	  break;
      case 2:
         dao.showProducts();
     	  break;
      case 3:
			dao.deleteProducts();
			break;
      case 4: 
    	  System.out.println("\nProgram Treminated successfuly");
    	  return;
    	  default:
    		  System.out.println("\nWrong choice.Please enter a valid choice");
    		  break;
      }
	}while(true);
	}
}
