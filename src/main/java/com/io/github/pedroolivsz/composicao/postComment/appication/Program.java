package com.io.github.pedroolivsz.composicao.postComment.appication;

import com.io.github.pedroolivsz.composicao.postComment.entities.Comment;
import com.io.github.pedroolivsz.composicao.postComment.entities.Post;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment comment01 = new Comment("Have a nice trip!");
        Comment comment02 = new Comment("Wow that's awesome!");

        Post post01 = new Post(
                simpleDateFormat.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12
        );

        post01.addComment(comment01);
        post01.addComment(comment02);

        Comment comment03 = new Comment("Good night");
        Comment comment04 = new Comment("May the Force be wich you");

        Post post02 = new Post(
                simpleDateFormat.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5
        );

        post02.addComment(comment03);
        post02.addComment(comment04);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(post01 + "\n---\n");
        stringBuilder.append(post02 + "\n---\n");

        JOptionPane.showMessageDialog(null, stringBuilder.toString(), "Posts", JOptionPane.PLAIN_MESSAGE);
    }
}
