public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle (double base , double height){
        this.base = base;
        this.height = height;
    }
    @Override  
    public double area() {
        double result = (base * height) / 2;  
        return result ;  
    }
    
}