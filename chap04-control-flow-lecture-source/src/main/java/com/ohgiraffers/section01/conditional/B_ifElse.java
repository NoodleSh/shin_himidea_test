package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {
    /*
    * [if-else문 표현식]
    * if(조건식){
    *      조건식이 true일 때 실행할 명령문
    * }else{
    *      조건식이 false일 때 실행할 명령문
    * }
    * */
    
    public void simpleIfElseStatement(){
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();
        
        if(num % 2 == 0){
            System.out.println("짝수입니다");
        }else{
            System.out.println("홀수입니다");
        }
        System.out.println("프로그램 종료");
    }

    public void nestedIfElseStatement(){
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();
        
        if(num!=0){
            if(num>0){
                System.out.println("양수");
            }else{
                System.out.println("음수");
            }
            }else{
            System.out.println("0");
        }
        System.out.println("프로그램 종료");
    }
}
