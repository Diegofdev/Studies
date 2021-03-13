package br.ucsal.processamentoAssincronoEParalelo;

public class ThreadExemplo {
    public static void main(String[] args) {

        GeradorPDF iniciarGeradorPdf = new GeradorPDF();

        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGeradorPdf);

        iniciarGeradorPdf.start();
        iniciarBarraDeCarregamento.start();

//        BarraDeCarregamento2 barraDeCarregamento2 = new BarraDeCarregamento2();
//
//        BarraDeCarregamento2 barraDeCarregamento22 = new BarraDeCarregamento2();
//
//        barraDeCarregamento2.start();
//        barraDeCarregamento22.start();


    }

}

class GeradorPDF extends Thread {
    @Override
    public void run(){
        try {
            System.out.println("Iniciar");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Gerar PDF");
    }
}

class BarraDeCarregamento extends Thread {
    private Thread iniciarGeradorPdf;

    public BarraDeCarregamento(Thread iniciarGeradorPdf) {
        this.iniciarGeradorPdf = iniciarGeradorPdf;
    }

    @Override
    public void run() {


            while (true){
                try {
                    Thread.sleep(500);

                    if (iniciarGeradorPdf.isAlive()) {
                        break;
                    }
                    System.out.println("Loading...");

                } catch (InterruptedException e){
                    e.printStackTrace();
                }

            }

    }
}

class BarraDeCarregamento2 extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("rodei " + this.getName());

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
