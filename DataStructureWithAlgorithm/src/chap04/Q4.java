package chap04;

import java.util.Scanner;

public class Q4 {

    private static IntAryQueue que = new IntAryQueue(60);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            printInf();

            int chosenNum = sc.nextInt();

            if (chosenNum == 0) break;
            
            int x;
            switch(chosenNum) {
                case 1:
                    System.out.print("enqueue data ");
                    x = sc.nextInt();
                    try {
                        que.enque(x);
                    } 
                    catch (IntAryQueue.overflowQueueException e) {
                        System.out.println("que is full");
                    }
                    break;
                case 2:
                    try {
                        x = que.deque();
                        System.out.println("dequeue data is " + x);
                    } 
                    catch (IntAryQueue.EmptyQueueException e) {
                        System.out.println("que is empty");
                    }
                    break;
                case 3:
                    try {
                        x = que.peek();
                        System.out.println("peek data is : " + x);
                    } 
                    catch (IntAryQueue.EmptyQueueException e) {
                        System.out.println("que is empty");
                    }
                    break;
                case 4:
                    que.dump();
                    break;
                case 5:
                    try {
                        System.out.print("Search data: ");
                        x = sc.nextInt();
                        int res = que.indexOf(x);
                        if (res == -1) {
                            System.out.println("there are no data " + x);
                        }
                        else {
                            System.out.println("data " + x + " in index " + res);
                        }
                    } catch (IntAryQueue.EmptyQueueException e) {
                        System.out.println("que is empty");
                    }
                    break; 
                case 6:
                    que.clear();
                    System.out.println("que is clear");
                    break;
                case 7:
                    System.out.println("que size is " + que.size());
                    break;
                case 8 :
                    System.out.println("que capacity is " + que.capacity());
                    break;
                case 9 : 
                    System.out.println("que is " + (que.isEmpty() ? "empty" : "not empty"));
                    break;
                case 10 :
                    System.out.println("que is " + (que.isFull() ? "full" : "not full"));
                    break;
                default : 
                    System.out.println("잘못된 입력입니다.\t다시 입력해세요.");
                    continue;
            }
        }
        sc.close();
    }

    private static void printInf() {
        StringBuffer sb = new StringBuffer();
        sb.append("현재 데이터 수 : ")
            .append(que.size())
            .append(" / ")
            .append(que.capacity())
            .append("\n")
            .append("(1)Enqueue").append(" ")
            .append("(2)Dequeue").append(" ")
            .append("(3)Peek").append(" ")
            .append("(4)Print").append(" ")
            .append("(5)Search").append(" ")
            .append("(6)clear").append(" ")
            .append("(7)Check Size").append(" ")
            .append("(8)Check Capacity").append(" ")
            .append("(9)que is Empty?").append(" ")
            .append("(10)que is full?").append(" ")
            .append("(0)Exit");
        System.out.println(sb.toString());
    }
}
