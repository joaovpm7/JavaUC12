package cap5exer02;

public class Cap5Exer02 {

    public static void main(String[] args) {
        String meses[] = {"Janeiro", "Fev", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        System.out.println("Mes sorteado: " + meses[(int) (Math.random() * 12)]);

    }

}
