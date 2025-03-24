package org.example;

//명령어) article write
//제목: ~~~
//내용: ~~~
//        1번 글이 생성되었습니다
//명령어) article write
//제목: @@@
//        내용: @@@
//2번 글이 생성되었습니다
//명령어) article list
//번호  /  제목  / 내용
//  2   /   @@@ /  @@@
//  1   /   ~~~ /  ~~~
//명령어) article detail 3
//        3번 게시글은 없습니다
//명령어) article detail 1
//번호 : 1
//날짜 : 2024-12-12 12:12:12(작성 날짜 및 시각이 나와야 함)
//제목 : ~~~
//내용 : ~~~
//명령어) article delete 3
//        3번 게시글은 없습니다
//명령어) article delete 1
//        1번 게시글이 삭제되었습니다
//명령어) article modify 3
//        3번 게시글은 없습니다
//명령어) article modify 2
//기존 제목 : @@@
//        기존 내용 : @@@
//        제목 : ### (사용자의 입력)
//내용 : ###
//        2번 게시글이 수정되었습니다.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        new App(sc).run();

        sc.close();
    }
}