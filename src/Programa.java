public class Programa {
    public static void main(String[] args) {
        Rica rica = new Rica();
        Pobre pobre = new Pobre();
        Miseravel miseravel = new Miseravel();

        rica.setNome("Eduardo");
        rica.setIdade(32);

        pobre.setNome("Marco");
        pobre.setIdade(29);

        miseravel.setNome("Victoria");
        miseravel.setIdade(58);

        rica.caminha();
        pobre.caminha();
        miseravel.caminha();

        rica.fazCompras();
        pobre.trabalha();
        miseravel.mendiga();


    }
}
