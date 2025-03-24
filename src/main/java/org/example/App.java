package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private Scanner sc = new Scanner(System.in);
    List<Books> books = new ArrayList<>();
    int counter = 0;


    public App(Scanner sc) {
        this.sc = sc;
    }

    void run() {
        while (true) {
            System.out.print("명령어) ");
            String cmd = sc.nextLine().trim();
            if (cmd.equals("exit")) {
                break;
            } else if (cmd.length() == 0) {
                System.out.println("명령어가 입력되지 않았음");
                continue;
            }

            if(cmd.equals("article write")) {
                add();

            }
        }

    }

    void add() {

        int id = counter+1;
        System.out.print("제목 : ");
        String name = sc.nextLine().trim();
        System.out.print("내용 : ");
        String author = sc.nextLine().trim();

        Books books = new books(id, name, author);

        books.add(books);

        System.out.printf("%d번 글이 생성되었습니다");

    }

}
