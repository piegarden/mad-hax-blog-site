package Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long publicationDate;
    private String title;
    private String body;

    // Empty constructor for convenience
    public Article() { }

    // Constructor for new articles - no ID field because it wont have an ID until
    // submitted to the database.
    public Article(long publicationDate, String title, String body) {
        this.publicationDate = publicationDate;
        this.title = title;
        this.body = body;
    }

    public long getId() {
        return id;
    }

    public long getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(long publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
