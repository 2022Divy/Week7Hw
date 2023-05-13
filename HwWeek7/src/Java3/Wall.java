package Java3;

public class Wall {
    double width,height;

    public static void main(String[] args) {
        Wall wall = new Wall(8,9);
        System.out.println("area = " + wall.getArea());
        wall.setHeight(1);
        System.out.println("width= " +wall.getWidth());
        System.out.println("height= " +wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
    public Wall(){
        System.out.println("Good Morning");

    }
    public Wall(double width, double height){
        if(width<0){
            this.width=0;
        }else {
            this.width=width;
        }
        if (height<0){
            this.height=0;
        }else {
            this.height=height;
        }
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double setWidth(double width){
        if (width<0){
            this.width=0;
        }else {
            this.width=width;
        }
        return width;
    }
    public double setHeight(double height){
        if (height<0){
            this.height=0;
        }else {
            this.height=height;
        }
        return height;
    }
    public double getArea(){
        double area = width*height;
        return area;
    }


  }





