package starPatternExercises;

public  class StarPatternExercises {
	
	//Square Star Pattern
	public void printSquareStar(int rows) {
		
		for(int i=0;i<rows;i++) {
			for(int x=0;x<rows;x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
 
	//Hollow Square Star Pattern
	public void printHollowSquare(int rows) {
		
		for(int i=0;i<rows;i++) {
			for(int x=0;x<rows;x++) {
				if(i==0 ||i==rows-1) {
					System.out.print("*");
				}
				else if(x==0 || x==rows-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	//Hollow Square Star Pattern with Diagonal 
	public void printHollowSquareStarDiagonal(int rows) {
		
		for(int i=0; i<rows;i++)
		{
			for(int x=0; x<rows;x++) {
				if(i==0 ||i==rows-1||x==0||x==rows-1 || i==x ||x==((rows-1)-i)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	//Rhombus Star Pattern
	public void printRhombusStar(int rows) {
		
		for(int i=1;i<=rows;i++) {
			for(int x=i;x<rows;x++) {
				System.out.print(" ");
			}
			for(int j=1;j<=rows;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//Hollow Rhombus Star Pattern
	public void printHallowRhombusStar(int rows) {
		
		for(int i=0;i<rows;i++) {
			for(int x=i;x<rows-1;x++) {
				System.out.print(" ");
			}
			for(int j=0; j<rows;j++) {
				if(i==0 ||i==rows-1 || j==0 ||j==rows-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	//Mirrored Rhombus Star Pattern
	public void printMirroredRhombusStar(int rows) {
		
		for(int i=1;i<=rows;i++) {
			for(int x=1;x<i;x++) {
				System.out.print(" ");
			}
			for(int j=1;j<=rows;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//Hollow Mirrored Rhombus Star Pattern
	public void printHallowMirroredRhombusStar(int rows) {
		
		for(int i=0;i<rows;i++) {
			for(int x=0;x<i;x++) {
				System.out.print(" ");
			}
			for(int j=0; j<rows;j++) {
				if(i==0 ||i==rows-1 || j==0 ||j==rows-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	//Right Triangle Star Pattern
	public void printRightTriangleStar(int rows) {
		
		for(int i=0;i<rows;i++) {
			for(int x=0;x<=i;x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//Hollow Right Triangle Star Pattern
	public void printHollowRightTringleStar(int rows) {
		for(int i=0;i<rows;i++) {
			for(int x=0;x<=i;x++) {
				if(i==0 ||i==rows-1 || x==0 ||x==i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	//Mirrored Right Triangle Star Pattern
	public void printMirroredRightTriangleStar(int rows) {
		for(int i=0;i<rows;i++) {
			for(int x=i;x<rows-1;x++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	//Hollow Mirrored Right Triangle Star Pattern
	public void printHollowMirroredRightTriangleStar(int rows) {
		for(int i=0;i<rows;i++) {
			for(int x=i;x<rows-1;x++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				if(i==0||i==rows-1||j==0||j==i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
	
	
	
	//
	
	
	
	
	//Inverted Right Triangle Star Pattern
	public void printInvertedRightTriangleStar(int rows) {
		for(int i=0;i<rows;i++) {
			for(int x=i;x<rows;x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//Hollow Inverted Right Triangle Star Pattern
	public void printHollowInvertedRightTringleStar(int rows) {
		for(int i=0;i<rows;i++) {
			for(int x=i;x<rows;x++) {
				if(i==0||i==rows-1||x==i ||x==rows-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	
	//Inverted Mirrored Right Triangle Star Pattern
	public void printInvertedMirroredRightTringleStar(int rows)
	{
		for(int i=0;i<rows;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int x=i;x<rows;x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//Hollow Inverted Mirrored Right Triangle Star Pattern
	public void printHollowInvertedMirroredRightTriangle(int rows) {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int x=i;x<rows;x++) {
				if(i==0|| i==rows-1 ||  x==i || x==rows-1) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
	
	//Pyramid Star Pattern
	public void printPyramidStar(int rows) {
		
		
		for(int i=0;i<rows;i++) {
			for(int x=i;x<rows-1;x++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			for(int x=0;x<i;x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//Hollow Pyramid Star Pattern
	public void printHollowPyramidStar(int rows) {
		for(int i=0;i<rows;i++)
		{
			for(int x=i; x<rows-1;x++) {
				System.out.print(" ");
			}
			for(int x=0;x<=2*i;x++) {
				if(i==rows-1||x==0||(x==2*i)){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	//Inverted Pyramid Star Pattern
	public void printInvertedPyramidStar(int rows) {
		for(int i=rows-1;i>=0;i--) {
			for(int x=i;x<rows-1;x++) {
				System.out.print(" ");
			}
			for(int x=0;x<=(2*i);x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//Hollow Inverted Pyramid Star Pattern
	public void printHollowInvertedPyramidStar(int rows) {
		for(int i=rows-1;i>=0;i--) {
			for(int x=i;x<rows-1;x++) {
				System.out.print(" ");
			}
			for(int x=0;x<=(2*i);x++) {
				if(x==0||i==rows-1||(x==2*i)) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	//Half Diamond Star Pattern
	public void printHalfDiamondStar(int rows) {
		for(int i=0;i<rows;i++) {
			for(int x=0;x<=i;x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=rows-1;i>0;i--) {
			for(int x=0;x<=i-1;x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	//Mirrored Half Diamond Star Pattern
	public void printMirroredHalfDiamondStar(int rows) {
		for(int i=0;i<rows;i++) {
			for(int x=i;x<rows-1;x++) {
				System.out.print(" ");
			}
			for(int x=0;x<=i;x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=rows-1;i>0;i--) {
			for(int x=i;x<rows;x++) {
				System.out.print(" ");
			}
			for(int x=0;x<=i-1;x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
