class Rectangle{
  int length, width;

  public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
  }

   
    public int calcArea() {
        return length * width;
    }
  

  public static void main(String args[]){
    Rectangle rect1= new Rectangle(12,5);
    Rectangle rect2= new Rectangle(8,4);

    int area1 = rect1.calcArea();
    int area2 = rect2.calcArea();

    if(area1 > area2){
      System.out.println("Rectangle1 > Rectangle2");
    }
    else if(area1 < area2){
      System.out.println("Rectangle1 < Rectangle2");
    }
    else{
      System.out.println("They are equal");
    }

  }

}