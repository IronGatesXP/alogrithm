package chapter_4.Four_Two;

/**
 * 强连通分量：如果两个顶点v和w是互相可达的，则称它们为强连通的
 * 计算强联通分量的Kosaraju算法 P380
 */
public class KosarajuSCC {
    private boolean[] marked;
    private int[] id;          // 强连通分量的标识符
    private int count;         // 强连通分量的数量

    public KosarajuSCC(Digraph G) {
        marked = new boolean[G.V()];
        id = new int[G.V()];
        DepthFirstOrder order = new DepthFirstOrder(G.reverse());
        for (int s : order.reversePost()) {
            if (!marked[s]) {
                dfs(G, s);
                count++;
            }
        }
    }
    private void dfs(Digraph G, int v) {
        marked[v] = true;
        id[v] = count;
        for (int w : G.adj(v)) {
            if (!marked[v]) {
                dfs(G, w);
            }
        }
    }
    public boolean stronglyConnected(int v, int w) {
        return id[v] == id[w];
    }
    public int id(int v) {
        return id[v];
    }
    public int count() {
        return count;
    }
}
