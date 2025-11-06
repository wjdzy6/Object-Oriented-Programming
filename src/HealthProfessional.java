public class HealthProfessional {
    private int id;
    private String name;
    private String department;

    // 默认构造函数
    public HealthProfessional() {
        this(0, "Unknown", "General");
    }

    // 参数化构造函数
    public HealthProfessional(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // 业务方法
    public void printDetails() {
        System.out.println("ID: " + id + "\n姓名: " + name + "\n科室: " + department);
    }

    // Getter/Setter（带校验）
    public int getId() { return id; }
    public void setId(int id) {
        if (id <= 0) throw new IllegalArgumentException("ID无效");
        this.id = id;
    }
    // 其他getter/setter...

    // 入口点
    public static void main(String[] args) {
        HealthProfessional doctor = new HealthProfessional(101, "李四", "神经科");
        doctor.printDetails();
        // 使用args参数
        if (args.length > 0) System.out.println("附加参数: " + args[0]);
    }
}