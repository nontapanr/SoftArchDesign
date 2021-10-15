package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    public void export(PrintStream stream) throws IOException, ParserConfigurationException {

        // Please implement this method. You may create additional methods as you see fit.
        BookMetadataFormatter formatter = createBookFormat();

        for(Book book : books){
            formatter.append(book);
        }

        stream.println(formatter.getMetadataString());
    }
    public abstract BookMetadataFormatter createBookFormat() throws IOException, ParserConfigurationException;
}
