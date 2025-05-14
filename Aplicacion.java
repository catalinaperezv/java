import clases.Persona;
import clases.CuentaBancaria;

public class Aplicacion {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Carlos Pérez", 30);
        Persona persona2 = new Persona("María López", 25);
        Persona persona3 = new Persona("Juan Gómez", 40);

        CuentaBancaria cuenta1 = new CuentaBancaria(1000, persona1);
        CuentaBancaria cuenta2 = new CuentaBancaria(500, persona2);
        CuentaBancaria cuenta3 = new CuentaBancaria(1500, persona3);

        System.out.println("Operaciones de Cuenta 1:");
        double saldoAnterior = cuenta1.getSaldo();
        cuenta1.depositar(200);
        System.out.println("Saldo anterior: $" + saldoAnterior + " | Después de depositar: $" + cuenta1.getSaldo());

        saldoAnterior = cuenta1.getSaldo();
        cuenta1.retirar(150);
        System.out.println("Saldo anterior: $" + saldoAnterior + " | Después de retirar: $" + cuenta1.getSaldo());
        System.out.println();

        System.out.println("Operaciones de Cuenta 2:");
        saldoAnterior = cuenta2.getSaldo();
        cuenta2.depositar(300);
        System.out.println("Saldo anterior: $" + saldoAnterior + " | Después de depositar: $" + cuenta2.getSaldo());

        saldoAnterior = cuenta2.getSaldo();
        cuenta2.retirar(100);
        System.out.println("Saldo anterior: $" + saldoAnterior + " | Después de retirar: $" + cuenta2.getSaldo());
        System.out.println();

        System.out.println("Operaciones de Cuenta 3:");
        saldoAnterior = cuenta3.getSaldo();
        cuenta3.retirar(500);
        System.out.println("Saldo anterior: $" + saldoAnterior + " | Después de retirar: $" + cuenta3.getSaldo());

        saldoAnterior = cuenta3.getSaldo();
        cuenta3.depositar(250);
        System.out.println("Saldo anterior: $" + saldoAnterior + " | Después de depositar: $" + cuenta3.getSaldo());
        System.out.println();

        System.out.println("Información de todas las cuentas:");
        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }
}
