import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 46453895j on 05/10/16.
 */
public class ParteB {
    //Escriu una classe anomenada que rebi com a arguments, la comanda i les opcions de la comand que es vulgui executar

    public static void main(String[] args) {
        try{
            String comando,resultado;
            ArrayList<String> lista = new ArrayList<>();
            Scanner input =new Scanner (System.in);
            comando=input.nextLine();
            Process proceso=Runtime.getRuntime().exec(comando);
            BufferedReader bf=new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            System.out.println(bf.readLine().toString());

            while ((resultado=bf.readLine())!=null){
                lista.add(resultado);
            }
            for (String contenido : lista) {
                System.out.println(contenido);
            }
            bf.close();

        }catch (Exception e){
            System.out.print(e);
        }
    }


}
