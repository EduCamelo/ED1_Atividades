import java.util.Stack;

public class SearchTree {
    private TreeB<Produto> raiz;

    public boolean isEmpty() {
        return raiz == null;
    }

    public void add(Produto x) {
        if (this.isEmpty()) {
            raiz = new TreeB<Produto>(x);
        } else {
            raiz.insertNode(x);
        }
    }

    public void emOrdem(){
        if (this.raiz == null) {
            System.out.println("Vazia!");
        }else{
            this.percorrerEmOrdemRecursivo(raiz);
        }

    }
    private void percorrerEmOrdemRecursivo(TreeB<Produto> r){
        if (r != null) {
            percorrerEmOrdemRecursivo(r.getLeft());
            System.out.println(r.getInfo());
            percorrerEmOrdemRecursivo(r.getRight());
        }
    }

    public Produto find(String value) {
        Produto x = new Produto(value);
        if (this.isEmpty() == true) {
            return null;
        } else {
            return raiz.findNode(x);
        }
    }

    public void alteraPreco(String cod, double preco) {
        Produto aux = this.find(cod);
        if (aux != null) {
            aux.setPreco(preco);
            System.out.println("Produto atualizado com sucesso!");
        } else {
            System.out.println("Produto não encontrado ou nã cadastrado");
        }
    }

    public void alteraQtd(String cod, int qtd) {
        Produto aux = this.find(cod);
        if (aux != null) {
            aux.setQtd(qtd);
            System.out.println("Produto atualizado com sucesso!");
        } else {
            System.out.println("Produto não encontrado ou nã cadastrado");
        }
    }

    public void exibirProd(String cod) {
        Produto aux = this.find(cod);
        if (aux != null) {
            aux.toString();
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    public Produto buscaSemRecursivo(String cod) {
        if (this.isEmpty()) {
            return null;
        } else {
            Produto x = new Produto(cod);
            TreeB<Produto> aux = raiz;
            do {
                if (aux.getInfo().compareTo(x) == 0) {
                    return aux.getInfo();
                } else if (aux.getInfo().compareTo(x) > 0) {
                    aux = aux.getLeft();
                } else {
                    aux = aux.getRight();
                }
            } while (true);
        }
    }

    public void inserirSemRecursivo(Produto outro) {
        if (this.isEmpty()) {
            raiz = new TreeB<Produto>(outro);
        } else {
            TreeB<Produto> aux = raiz;
            do {
                if (aux.getInfo().compareTo(outro) == 0) {
                    System.out.println("Valor repetido");
                } else {
                    if (aux.getInfo().compareTo(outro) > 0) {
                        if (aux.getLeft() == null) {
                            aux.setLeft(new TreeB<Produto>(outro));
                            break;
                        } else {
                            aux = aux.getLeft();
                        }
                    } else {
                        if (aux.getRight() == null) {
                            aux.setRight(new TreeB<Produto>(outro));
                            break;
                        } else {
                            aux = aux.getRight();
                        }
                    }
                }
            } while (true);
        }
    }

    public TreeB<Produto> menor() {
        if (this.isEmpty()) {
            return null;
        } else {
            if (raiz.getLeft() == null) {
                return raiz;
            } else {
                TreeB<Produto> aux = raiz;
                do {
                    aux = aux.getLeft();
                } while (aux.getLeft() != null);
                return aux;
            }
        }
    }

    public TreeB<Produto> maior() {
        if (this.isEmpty()) {
            return null;
        } else {
            if (raiz.getRight() == null) {
                return raiz;
            } else {
                TreeB<Produto> aux = raiz;
                do {
                    aux = aux.getRight();
                } while (aux.getRight() != null);
                return aux;
            }
        }
    }

    public void emOrdemRecursivo(){
        if(this.isEmpty()){
            System.out.println("Lista vazia");
        }else{
            TreeB<Produto> aux;
            Queue<Produto> fila = new Queue<Produto>();
        }
    }


    public void preOrdemNaoRecursivo(){
        Stack<TreeB<Produto>> pilha = new Stack<TreeB<Produto>>();
        TreeB<Produto> aux = this.raiz;
        if(this.isEmpty() == true){
            System.out.println("Árvore vazia");
        }else{
            while(pilha.empty() == false || aux != null){
                while(aux!= null){
                    System.out.println(aux.getInfo().toString());
                    pilha.push(aux);
                    aux = aux.getLeft();
                }
                aux = pilha.pop();
                aux = aux.getLeft();
            }
        }
    }

    public void OrdemNaoRecursivo(){
        Stack<TreeB<Produto>> pilha = new Stack<TreeB<Produto>>();
        TreeB<Produto> aux = this.raiz;
        if(this.isEmpty() == true){
            System.out.println("Árvore vazia");
        }else{
            while(!pilha.empty()|| aux != null){
                while(aux!= null){
                    pilha.push(aux);
                    aux = aux.getLeft();
                }
                aux = pilha.pop();
                System.out.println(aux.getInfo().toString());
                aux = aux.getRight();
            }
        }
    }

}