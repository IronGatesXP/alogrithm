package chapter_4.Four_Two;

/**
 * 拓扑排序：一幅有向无环图的拓扑排序即为所有顶点的逆后序排列
 * 图形的顶点可以表示要执行的任务，并且边可以表示一个任务必须在另一个任务之前执行的约束，拓扑排序是一个有效的任务排序
 *
 */
public class Topological {
    private Iterable<Integer> order;

    public Topological(Digraph G) {
        DirectedCycle cyclefinder = new DirectedCycle(G);
        if (!cyclefinder.hasCycle()) {
            DepthFirstOrder dfs = new DepthFirstOrder(G);
            order = dfs.reversePost();
        }
    }
    public Iterable<Integer> order() {
        return order;
    }
    public boolean isDAG() {
        return order != null;
    }
}
