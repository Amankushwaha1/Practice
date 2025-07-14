package LeetCode;

import DSImplementation.LinkedListNode;
import DSImplementation.LinkedListUtil;

import java.util.Scanner;


public class ReverseLinkedList {

    private static void sop(Object a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        sop("Game Begins");
        Scanner sc = new Scanner(System.in);
        boolean proceed = true;
        while(proceed) {
        sop("Enter mode (int/String/char/double)");
        String mode = sc.nextLine();


        switch (mode.toLowerCase()) {
            case "int": {
                sop("Mode Integer DataType Activated");
                LinkedListNode<Integer> head = null, tail = null;
                sop("Enter Size, then enter linked sequence");
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    LinkedListNode<Integer> temp = new LinkedListNode(sc.nextInt());
                    if (head == null) {
                        head = temp;
                        tail = temp;
                    } else {
                        tail.setNext(temp);
                        tail = temp;
                    }
                }

                LinkedListUtil<Integer> util = new LinkedListUtil<>();
                util.traverseLinkedList(util.reverseLinkedList(head));

                break;
            }
            case "char": {
                sop("Mode Character DataType Activated");
                LinkedListNode<Character> head = null, tail = null;
                sop("Enter Size, then enter linked sequence");
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    LinkedListNode<Character> temp = new LinkedListNode(sc.next());
                    if (head == null) {
                        head = temp;
                        tail = temp;
                    } else {
                        tail.setNext(temp);
                        tail = temp;
                    }
                }

                LinkedListUtil<Character> util = new LinkedListUtil<>();
                util.traverseLinkedList(util.reverseLinkedList(head));

                break;
            }
            case "double": {
                sop("Mode Double DataType Activated");
                LinkedListNode<Double> head = null, tail = null;
                sop("Enter Size, then enter linked sequence");
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    LinkedListNode<Double> temp = new LinkedListNode(sc.nextDouble());
                    if (head == null) {
                        head = temp;
                        tail = temp;
                    } else {
                        tail.setNext(temp);
                        tail = temp;
                    }
                }

                LinkedListUtil<Double> util = new LinkedListUtil<>();
                util.traverseLinkedList(util.reverseLinkedList(head));

                break;
            }
            case "string": {
                sop("Mode String DataType Activated");
                LinkedListNode<String> head = null, tail = null;
                sop("Enter Size, then enter linked sequence");
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    LinkedListNode<String> temp = new LinkedListNode(sc.nextLine());
                    if (head == null) {
                        head = temp;
                        tail = temp;
                    } else {
                        tail.setNext(temp);
                        tail = temp;
                    }
                }

                LinkedListUtil<String> util = new LinkedListUtil<>();
                util.traverseLinkedList(util.reverseLinkedList(head));
                break;
            }
            default: {
                sop("Invalid mode");
                break;
            }
        }
            sop("Press Enter to continue, press 'q' to quit");
            proceed = sc.nextLine().equalsIgnoreCase("q") ? false : true;
        }
        sop("Game Ends");
}
}
