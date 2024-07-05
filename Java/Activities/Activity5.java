package activity;

abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle() {
		return title;
	}
}
class Mybook extends Book{
	public void setTitle(String s) {
		title = s;
	}
}
public class Activity5 {
	public static void main(String []args) {
		String title;
		title = "Harry Potter";
		Book newNovel = new Mybook();
		newNovel.setTitle(title);
		System.out.println("Title of the book is: " + newNovel.getTitle());
		
	}

}
