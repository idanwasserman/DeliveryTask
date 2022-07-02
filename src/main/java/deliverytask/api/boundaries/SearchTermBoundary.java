package deliverytask.api.boundaries;

public class SearchTermBoundary {
    String searchTerm;

    public SearchTermBoundary() {}

    public String getSearchTerm() {
        return searchTerm;
    }

    public SearchTermBoundary setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
        return this;
    }

    @Override
    public String toString() {
        return "SearchTermBoundary{" +
                "searchTerm='" + searchTerm + '\'' +
                '}';
    }
}
