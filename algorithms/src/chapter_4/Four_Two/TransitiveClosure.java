package chapter_4.Four_Two;

/**
 * \顶点对的可达性
 */
public class TransitiveClosure {
    private DirectedDFS[] all;   // DirectedDFS 有向图的可达性，表明s到v是否可达

    public TransitiveClosure(Digraph G) {
        all = new DirectedDFS[G.V()];
        for (int v = 0; v < G.V(); v++) {
            all[v] = new DirectedDFS(G, v);
        }
    }
    public boolean reachable(int v, int w) {
        return all[v].marked(w);
    }
}
