import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class reg_num_checker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите регистрационный номер машины: ");
        String num = scan.nextLine().replace(" ","").toUpperCase();
        String reg_pattern = "[АВЕКМНОРСТУХABEKMHOPCTYX]{1}[0-9]{3}[АВЕКМНОРСТУХABEKMHOPCTYX]{2}[A-Z]{1,3}[0-9]{2,3}";
        Pattern pattern = Pattern.compile(reg_pattern);
        Matcher matcher = pattern.matcher(num);
        if (matcher.find()){
            String reg_serial = num.substring(0,1) + num.substring(4,6);
            String reg_num = num.substring(1,4);
            String region = num.substring(6);
            System.out.println("Серия: " + reg_serial);
            System.out.println("Регистрационный номер: " + reg_num);
            System.out.println("Регион: " + region);
        } else System.out.println("Вы ввели некорректную информацию, перепроверьте введенный номер");
    }
}
