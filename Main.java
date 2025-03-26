/* Made by Miroshnicnehko Daniel
           26/03/2005           */
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String in = sc.nextLine();

        try {
            int answer = calc(in);
            System.out.println(answer);
        }
        catch (Exception e) {
            System.out.println("Ошибка");
        }
    }

    public static int calc(String in) throws Exception {
        String[] split = in.split(" ");
        if (split.length != 3) {
            throw new Exception();
        }
        String aSt = split[0];
        String bSt = split[2];

        int a, b;
        try {
            a = Integer.parseInt(aSt);
            b = Integer.parseInt(bSt);
        }
        catch (Exception e) {
            throw new Exception();
        }
        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new Exception();
        }
        Operation op = Operation.getOperation(split[1]);
        int answer = op.apply(a, b);
        return answer;
    }
}