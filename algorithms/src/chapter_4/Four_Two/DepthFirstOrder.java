package chapter_4.Four_Two;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 有向图中基于深度优先搜索的顶点排序
 * 前序：在递归调用之前将顶点加入队列
 * 后序：在递归调用之后将顶点加入队列
 * 逆后序：在递归调用之后将顶点压入栈
 */
public class DepthFirstOrder {
    private boolean[] marked;
    private Queue<Integer> pre;         // 保存的是访问顶点的顺序
    private Queue<Integer> post;        // 保存的是邻点都被访问过的顶点的先后顺序，P374
    private Stack<Integer> reversePost;

    public DepthFirstOrder(Digraph G) {
        pre = new LinkedList<>(); // LinkedList实现了Queue接口，可以把LinkedList当做Queue来使用
        post = new LinkedList<>();
        reversePost = new Stack<>();
        marked = new boolean[G.V()];
        for (int v = 0; v < G.V(); v++) {
            if (!marked[v]) {
                dfs(G, v);
            }
        }
    }
    private void dfs(Digraph G, int v) {
        pre.add(v);
        marked[v] = true;
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                dfs(G, w);
            }
        }
        post.add(v);
        reversePost.push(v);
    }
    public Iterable<Integer> pre() {
        return pre;
    }
    public Iterable<Integer> post() {
        return post;
    }
    public Iterable<Integer> reversePost() {
        return reversePost;
    }
}
