import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by 46453895j on 05/10/16.
 */
public class ParteA {

    public static void main(String[] args) {
        String comanda="python dado.py";
        System.out.println();
        try{
            Process proceso=Runtime.getRuntime().exec(comanda);
            BufferedReader bf=new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            System.out.println(bf.readLine().toString());
            bf.close();

        }catch (Exception e){
            System.out.print(e);
        }
    }
}
