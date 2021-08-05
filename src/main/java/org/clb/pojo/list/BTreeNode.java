package org.clb.pojo.list;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @Description
 * @Classname BTreeNode
 * @Date 2021/8/5 9:13
 * @Author clb
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor()
public class BTreeNode {
    @NonNull
    public String value;
    public Node left;
    public Node right;

}
