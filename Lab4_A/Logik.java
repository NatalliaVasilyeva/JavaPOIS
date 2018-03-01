/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Natallia Vasilyeva, group 1709v1, 27.02.2018
 * logical methods
 */
public class Logik {

  
    public static boolean check(double a, double b, double c) {
        boolean answer;
        
        answer = a!=b&&b!=c&&a!=c;
        
        return answer;
    }
    
    public static boolean checkSameNumber(double a, double b, double c) {
        boolean answer;
        
        answer = a==b||b==c||a==c;
        
        return answer;
    }
    
     public static boolean checkPositiveNumber(double a, double b, double c) {
        boolean answer;
        
        answer = a>0&&b>0&&c>0;
        
        return answer;
    }
    
     public static boolean checkIfPositiveNumber(double a, double b, double c) {
        boolean answer;
        
        answer = a>0||b>0||c>0;
        
        return answer;
    }
     
      public static boolean checkIfOnePositiveNumber(double a, double b, double c) {
        boolean answer;
        
        answer = (a>0&&b<0&&c<0)||(a<0&&b>0&&c<0)||(a<0&&b<0&&c>0);
        
        return answer;
    }
      
      public static boolean checkIfMoreThenOnePositiveNumber(double a, double b, double c) {
        boolean answer;
        
        answer = (a>0&&b>0&&c<0)||(a<0&&b>0&&c>0)||(a>0&&b<0&&c>0);
        
        return answer;
    }
      
       public static boolean checkIsEven(int a, int b, int c) {
        boolean answer;
        
        answer = (a%2==0)&&(b%2==0)&&(c%2==0);
        
        return answer;
    }
       
         public static boolean checkIsEvenOneOrSeveral(int a, int b, int c) {
        boolean answer;
        
        answer = (a%2==0)||(b%2==0)||(c%2==0);
        
        return answer;
    }
         
        public static boolean checkIsEvenOne(int a, int b, int c) {
        boolean answer;
        
        answer = ((a%2==0)&&(b%2!=0)&&(c%2!=0))||((a%2!=0)&&(b%2==0)&&(c%2!=0))||((a%2!=0)&&(b%2!=0)&&(c%2==0));
        
        return answer;
    }
        
         
        
        public static boolean checkIsEvenOrOddAll(int a, int b, int c) {
        boolean answer;
        
        answer = ((a%2==0)&&(b%2==0)&&(c%2==0))||((a%2!=0)&&(b%2!=0)&&(c%2!=0));
        
        return answer;
    }

        public static boolean checkIsEvenMostly(int a, int b, int c) {
        boolean answer;
        
        answer = ((a%2==0)&&(b%2==0)&&(c%2!=0))||((a%2==0)&&(b%2!=0)&&(c%2==0))||((a%2!=0)&&(b%2==0)&&(c%2==0)) ;
        
        return answer;
    }
        public static boolean checkIsRiseNumberInBigNumber(int a) {
        boolean answer;
        
        int z = a%10;
        int x = (a/10)%10;
        int c = (a/100)%10;
        int v = a/1000;
        
        
        answer = z>x&&x>c&&c>v;
        
        return answer;
    }
        
        public static boolean checkIsSameReadingInBothSide(int a) {
        boolean answer;
        
        int z = a%10;
        int x = (a/10)%10;
        int c = (a/100)%10;
        int v = a/1000;
        
        
        answer = z==v&&c==x;
        
        return answer;
    }
        
        public static boolean checkIsPointInFirstQuarter(double a, double b) {
        boolean answer;
        
               
        answer = a>0&&b>0;
        
        return answer; 
        }
        
      public static boolean checkIsSideOfTriangle(double a, double b, double c) {
        boolean answer;
        
               
        answer = a+b>c&&a+c>b&&b+c>a;
        
        return answer; 
        }  
      
      public static boolean checkTriangleIsSameSide(double a, double b, double c) {
        boolean answer;
        
               
        answer = a==b&&b==c&&a==c;
        
        return answer; 
        } 
        
       public static boolean checkTriangleIsTwoSameSide(double a, double b, double c) {
        boolean answer;
        
               
        answer = a==b||b==c||a==c;
        
        return answer; 
        } 
       
         public static boolean checkTriangleIs90Deg(double a, double b, double c) {
        boolean answer;
        
               
        answer = (a*a+b*b==c*c)||(a*a+c*c==b*b)||(c*c+b*b==c*c);
        
        return answer; 
        }
         
        public static boolean checkTriangleIs90DegAndTwoSameSide(double a, double b, double c) {
        boolean answer;
        
               
        answer = ((a*a+b*b==c*c)||(a*a+c*c==b*b)||(c*c+b*b==c*c))&&(a==b||b==c||a==c);
        
        return answer; 
        }
        
        public static boolean checkPointInArea(double a, double b, double c, double d, double e, double f) {
        boolean answer;
        
               
        answer = (a>c&&a<e)&&(b>d&&b<f);
        
        return answer; 
        }
        
}




