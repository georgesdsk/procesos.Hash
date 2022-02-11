import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class deStringAHash {
    public static void main(String[] args) {

        /*
        byte[] cadena = obtenerHash( obtenerCadena());
        imprimirHash(cadena);
        */


    }

    private static void imprimirHash(byte[] cadena) {
        StringBuilder stringBuilder = new StringBuilder();

        for (byte hash:
             cadena) {
            stringBuilder.append(String.format("%x",hash));
        }

        System.out.printf("El codigo hash es : %s%n", stringBuilder);
    }


    private static byte[] obtenerHash(byte[] informacion) {
        MessageDigest messageDigest = null;

        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        messageDigest.update(informacion);

        return messageDigest.digest();

    }

    private static byte[] obtenerCadena() {
        Scanner sc = new Scanner(System.in);
        System.out.println("que quiereeee");
        return sc.nextLine().getBytes();
    }

    private String nombreFichero {
        Scanner sc = new Scanner(System.in);
        System.out.println("cual es el nombre del fichero");
        return sc.nextLine();
    }

    private static byte[] leerFichero(String nombreFichero){
        byte[] b = null;
        try {
            b = new FileInputStream(new File(nombreFichero)).readAllBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return b;


    }





}
