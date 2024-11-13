import java.util.*;
public class Book{
	private String bname;
	private String author;
	private double price;
	private int num_pages;

	Book(String bname, String author, double price, int num_pages){
		this.bname=bname;
		this.author=author;
		this.price=price;
		this.num_pages=num_pages;
	}
	public void setName(String bname){
		this.bname=bname;
	}
	public void setAuthor(String author){
		this.author=author;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public void setNUmPages(int num_pages){
		this.num_pages=num_pages;
	}

	public String getName(){
		return bname;
	}
	public String getAuthor(){
		return author;
	}
	public double getPrice(){
		return price;
	}
	public int getNumPages(){
		return num_pages;
	}

	public String toString(){
		return ("Book Details:\n Book name:"+bname+"\n Book author:"+author+"\n Book price:"+price+"\n No.of pages in the book:"+num_pages);
	}


	public static void main(String[] args){
  System.out.println("Chitrashree K\n 1BM23CS081"):
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of books:");
		int n=sc.nextInt();
		System.out.println();
		Book[] books=new Book[n];
		sc.nextLine();
		for(int i=0;i<n;++i){
			System.out.println("Enter book name:");
			String bname=sc.nextLine();
			System.out.println("Enter author name:");
			String author=sc.nextLine();
			System.out.println("Enter book price:");
			double price=sc.nextDouble();
			System.out.println("Enter the no of pages in the book:");
			int num_pages=sc.nextInt();
			sc.nextLine();
			books[i]=new Book(bname, author, price, num_pages);
		}
		System.out.println("Entered Book Details are:\n");
		for(int i=0;i<n;i++){
			System.out.println(books[i].toString()); 
		}
		sc.close();
	}
}
