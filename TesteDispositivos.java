package listaoop6questao1;

public class TesteDispositivos {
    public static void main(String[] args) {
        DispositivoEletronico tv = new Televisao("Smart TV Samsung");
        DispositivoEletronico radio = new Radio("Rádio JBL");
        DispositivoEletronico notebook = new Notebook("Notebook Dell");

        tv.ligar();
        tv.exibirStatus();
        tv.resetar();
        tv.desligar();

        System.out.println("anter git add ");

        radio.ligar();
        radio.exibirStatus();

        System.out.println();

        notebook.exibirStatus();
        notebook.ligar();
        notebook.resetar();
    }
}

