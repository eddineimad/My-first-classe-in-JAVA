public class Main {
    public static void main (String[] args) {
        Employee emp1 = new Employee() ;
        emp1.number = 1 ;
        emp1.name = "imad" ;
        emp1.sales = 500 ;
        emp1.bonushrs = 50 ;
        emp1.basesalary = 50000 ;

        emp1.alculateNetSalary();
    }
}