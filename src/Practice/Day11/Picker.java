package Practice.Day11;

public class Picker implements Worker {
    private int salary;
    private Warehouse warehouse;

    public Picker (Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        this.salary = salary + 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
        if (warehouse.getCountOrder() % 1500 == 0) {
            bonus();
            System.out.println("—борщик был премирован");
        }
    }

    @Override
    public void bonus() {
        this.salary = 3 * salary;
    }
}
