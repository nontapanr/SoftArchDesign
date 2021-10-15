package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONObject bookObject;
    private JSONArray bookList;

    public JSONBookMetadataFormatter(){
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        bookObject = new JSONObject();
        bookList = new JSONArray();

        bookObject.put(Book.class.getSimpleName() + "s", bookList);

        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.
        JSONObject bookElements = new JSONObject();
        JSONArray authorsList = new JSONArray();

        for (String author: b.getAuthors()){
            authorsList.add(author);
        }

        bookElements.put(Book.Metadata.ISBN.value, b.getISBN());
        bookElements.put(Book.Metadata.AUTHORS.value, authorsList);
        bookElements.put(Book.Metadata.TITLE.value, b.getTitle());
        bookElements.put(Book.Metadata.PUBLISHER.value, b.getPublisher());

        bookList.add(bookElements);

        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.
        return bookObject.toJSONString();
    }
}
