package entities;

public class student {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notafinal(){
        return nota1 + nota2 + nota3;
    }

    public double missing(){
        return 60.0-notafinal();
    }
}
