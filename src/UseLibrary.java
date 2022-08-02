
public class UseLibrary {
	public static void main(String[]args) {
	Book book = new Book();
	book.title = "manimegalai";
	book.author = "kovalan";
	book.price = 800;
	
	Library library = new Library();
	library.type = "history";
	library.location = "chennai";
	library.book = book;
	
	System.out.println(library.book.title+", "+library.book.author+", "+library.book.price);
	System.out.println(library.type+", "+library.location);
	}
	

}
