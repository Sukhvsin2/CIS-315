class Rectangle{
    double width;
	double height;
	Rectangle(){
	    width = 2.0;
	    height = 1.0;
	}
	Rectangle(double width, double height){
	    this.width = width;
	    this.height = height;
	}
	void setWidth(double width){
	    this.width = width;
	}
	void setHeight(double height){
	    this.height = height;
	}
	double getHeight(){
	    return height;
	}
	double getWidth(){
	    return width;
	}
	double getArea(){
	    return height*width;
	}
	double getPerimeter(){
	    return 2*(height+width);
	}
};