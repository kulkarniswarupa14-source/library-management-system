import java.util.*;

public class SearchService {
    private SearchStrategy strategy;

    public void setStrategy(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Book> search(List<Book> books, String keyword) {
        return strategy.search(books, keyword);
    }
}