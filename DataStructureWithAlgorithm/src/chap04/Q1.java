package chap04;

import java.util.Scanner;

public class Q1 {

    private static IntStack stack = new IntStack(64);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q1 q1 = new Q1();

        while (true) {
            q1.printInf();    

            int menu = sc.nextInt();
            if (menu == 0) break;
            
            int x;
            switch(menu) {
                case 1:
                    System.out.print("push data ");
                    x = sc.nextInt();
                    try {
                        stack.push(x);
                    } 
                    catch (IntStack.OverflowIntStackException e) {
                        System.out.println("stack is full");
                    }
                    break;
                case 2:
                    try {
                        x = stack.pop();
                        System.out.println("pop data is " + x);
                    } 
                    catch (IntStack.EmptyIntStackException e) {
                        System.out.println("stack is empty");
                    }
                    break;
                case 3:
                    try {
                        x = stack.peek();
                        System.out.println("peek data is : " + x);
                    } 
                    catch (IntStack.EmptyIntStackException e) {
                        System.out.println("stack is empty");
                    }
                    break;
                case 4:
                    stack.dump();
                    break;
                case 5:
                    try {
                        System.out.print("Search data: ");
                        x = sc.nextInt();
                        int res = stack.indexOf(x);
                        if (res == -1) {
                            System.out.println("there are no data " + x);
                        }
                        else {
                            System.out.println("data " + x + " in index " + res);
                        }
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("stack is empty");
                    }
                    break; 
                case 6:
                    stack.clear();
                    System.out.println("stack is clear");
                    break;
                case 7:
                    System.out.println("stack size is " + stack.size());
                    break;
                case 8 :
                    System.out.println("stack capacity is " + stack.capacity());
                    break;
                case 9 : 
                    System.out.println("stack is " + (stack.isEmpty() ? "empty" : "not empty"));
                    break;
                case 10 :
                    System.out.println("stack is " + (stack.isFull() ? "full" : "not full"));
                    break;
                default : 
                    System.out.println("잘못된 입력입니다.\t다시 입력해세요.");
                    continue;
            }
        }
        sc.close();
    }

    private void printInf() {
        StringBuffer sb = new StringBuffer();
        sb.append("현재 데이터 수 : ")
            .append(stack.size())
            .append(" / ")
            .append(stack.capacity())
            .append("\n")
            .append("(1)Push").append(" ")
            .append("(2)Pop").append(" ")
            .append("(3)Peek").append(" ")
            .append("(4)Print").append(" ")
            .append("(5)Search").append(" ")
            .append("(6)clear").append(" ")
            .append("(7)Check Size").append(" ")
            .append("(8)Check Capacity").append(" ")
            .append("(9)Stack is Empty?").append(" ")
            .append("(10)Stack is full?").append(" ")
            .append("(0)Exit");
        System.out.println(sb.toString());
    }
}
