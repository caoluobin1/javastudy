package org.clb.structure.list;

import org.clb.pojo.list.Node;

/**
 * 将链表反转
 */
public class ReverseList {
    public Node reverseMyList(Node node){

        return node;
    }
    public static Node create(){
        Node now=new Node();
        Node first=now;
        first.name=0+"";
        for (int i = 0; i < 9; i++) {
            Node next=new Node();
            now.next=next;
            now.next.name=i+"";
            now=next;
        }
        return first;
    }
    public static void iterate(Node node){
        while (true){
            System.out.println(node.name);
            if (node.next==null)break;
            node=node.next;
        }
    }
    public static void main(String[] args) {
        iterate(create());
    }
}
