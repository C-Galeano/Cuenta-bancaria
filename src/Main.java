import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //SOLO SE DEPOSITAN NUMEROS POSITIVOS
        //SOLO SE RETIRAN NUMEROS POSITIVOS
        //SE ARREGLA EL TO STRING PARA QUE IMPRIMA DE ESTA FORMA...
        //Titular: cristian, Saldo: 500.0, Número de Cuenta: cri123

        Scanner teclado = new Scanner(System.in);
        int op;
        double monto;
        boolean estado = true;

        List<CuentaBancaria> lstBanco = new ArrayList<>();

        CuentaBancaria cl1 = new CuentaBancaria();

        do{
        System.out.println("""
                1.CREAR CLIENTE
                2.MOSTRAR
                3.MOSTRAR ESPECIFICO
                4.DEPOSITAR
                5.RETIRAR
                """);

        op = teclado.nextInt();
        switch (op) {
            case 1 -> {
                System.out.println("INGRESE NOMBRE DEL TITULAR");
                cl1.setTitular(teclado.next());

                System.out.println("INGRESE SALDO DE LA CUENTA");
                cl1.setSaldo(teclado.nextDouble());

                System.out.println("INGRESE NUMERO DE CUENTA");
                cl1.setNumeroCuenta(teclado.next());

                //cl1 = new CuentaBancaria(cl1.getTitular(), cl1.getSaldo(), cl1.getNumeroCuenta());
                //lstBanco.add(cl1);

                lstBanco.add(new CuentaBancaria(cl1.getTitular(), cl1.getSaldo(), cl1.getNumeroCuenta()));
            }
            case 2 -> {
                for (CuentaBancaria cu: lstBanco) {
                    System.out.println(cu);
                }
            }

            case 3 -> {
                String nCuenta;
                System.out.println("Ingrese numero de cuenta");
                nCuenta = teclado.next();
                for(int i = 0; i <lstBanco.size();i++){
                    if (lstBanco.get(i).getNumeroCuenta().equalsIgnoreCase(nCuenta)){
                        System.out.println(lstBanco.get(i));
                    }
                }
            }
            case 4 -> {
                System.out.println("Depositar");
                String nCuenta;
                System.out.println("Ingrese numero de cuenta a la cual desea depositar");
                nCuenta = teclado.next();

                do {
                    System.out.println("Cuanto dinero desea depositar");
                    monto = teclado.nextDouble();
                    monto = teclado.nextDouble();
                    System.out.println("NO PUEDE DEPOSITAR MENOS DE 1");
                }while (monto<=0);

                cl1.depositarDinero(monto);

                for(int i = 0; i <lstBanco.size();i++){
                    if (lstBanco.get(i).getNumeroCuenta().equalsIgnoreCase(nCuenta)){
                        lstBanco.get(i).depositarDinero(monto);
                        System.out.println(lstBanco.get(i));
                    }

                }

            }
            case 5 ->{
                System.out.println("Retirar");
                String nCuenta;
                System.out.println("Ingrese numero de cuenta a la cual desea retirar");
                nCuenta = teclado.next();
                do {
                    System.out.println("Cuanto dinero desea retirar");
                    monto = teclado.nextDouble();
                    System.out.println("NO PUEDE RETIRAR MENOS DE 1");
                }while (monto<=0);
                cl1.retirarDinero(monto);

                for(int i = 0; i <lstBanco.size();i++){
                    if (lstBanco.get(i).getNumeroCuenta().equalsIgnoreCase(nCuenta)){
                        lstBanco.get(i).retirarDinero(monto);
                        System.out.println(lstBanco.get(i));
                    }

                }
            }
            }

        }while (estado);


    /*do {


        System.out.println("""
                1. DEPOSITAR DINERO
                2. RETIRAR DINERO
                3. MOSTRAR DATOS DE LA CUENTA
                4. MOSTRAR CLIENTES DESDE LA LISTA
                5. SALIR
                """);
        op = teclado.nextInt();

        switch (op) {
            case 1 -> {
                System.out.println("Depositar");
                do {
                    System.out.println("Cuanto dinero desea depositar");
                    monto = teclado.nextDouble();
                }while (monto<=0);
                cl1.depositarDinero(monto);

            }
            case 2 -> {
                System.out.println("Retirar");
                do {
                    System.out.println("Cuanto dinero desea retirar");
                    monto = teclado.nextDouble();
                }while (monto<=0);
                cl1.retirarDinero(monto);

            }
            case 3 -> {
                System.out.println("Mostrar");
                cl1.mostrarInformacion();

            }
            case 4 ->{
                System.out.println("MOSTRAR DATOS DE LA CUENTA DESDE LA LISTA");
                //System.out.println(lstBanco.toString());

                for (CuentaBancaria cu:lstBanco){
                    System.out.println(cu);
                }
            }

            case 5 ->{
                System.out.println("SALIR...");
                estado = false;
            }

            default -> {
                System.out.println("NO EXISTE OPCION");
            }

        }
    }while (estado);

     */


    }
}