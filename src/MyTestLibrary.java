import com.eisgroup.javaexam.library.Library;
import com.eisgroup.javaexam.library.test.BaseLibraryTest;

public class MyTestLibrary extends BaseLibraryTest{

	@Override
	protected Library getLibrary() {
		// TODO Auto-generated method stub
		return new MyLibrary();
	}

}
