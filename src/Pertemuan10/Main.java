package Pertemuan10;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	ArrayList<Book> books = new ArrayList<>();
	Connect con = Connect.getConnection();
	ResultSet rs = con.executeQuery("select * from books");
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		try {
			while (rs.next()) {
				String bookId = rs.getString("book_id");
				String bookName = rs.getString("book_name");
				int bookPrice = rs.getInt("book_price");
				String bookCategory = rs.getString("book_category");

				Book book = new Book(bookId, bookName, bookPrice, bookCategory);
				books.add(book);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		for (Book b : books) {
			System.out.println(b.getBookId());
			System.out.println(b.getBookName());
			System.out.println(b.getBookPrice());
			System.out.println(b.getBookCategory());
			System.out.println();
		}

//		insert();
//		update();
		delete();
	}

	public void insert() {
		System.out.println("Id : ");
		String id = scan.nextLine();
		
		System.out.println("name : ");
		String name = scan.nextLine();
		
		System.out.println("price : ");
		int price = scan.nextInt();
		scan.nextLine();
		
		System.out.println("cat : ");
		String cat = scan.nextLine();
		
		String query = String.format("insert into books value ('%s', '%s', '%d', '%s')", id, name, price, cat);
		con.executeUpdate(query);
	}
	
	public void update() {
//		String query = String.format("insert into books value ('%s', '%s', '%d', '%s')", id, name, price, cat);
		String query = "update books set book_name = 'Game of Thrones' where book_id = 'BO005'";
		con.executeUpdate(query);
	}
	
	public void delete() {
		String query = "delete from books where book_id = 'BO00'";
		con.prepareStatement(query);
	}
}
