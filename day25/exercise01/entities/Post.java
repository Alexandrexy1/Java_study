package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;
    private ArrayList<Comment> comments = new ArrayList<>();
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Post(LocalDateTime moment, String title, String content, int likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDateTime getMoment() {
        return this.moment;
    }

    public String title() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public int getLikes() {
        return this.likes;
    }


    public List<Comment> getComments() {
        return this.comments;
    }

    public void removeComment(Comment comment) {
        this.comments.remove(comment);
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(dtf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");
        for (Comment comment: comments) {
            sb.append(comment + "\n");
        }
        return sb.toString();
    }
}
