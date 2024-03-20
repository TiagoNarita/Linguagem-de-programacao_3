package Exception;

public class teste {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setPaginas(30);
        try {
            livro.lerPagina(50); // Lendo uma página válida
            livro.lerPagina(0);  // Tentativa de ler uma página inválida
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
