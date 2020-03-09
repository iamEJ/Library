import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.eisgroup.javaexam.library.Book;
import com.eisgroup.javaexam.library.Library;

public class MyLibrary implements Library{
	
	private Set<Book> books = new HashSet<>();

	@Override
	public Collection<Book> findByAuthor(String author) {
		List<Book> bo = new ArrayList<>();
		for(Book b: books) {
			if(b.getAuthor().equals(author)) {
				
				bo.add(b);				
			}

		}
		return bo;
	}

	@Override
	public Book findByTitle(String title) {
				
		for(Book b : books) {
			if(b.getTitle().equals(title)) {
				return b;
			}
		}
		return null;
	}

	@Override
	public Collection<Book> getBooksSortedByPageCount() {
		
		return books.stream()
			    .sorted(Comparator.comparingInt(Book::getPageCount))
			    .collect(Collectors.toList());
	}

	@Override
	public int getNumberOfBooks() {

		return books.size();
	}

	@Override
	public void takeABook(Book b) {
		
			books.add(b);
				
	}

}
