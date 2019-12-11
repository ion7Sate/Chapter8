package EnhancingDate;

public class DataTest {
    public static void main(String[] args) {
        Data data = new Data(5,10,2020);
        for (int i = 0; i < 365; i++){
            data.nextDay();
            System.out.println(data);
        }
    }
}
