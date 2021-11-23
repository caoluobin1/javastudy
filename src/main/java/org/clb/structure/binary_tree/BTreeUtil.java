package org.clb.structure.binary_tree;

import org.clb.pojo.list.BTreeNode;

import java.util.LinkedList;
import java.util.Queue;


/**
 * @Description
 * @Classname BTreeUtil
 * @Date 2021/8/5 9:22
 * @Author clb
 */
public class BTreeUtil {
    public static BTreeNode getBTreeNodeA_G(){
        BTreeNode a=new BTreeNode("a");
        BTreeNode b=new BTreeNode("b");
        BTreeNode c=new BTreeNode("c");
        BTreeNode d=new BTreeNode("d");
        BTreeNode e=new BTreeNode("e");
        BTreeNode f=new BTreeNode("f");
        BTreeNode g=new BTreeNode("g");
        a.setLeft(b);a.setRight(c);
        b.setLeft(d);b.setRight(e);
        c.setLeft(f);c.setRight(g);
        return a;
    }

    public static BTreeNode getBTreeNode1_10() {
        BTreeNode a = new BTreeNode("5");
        BTreeNode b = new BTreeNode("3");
        BTreeNode c = new BTreeNode("7");
        BTreeNode d = new BTreeNode("1");
        BTreeNode e = new BTreeNode("4");
        BTreeNode f = new BTreeNode("6");
        BTreeNode g = new BTreeNode("9");
        a.setLeft(b);
        a.setRight(c);
        b.setLeft(d);
        b.setRight(e);
        c.setLeft(f);
        c.setRight(g);
        return a;
    }
    public static BTreeNode getNotCompleteBTreeNode(){
        BTreeNode a=new BTreeNode("a");
        BTreeNode b=new BTreeNode("b");
        BTreeNode c=new BTreeNode("c");
        BTreeNode d=new BTreeNode("d");
        BTreeNode e=new BTreeNode("e");
        BTreeNode f=new BTreeNode("f");
        BTreeNode g=new BTreeNode("g");
        a.setLeft(b);a.setRight(c);
        b.setLeft(d);
        c.setLeft(f);c.setRight(g);
        return a;
    }

    public static BTreeNode generateBTree() {
        BTreeNode a = new BTreeNode("1");
        int count = (int) Math.random() * 2 + 1;
        Queue<BTreeNode> queue = new LinkedList<>();
        queue.add(a);
        for (int i = 0; i < count; i++) {
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                BTreeNode now = queue.poll();
                for (int k = 0; k < 2; k++) {
                    int flag = (int) Math.random() * 2 + 1;
                    if (k == 0 && flag == 1) {
                        BTreeNode left = new BTreeNode((int) Math.random() * 10000 + "");
                        now.left = left;
                        queue.add(left);
                    }
                    if (k == 1 && flag == 1) {
                        BTreeNode right = new BTreeNode((int) Math.random() * 10000 + "");
                        now.right = right;
                        queue.add(right);
                    }
                }
            }
        }
        return a;
    }
}
