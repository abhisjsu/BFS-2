class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {

        int parentX = -1;
        int parentY = -1;
        int levelX = -1;
        int levelY = -1;

        Queue < TreeNode > queue = new LinkedList < > ();
        queue.add(root);
        int level = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                int currentVal = current.val;

                if (current.left != null) {
                    queue.add(current.left);
                    if (current.left.val == x) {
                        parentX = currentVal;
                        levelX = level + 1;
                    } else if (current.left.val == y) {
                        parentY = currentVal;
                        levelY = level + 1;
                    }
                }

                if (current.right != null) {
                    queue.add(current.right);
                    if (current.right.val == x) {
                        parentX = currentVal;
                        levelX = level + 1;
                    } else if (current.right.val == y) {
                        parentY = currentVal;
                        levelY = level + 1;
                    }
                }
            }
            level++;
        
        }

        return (levelX == levelY) && (parentX != parentY);

    }
}
