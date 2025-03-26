package org.example;



import java.util.Scanner;

public class App {

    public void run() {

        Scanner sc = new Scanner(System.in);

        System.out.println("==프로그램 시작==");

        MemberController memberController = new MemberController(sc);
        ArticleController articleController = new ArticleController(sc);


        articleController.MakeTestData();
        memberController.makeTestData();

        Controller controller = null;

        while (true) {
            System.out.print("명령어) ");
            String cmd = sc.nextLine().trim();

            if (cmd.length() == 0) {
                System.out.println("명령어를 입력하세요");
                continue;
            }
            if (cmd.equals("exit")) {
                System.out.println("종료");
                break;
            }

            String[] cmdBits = cmd.split(" ");

            String controllerName = cmdBits[0];

            String actionMethodName = cmdBits[1];


//
//            if (cmd.equals("member join")) {
//                memberController.doJoin();
//
//            } else if (cmd.equals("article write")) {
//                articleController.write();
//
//            } else if (cmd.startsWith("article list")) {
//                articleController.list(cmd);// app에서만 쓰인 변수 넣어서 메서드에 이용하기
//
//            } else if (cmd.startsWith("article detail")) {
//                articleController.detail(cmd);
//
//            } else if (cmd.startsWith("article delete")) {
//                articleController.delete(cmd);
//
//            } else if (cmd.startsWith("article modify")) {
//                articleController.modify(cmd);
//            } else {
//                System.out.println("사용할 수 없는 명령어입니다");
//            }


            System.out.println("==프로그램 끝==");
        }
        sc.close();
    }
}