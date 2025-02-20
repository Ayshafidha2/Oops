import java.util.Scanner;
class Product
{
  int pcode,price;
  String pname;
  Product(int code,String name,int pr)
  {
  pcode=code;
  pname=name;
  price=pr;
  }
  }
class Productt  
{
public static void main(String args[]){
Product Product1=new Product(101,"crayons",45);
int pcode,price;
String pname;
pcode=1002;
pname="sketch pen";
price=30;
Product Product2=new Product(pcode,pname,price);
Scanner sc=new Scanner(System.in);
System.out.println("Enter product code");
pcode=sc.nextInt();
System.out.println("Enter product name");
pname=sc.next();
System.out.println("Enter product price");
price=sc.nextInt();
Product Product3=new Product(pcode,pname,price);
System.out.println("\n pcode:"+Product1.pcode);
System.out.println("\n pname:"+Product1.pname);
System.out.println("\n price:"+Product1.price);

System.out.println("\n pcode:"+Product2.pcode);
System.out.println("\n pname:"+Product2.pname);
System.out.println("\n price:"+Product2.price);

System.out.println("\n pcode:"+Product3.pcode);
System.out.println("\n pname:"+Product3.pname);
System.out.println("\n price:"+Product3.price);

System.out.println("\n Product having Lowest Price is:");
if(Product1.price < Product2.price && Product1.price < Product3.price)
{ 
System.out.println("\n pcode:"+Product1.pcode);
System.out.println("\n pname:"+Product1.pname);
System.out.println("\n price:"+Product1.price);
}
else
if(Product2.price < Product1.price && Product2.price < Product3.price)
{
System.out.println("\n pcode:"+Product2.pcode);
System.out.println("\n pname:"+Product2.pname);
System.out.println("\n price:"+Product2.price);
}
else
{
System.out.println("\n pcode:"+Product3.pcode);
System.out.println("\n pname:"+Product3.pname);
System.out.println("\n price:"+Product3.price);
}
}
}

