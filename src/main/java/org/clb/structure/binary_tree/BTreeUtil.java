package org.clb.structure.binary_tree;

import org.clb.pojo.list.BTreeNode;

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
}
