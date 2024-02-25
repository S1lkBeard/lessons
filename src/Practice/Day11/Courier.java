package Practice.Day11;

public class Courier implements Worker {
    private int salary;
    private Warehouse warehouse;

    public Courier (Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        this.salary = salary + 100;
        warehouse.setBalance(warehouse.getBalance() + 1);
        if (warehouse.getBalance() % 1000000 == 0) {
            bonus();
            System.out.println("Курьер был премирован");
        }
    }

    @Override
    public void bonus() {
        this.salary = 2 * salary;
    }
}
