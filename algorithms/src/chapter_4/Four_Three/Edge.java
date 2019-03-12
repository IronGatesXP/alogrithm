package chapter_4.Four_Three;

/**
 * 该数据结构提供了either()和other()两个方法。在一个已知顶点v时，用例可以使用other(v)来得到边的另一个顶点。当两个顶点都是未知的时候，用例可以使用惯用代码v=e.either(),
 * w=e.other(v)；来访问一个Edge对象的e的两个顶点。
 */
public class Edge implements Comparable<Edge> {
    private final int v;
    private final int w;
    private final double weight;

    public Edge(int v, int w, int weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }
    public double weight() {
        return weight;
    }
    public int either() {
        return v;
    }
    public int other(int vertex) {
        if (vertex == v) {
            return w;
        } else if (vertex == w) {
            return v;
        } else {
            throw new RuntimeException("Inconsistent edge");
        }
    }
    public int compareTo(Edge that) {
        if (this.weight() < that.weight()) {
            return -1;
        } else if (this.weight > that.weight()) {
            return 1;
        } else {
            return 0;
        }
    }
}
