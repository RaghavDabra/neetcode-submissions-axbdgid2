class Solution {
    public boolean isValidBST(TreeNode root) {
        // Start the traversal with the absolute minimum and maximum possible boundaries
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode node, long min, long max) {
        // An empty tree/leaf child is valid
        if (node == null) {
            return true;
        }

        // The current node's value must fit strictly within the min and max boundaries
        if (node.val <= min || node.val >= max) {
            return false;
        }

        // Recurse left: update the maximum limit to the current node's value
        // Recurse right: update the minimum limit to the current node's value
        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }
}