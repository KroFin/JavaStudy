package print;

public class Humen {
    private int id ;
    private Student student;

    public void Move(Animal animal){
        animal.move();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
