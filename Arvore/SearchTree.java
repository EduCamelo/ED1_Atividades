import java.util.Stack;

public class SearchTree {
    private TreeB<Produto> raiz;

 /*
    ### Indicie das paradas ###
    inserir recursivo: linha 30 e olhar classe TreeB
    inserir não recursivo: 115
    inserir repetidos e não recursivo:162  (obs: para a esquerda)
    Passeio em ordem: 38
    Passeio em ordem não recursivo: 144
    Passeio pré-Ordem:55
    Passeio pré-Ordem não recursivo:144
    Passeio pós-Ordem:71
    Passeio pós-Ordem não recursivo:80
    Passeio Por Nível: 238
    Busca:87 e olhar classe TreeB
    Busca não recursiva:96
    Busca de repetidos: FAZER
    Remover: 209
    Remover repetidos: FAZER
  */


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

    public void emOrdem() {// recursivo
        if (this.raiz == null) {
            System.out.println("Vazia!");
        } else {
            this.percorrerEmOrdemRecursivo(raiz);
        }

    }

    private void percorrerEmOrdemRecursivo(TreeB<Produto> r) {
        if (r != null) {
            percorrerEmOrdemRecursivo(r.getLeft());
            System.out.println(r.getInfo());
            percorrerEmOrdemRecursivo(r.getRight());
        }
    }

    public void PreOrdem() {// recursivo
        if (this.isEmpty()) {
            System.out.println("Arvore vazia");
        } else {
            this.percorrerPreEmOrdemRecursivo(raiz);
        }
    }

    private void percorrerPreEmOrdemRecursivo(TreeB<Produto> r) {
        if (r != null) {
            System.out.println(r.getInfo());
            percorrerEmOrdemRecursivo(r.getLeft());
            percorrerPreEmOrdemRecursivo(r.getRight());
        }
    }


    public void posOrdem(){// recursivo
        if(this.isEmpty()){
            System.out.println("Arvore vazia");
        }else{
            this.percorrerEmPosOrdem(raiz);
        }
    }

    private void percorrerEmPosOrdem(TreeB<Produto> r){
        if(r!= null){
            percorrerEmPosOrdem(r.getLeft());
            percorrerEmPosOrdem(r.getRight());
            System.out.println(r.getInfo());
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

    public void preOrdemNaoRecursivo() {
        Stack<TreeB<Produto>> pilha = new Stack<TreeB<Produto>>();
        TreeB<Produto> aux = this.raiz;
        if (this.isEmpty() == true) {
            System.out.println("Árvore vazia");
        } else {
            while (!pilha.empty() || aux != null) {
                while (aux != null) {
                    System.out.println(aux.getInfo().toString());
                    pilha.push(aux);
                    aux = aux.getLeft();
                }
                aux = pilha.pop();
                aux = aux.getRight();
            }
        }
    }

    public void inserirSemRecursivoRepetido(Produto outro) { // para a esquerda
        if (this.isEmpty()) {
            raiz = new TreeB<Produto>(outro);
        } else {
            TreeB<Produto> aux = raiz;
            do {
                if (aux.getInfo().compareTo(outro) == 0) {
                    if (aux.getLeft() == null) {
                        aux.setLeft(new TreeB<Produto>(outro));
                        break;
                    } else {
                        TreeB<Produto> aux1 = aux.getLeft();
                        aux.setLeft(new TreeB<Produto>(outro));
                        aux = aux.getLeft();
                        aux.setLeft(aux1);
                        break;
                    }
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

    public void remover(Produto value){
        if(this.isEmpty()){
            System.out.println("Arvore vazia");
        }else{
            raiz = this.removerNode(raiz,value);
        }
    }


    private TreeB<Produto> removerNode(TreeB<Produto> r, Produto value){
      if(r != null){
        if(r.getInfo().compareTo(value) == 0){
            if(r.getLeft() == null && r.getRight() == null){
                r = null;
            }else{
                if(r.getLeft() == null){
                    r = r.getRight();
                }else if(r.getRight() == null){
                    r = r.getLeft();
                }else{
                    TreeB<Produto> aux1=r, aux2=aux1.getLeft();
                    while (aux2.getRight() != null) {
                        aux1 = aux2;
                        aux2 = aux2.getRight();
                    }
                    aux1.setRight(r.getLeft());
                    r.setInfo(aux2.getInfo());
                }
            }
        }else if(r.getInfo().compareTo(value)<0){
            r.setLeft(removerNode(r.getLeft(), value));
        }else{
            r.setRight(removerNode(r.getRight(), value));
        }
      }
      return r;
    }

    public void porNivel(){
        Queue<TreeB<Produto>> fila =  new Queue<>();
        TreeB<Produto> aux = raiz;

        if (this.isEmpty()) {
            System.out.println("Arvore Vazia");
        }else{
            fila.enqueue(aux);
            while (!fila.empty()) {
                aux = fila.dequeue();
                if (aux.getLeft() != null) {
                    fila.enqueue(aux.getLeft());
                }
                if (aux.getRight() != null) {
                    fila.enqueue(aux.getRight());
                }
                System.out.println(aux.getInfo());
            }
        }
    }

}