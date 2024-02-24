package org.example;

import org.example.FormDate;
import org.example.Post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 444444444";
        post.phone = "+7(777)-777-77-77";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.subscription = true;


        post.birthday = new FormDate();
        post.birthday.year = 1993;
        post.birthday.day = 10;
        post.birthday.month = 12;
    }

}