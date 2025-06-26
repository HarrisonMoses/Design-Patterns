package javaCode;
class LinkedLists {
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;

    public LinkedLists() {
        this.head = null;
    }

    public void addFirst(int value) {
        var newNode = new Node(value);

        if (head == null) {
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(int value){
        var newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    void removeFirst(){
        if(head ==null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        head.next = null;
    }

    void removeLast(){
        if(head ==null){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while(current.next.next !=null){
            current = current.next;
        }
        current.next =  null;
    }
    void reverse(){
        if(head ==null){
            throw new RuntimeException("List is empty");
        }
    }
    
}