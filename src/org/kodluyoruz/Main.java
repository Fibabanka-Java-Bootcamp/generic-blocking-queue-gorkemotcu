package org.kodluyoruz;

public class Main {

    public static void main(String[] args) {
        BlockingQueue<Integer> queue= new BlockingQueue<>();
        queue.add(5);
        queue.add(8);
        queue.add(11);
        queue.add(13);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        }
    }

