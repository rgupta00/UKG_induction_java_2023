package com.day3.session1.ex7.inner_classes;

//Harsh
class LinkList{
    private  class Node{
        int data;Node next;
        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
    private Node head, tail;

    public  void addNode(int data){
                //Node object have no existance without this --> LinkedList
        Node temp=this.new Node(data);
        if(head==null){
            head=temp;
            tail=temp;
        }else{
            tail.next=temp;
            tail=temp;
        }
    }
    public void display(){
        Node currNode=head;
        if(currNode==null){
            System.out.println("nothing to show");
            return;
        }
        while (currNode!=null){
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
    }
}


//Rajeev
public class DemoSLL {
    public static void main(String[] args) {
        LinkList ll=new LinkList();

        ll.addNode(2);
        ll.addNode(3);

        ll.display();
    }
}
