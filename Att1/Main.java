public class Main {
    public static void main(String[] args) {
        Circulo a = new Circulo(0, 0, 7);
        Circulo b = new Circulo(1, 1, 0);
        Circulo c = new Circulo(3, 3, 25);
        ListaDeFiguras x = new ListaDeFiguras(3);
        x.inserir(a);
        x.inserir(b);
        x.inserir(c);
        x.exibir();
        x.bubblesort();
        x.exibir();
    }
}
