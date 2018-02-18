import com.bai.java.learn.Boss;
import com.bai.java.learn.Employee;
import com.bai.java.learn.Worker;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        for (int i = 0; i < 10; i++) {
            Worker worker = new Employee("Employee[" + i + "]");
            boss.addWorker(worker);

        }

        boss.sendTask("Fuck your partner");
    }
}
