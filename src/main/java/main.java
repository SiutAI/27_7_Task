public class main {
    static Student student1 = new Student("Шаров Иван Петрович","ГУ", 2, 4);
    static Student student2 = new Student("Тян Леонид Иванович", "ГУ", 3, 3);
    static Student student3 = new Student("Шарова Наталья Петровна", "МУ", 5, 5);
    static University university1 = new University("ГУ", "Главный Университет", "Гуга", 1953, StudyProfile.MATH);
    static University university2 = new University("МУ", "Местный Университет", "Муга", 1923, StudyProfile.MEDICINE);

    public static void main(String[] args) {
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(university1);
        System.out.println(university2);
    }


}
