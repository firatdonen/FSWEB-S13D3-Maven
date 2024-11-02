package org.example;

public class Wall {
    private double width;
    private double height;


    //Constructor

    public Wall(double height, double width){
        this.height= height;
        this.width =width;
    }
    //metodlar

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    //set
    public void setWidth(double width){
       if(width<0){
           this.width=0;
       }else this.width = width;
    }


  public void setHeight(double height){
        if(height<0){
            this.height=0;
        }
        else this.height=height;

            }

  //metod
public double getArea(){
    return width*height;
        }

}
