package application;

import java.time.LocalDateTime;

import entities.Comment;
import entities.Post;

public class Program {
    public static void main(String[] args) {
        String title = "Traveling to New Zealand";
        int likes = 12;
        LocalDateTime moment = LocalDateTime.now();

        Comment comment1 = new Comment("Have a nice trip");
        Comment comment2 = new Comment("Wow that's awesome!");
        Post post = new Post(moment, title, title, likes);
        post.addComment(comment1);
        post.addComment(comment2);
        System.out.println();
    }
}