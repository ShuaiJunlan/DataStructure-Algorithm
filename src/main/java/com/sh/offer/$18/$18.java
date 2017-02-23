package com.sh.offer.$18;

import com.sh.datastructure.BinaryTreeNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 11:17 2017/2/17.
 * 树的子结构
 */
public class $18
{
    boolean hasSubtree(BinaryTreeNode pRoot1, BinaryTreeNode pRoot2)
    {
        boolean result = false;
        if (pRoot1 != null && pRoot2 != null)
        {
            if (pRoot1.m_nValue == pRoot2.m_nValue)
                result = doesTree1HasTree2(pRoot1, pRoot2);
            if (!result)
                hasSubtree(pRoot1.m_pLeft, pRoot2);
            if (!result)
                hasSubtree(pRoot1.m_pRight, pRoot2);
        }
        return result;
    }

    boolean doesTree1HasTree2(BinaryTreeNode tree1, BinaryTreeNode tree2)
    {
        if (tree2 == null)
            return true;
        if (tree1 == null)
            return false;
        if (tree1.m_nValue != tree2.m_nValue)
            return false;
        return doesTree1HasTree2(tree1.m_pLeft, tree2.m_pLeft) && doesTree1HasTree2(tree1.m_pRight, tree2.m_pRight);
    }
}
