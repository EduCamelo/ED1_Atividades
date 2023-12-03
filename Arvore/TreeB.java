public class TreeB<T extends Comparable<T>> {
    private TreeB<T> right;
    private TreeB<T> left;
    private T info;

    public TreeB(T value) {
        this.info = value;
    }

    public TreeB<T> getRight() {
        return right;
    }

    public void setRight(TreeB<T> right) {
        this.right = right;
    }

    public TreeB<T> getLeft() {
        return left;
    }

    public void setLeft(TreeB<T> left) {
        this.left = left;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public void insertNode(T value) {
        if (value.compareTo(this.info) == 0) {
            System.out.println("Valor repetido");
        } else {
            if (this.info.compareTo(value) > 0) {
                if (this.left == null) {
                    this.setLeft(new TreeB<T>(value));
                } else {
                    this.getLeft().insertNode(value);
                }
            } else {
                if (this.right == null) {
                    this.setRight(new TreeB<T>(value));
                } else {
                    this.getRight().insertNode(value);
                }
            }
        }

    }

    public T findNode(T x) {
        if (this.info.compareTo(x) == 0) {
            return this.getInfo();
        } else if (this.getInfo().compareTo(x) > 0) {
            if (this.getLeft() == null) {
                return null;
            } else {
                return this.left.findNode(x);
            }
        } else {
            if (this.getRight() == null) {
                return null;
            } else {
                return this.right.findNode(x);
            }
        }
    }
}
