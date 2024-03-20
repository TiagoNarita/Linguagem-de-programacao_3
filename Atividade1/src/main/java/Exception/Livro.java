package Exception;

public class Livro {
    private int paginas;

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    void lerPagina(int pagina) throws MyException {
        int paginasTotal = paginas;
        if(pagina > paginasTotal || pagina < 0){
            throw new MyException("Página inválida.");
        }
    }
}
