package level1.lesson5;

public class HomeWork5 {
    public static void main(String[] args) {
        staff[] staffs = new staff[5];
        staffs[0] = new staff("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 50000, 41);
        staffs[1] = new staff("Petrov Petr", "Creator", "petrov@mailbox.com", "892312314", 45000, 53);
        staffs[2] = new staff("Sidorov Sidr", "Water pot", "sidorov@mailbox.com", "892312315", 15000, 43);
        staffs[3] = new staff("Pupkina Nadegda", "EnvelopeLicker", "pupkina@mailbox.com", "892312316", 50000, 34);
        staffs[4] = new staff("Juk J", "GrinderPencil", "juk@mailbox.com", "892312317", 3000, 31);
        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i].getAge() > 40) {
                System.out.println(staffs[i]);
            }
        }
    }
}
