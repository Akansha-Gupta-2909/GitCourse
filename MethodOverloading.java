
public class MethodOverloading {

	
	public int Area(int length, int breadth) {
		  int area = length* breadth;
		  return area;	
	}
	
	public int Area(int length, int breadth, int heigth) {
		  int area = length* breadth*heigth;
		  return area;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mv = new MethodOverloading();
		 int areaofrect = mv.Area(8,8); 
		  System.out.println("Area of Rect :"+ areaofrect);
		 
		  int areaofcuboid = mv.Area(8,2,2);
		  System.out.println("Area of Cuboid :"+ areaofcuboid);
		      
	}

}
