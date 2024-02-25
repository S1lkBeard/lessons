package Practice.Day11;

public class Test {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        System.out.println(warehouse.toString());

        for (int i = 0; i < 1501; i++) {
            picker.doWork();
            courier.doWork();
        }

        System.out.println(warehouse.toString());
        System.out.println("Зарплата сборщика = " + picker.getSalary());
        System.out.println("Зарплата курьера = " + courier.getSalary());

        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);
        picker1.doWork();
        courier1.doWork();

        //Проверка, что значения, связанные с первым складом, не изменились после создания второго склада
        System.out.println(warehouse.toString());
        System.out.println("Зарплата сборщика = " + picker.getSalary());
        System.out.println("Зарплата курьера = " + courier.getSalary());
    }
}
