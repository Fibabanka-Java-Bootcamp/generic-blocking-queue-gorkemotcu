package org.kodluyoruz;

    public class BlockingQueue<T> implements Queue<T> {
        private Node<T> head;
        private Node<T> tail;


        @Override
        public void add(T val) {
            Node<T> node = new Node<>(val);
            if(head==null) {
                head=node;
                tail=node;
            }
            else{
                tail.setNext(node);
                tail=node;
            }
        }

        @Override
        public T peek() {
        if(head!=null)
            head.getVal();
        else
            return null;
        return head.getVal();
        }

        @Override
        public T poll() {
        T val = null;
        if(head!=null){
            Node<T> node = head;
            head=head.getNext();
            val=node.getVal();
        }
            return val;
        }
    }
