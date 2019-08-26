package lesson6;

public class Main6 {
    private static final int treeQuantity = 20;
    private static final int minRandom = -20;
    private static final int maxRandom = 20;

    private static int isBalancedQuantity = 0;

    public static void main(String[] args) {
//        testTree();
        testHomeWork();
    }

    public static void testHomeWork(){
        TreeImpl[] trees = new TreeImpl[treeQuantity];

        for(int i = 0; i < trees.length; i++){
            TreeImpl<Integer> tree = new TreeImpl<>();
            initTree(tree);
            trees[i] = tree;

            if(trees[i].isBalanced()){
                isBalancedQuantity ++;
            }
        }

        double percent = (double)isBalancedQuantity / treeQuantity * 100;
        System.out.println("Процент сбалансированных деревьев от общего числа (" + treeQuantity + ") составил: " + percent + "%");
        System.out.println("Всего сбалансированных деревьев: " + isBalancedQuantity);
    }

    private static void initTree(TreeImpl<Integer> tree) {
        while (!tree.isFull()){
            tree.add((int)(Math.random()*((maxRandom-minRandom)+1))+minRandom);
        }
    }

    private static void testTree() {
        TreeImpl<Integer> tree = new TreeImpl<>();
        tree.add(60);
        tree.add(50);
        tree.add(66);
        tree.add(70);
        tree.add(67);
        tree.add(81);
        tree.add(40);
        tree.add(31);
        tree.add(45);
        tree.add(55);
        tree.add(57);

        System.out.println("Root is 60: " + tree.find(60));
        System.out.println("Find 70: " + tree.find(70));
        System.out.println("Find 31: " + tree.find(31));
        System.out.println("Find 555: " + tree.find(555));
        System.out.println("is Balanced: " + tree.isBalanced());
        System.out.println("Depth: " + tree.getDepth());
        System.out.println("is Full: " + tree.isFull());

        tree.traverse(Tree.TraverseMode.IN_ORDER);
        tree.display();
    }
}
