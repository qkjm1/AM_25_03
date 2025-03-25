package org.example;


import jdk.dynalink.beans.StaticClass;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//class Main {
//    static List<Article>save=new ArrayList<>();
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("==실행==");
////        List<Article>save=new ArrayList<>(); // 조합을 저장
//        List<String>load=new ArrayList<>();
//
//
//        int lastid = 0;
//
//        makeTestData();
//
//        while (true) {//exit가 아닐때 반복
//            System.out.print("명령어) ");
//            String cmd = sc.nextLine().trim();
//
//
//            if (cmd.length() == 0) {continue;}
//
//            if (cmd.equals("exit")) {break;}
//
//            if (cmd.equals("article write")) {
//                System.out.println("게시글을 작성합니다");
//                int id = lastid + 1; // 게시글 작성 순서번호
//                //입력
////                LocalDateTime now = LocalDateTime.now();
////                String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
//                String newdata = Util.getNowStr();
//                System.out.print("제목: ");
//                String title = sc.nextLine().trim();
//                System.out.print("내용: ");
//                String body = sc.nextLine().trim();
//                //저장     저장할 조합(생성자)가 필요
//                Article articles = new Article(id, newdata, title, body); // 생성자
//                save.add(articles);// 조합을 저장
//
//
//                System.out.printf("%d번 게시글이 생성되었습니다.\n", id);
//                lastid = id;
//            }
//
//            else if (cmd.equals("article list")){
//                System.out.println("=======================================");
//                if(save.size()==-0){
//                    System.out.println("게시글 없음");
//                }else {
//                    System.out.println("    번호    /     제목     /      내용     ");
//                    for (int i = save.size() - 1; i >= 0; i--) {
//                        Article article = save.get(i);     //  이 시기에 인스턴스 변수 발생
//                        System.out.printf("      %d    /      %s     /     %s     \n",article.getId(),article.getTitle(),article.getBody()); // Atrucle private 변수넣기
//                    }
//                }
//            }
//
//            else if (cmd.startsWith("article detail")){
//                System.out.println("====상세보기====");
//                int ii = Integer.parseInt(cmd.split(" ")[2]);
//                Article findar = null;
//                foundIndex(ii);
//
//                // 공백 기준으로 자르면 2번 인덱스가 정수가 옴
////                Article findar = null;
////                for (Article article : save) {
////                    if (article.getId() == ii){
////                        findar = article;
////                        break;}
////                }
//                if (findar == null) {
//                    System.out.println("게시글 없음");
//                    continue;
//                }
//
//                System.out.println("번호 : " + findar.getId());
//                System.out.println("제목 : " + findar.getTitle());
//                System.out.println("내용 : " + findar.getBody());
//                System.out.println("시간 : "+ findar.getDate());
//            }
//
//            else if (cmd.startsWith("article delete")){
//                System.out.println("====삭제===");
//                int ii = Integer.parseInt(cmd.split(" ")[2]);
//                Article findar = null;
//                for (Article article : save) {
//                    if (article.getId() == ii){
//                        findar = article;
//                        break;}
//                }
//                if (findar == null) {
//                    System.out.println("게시글 없음");
//                    continue;
//                }
//                save.remove(findar);
//                System.out.println(ii+"번 게시글을 삭제");
//            }
//            else if (cmd.startsWith("article modify")){
//                System.out.println("====수정===");
//                int ii = Integer.parseInt(cmd.split(" ")[2]);
//                Article findar = null;
//                for (Article article : save) {
//                    if (article.getId() == ii){
//                        findar = article;
//                        break;}
//                }
//                System.out.println("기존제목: "+findar.getTitle());
//                System.out.println("기존내용: "+findar.getBody());
//                System.out.print("new 제목: ");
//                String newtitle = sc.nextLine().trim();
//                System.out.print("new 내용: ");
//                String newbody = sc.nextLine().trim();
//
//                findar.setTitle(newtitle);
//                findar.setBody(newbody);
//
//                System.out.println(ii+"번 게시글 수정");
//            }else {
//                System.out.println("사용불가");
//
//            }
//        }
//        System.out.println("==프로그램 종료==");
//        sc.close();
//    }
//
//    private static int foundIndex(int id) {
//            int founfindex = -1;
//            for (int i =0; i<save.size(); i++) {
//                save.get(i);
//                if (save.getId() == id) {
//                    founfindex = id;
//                    break;
//                }
//
//            }
//            return founfindex;
//        }
//    }
//
//    //// 테스트데이터함수
//    private static void makeTestData() {
//        System.out.println("==테스트 데이터 생성==");
//        Main.save.add(new Article(1, "2024-12-12 12:12:12",  "제목1", "내용1"));
//        Main.save.add(new Article(2, Util.getNowStr(), "제목2", "내용2"));
//        Main.save.add(new Article(3, Util.getNowStr() ,"제목3", "내용3"));
//    }
//}
//
//class Article{
//    private int id;
//    private String title;
//    private String date;
//    private String body;
//    Article(int id, String date, String title, String body) {
//        this.id = id;
//        this.title = title;
//        this.body = body;
//        this.date = date;
//    }
//    public int getId() {
//        return id;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getBody() {
//        return body;
//    }
//
//    public void setBody(String body) {
//        this.body = body;
//    }
//}
public class Main {

    static List<Article> articles = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==프로그램 시작==");

        int lastArticleId = 3;

        makeTestData();

        while (true) {
            System.out.print("명령어) ");
            String cmd = sc.nextLine().trim();

            if (cmd.length() == 0) {
                System.out.println("명령어를 입력하세요");
                continue;
            }
            if (cmd.equals("exit")) {
                break;
            }

            if (cmd.equals("article write")) {
                System.out.println("==게시글 작성==");
                int id = lastArticleId + 1;
                String regDate = Util.getNowStr();
                String updateDate = Util.getNowStr();
                System.out.print("제목 : ");
                String title = sc.nextLine().trim();
                System.out.print("내용 : ");
                String body = sc.nextLine().trim();

                Article article = new Article(id, regDate, updateDate, title, body);
                articles.add(article);

                System.out.println(id + "번 글이 작성되었습니다");
                lastArticleId++;
            } else if (cmd.equals("article list")) {
                System.out.println("==게시글 목록==");
                if (articles.size() == 0) {
                    System.out.println("아무것도 없어");
                } else {
                    System.out.println("   번호    /     날짜       /   제목     /    내용   ");
                    for (int i = articles.size() - 1; i >= 0; i--) {
                        Article article = articles.get(i);
                        if (Util.getNowStr().split(" ")[0].equals(article.getRegDate().split(" ")[0])) {
                            System.out.printf("  %d   /    %s        /    %s     /    %s   \n", article.getId(), article.getRegDate().split(" ")[1], article.getTitle(), article.getBody());
                        } else {
                            System.out.printf("  %d   /    %s        /    %s     /    %s   \n", article.getId(), article.getRegDate().split(" ")[0], article.getTitle(), article.getBody());
                        }

                    }
                }
            } else if (cmd.startsWith("article detail")) {
                System.out.println("==게시글 상세보기==");

                int id = Integer.parseInt(cmd.split(" ")[2]);

                Article foundArticle = null;

                for (Article article : articles) {
                    if (article.getId() == id) {
                        foundArticle = article;
                        break;
                    }
                }

                if (foundArticle == null) {
                    System.out.println("해당 게시글은 없습니다");
                    continue;
                }
                System.out.println("번호 : " + foundArticle.getId());
                System.out.println("작성날짜 : " + foundArticle.getRegDate());
                System.out.println("수정날짜 : " + foundArticle.getUpdateDate());
                System.out.println("제목 : " + foundArticle.getTitle());
                System.out.println("내용 : " + foundArticle.getBody());

            } else if (cmd.startsWith("article delete")) {
                System.out.println("==게시글 삭제==");

                int id = Integer.parseInt(cmd.split(" ")[2]);

                Article foundArticle = null;

                for (Article article : articles) {
                    if (article.getId() == id) {
                        foundArticle = article;
                        break;
                    }
                }

                if (foundArticle == null) {
                    System.out.println("해당 게시글은 없습니다");
                    continue;
                }
                articles.remove(foundArticle);
                System.out.println(id + "번 게시글이 삭제되었습니다");
            } else if (cmd.startsWith("article modify")) {
                System.out.println("==게시글 수정==");

                int id = Integer.parseInt(cmd.split(" ")[2]);

                Article foundArticle = null;

                for (Article article : articles) {
                    if (article.getId() == id) {
                        foundArticle = article;
                        break;
                    }
                }

                if (foundArticle == null) {
                    System.out.println("해당 게시글은 없습니다");
                    continue;
                }
                System.out.println("기존 제목 : " + foundArticle.getTitle());
                System.out.println("기존 내용 : " + foundArticle.getBody());
                System.out.print("새 제목 : ");
                String newTitle = sc.nextLine().trim();
                System.out.print("새 내용 : ");
                String newBody = sc.nextLine().trim();

                foundArticle.setTitle(newTitle);
                foundArticle.setBody(newBody);

                foundArticle.setUpdateDate(Util.getNowStr());

                System.out.println(id + "번 게시글이 수정되었습니다");
            } else {
                System.out.println("사용할 수 없는 명령어입니다");
            }

        }

        System.out.println("==프로그램 끝==");
        sc.close();
    }

    /**테스트 데이터 생성 함수**/
    private static void makeTestData() {
        System.out.println("==테스트 데이터 생성==");
        articles.add(new Article(1, "2024-12-12 12:12:12", "2024-12-12 12:12:12", "제목1", "내용1"));
        articles.add(new Article(2, Util.getNowStr(), Util.getNowStr(), "제목2", "내용2"));
        articles.add(new Article(3, Util.getNowStr(), Util.getNowStr(), "제목3", "내용3"));
    }
//    static void asd(){
//        Scanner sc;
//        int id = Integer.parseInt(cmd.split(" ")[2]);
//
//        Article foundArticle = null;
//
//        for (Article article : articles) {
//            if (article.getId() == id) {
//                foundArticle = article;
//                break;
//            }
//        }
//    }
}

class Article {
    private int id;
    private String regDate;
    private String updateDate;
    private String title;
    private String body;

    public Article(int id, String regDate, String updateDate, String title, String body) {
        this.id = id;
        this.regDate = regDate;
        this.updateDate = updateDate;
        this.title = title;
        this.body = body;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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