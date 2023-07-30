package com.soflite.common.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ghai-th
 * @date 2023-04-14 下午 10:00
 */
@Data
public class TreeNode{
    
    String id;
    
    
    String pid;
    
    Boolean hasChildren;
    
    List<TreeNode> children;
    
    public static List<TreeNode> buildTree(List<? extends TreeNode> nodes, String parentId) {
        List<TreeNode> tree = new ArrayList<>();
        for (TreeNode node : nodes) {
            if (node.getPid().equals(parentId)) {
                node.setChildren(buildTree(nodes, node.getId()));
                tree.add(node);
            }
        }
        return tree;
    }
    
    
    
}
