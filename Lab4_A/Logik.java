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
              
       return  a!=b&&b!=c&&a!=c;
        
    }
    
    public static boolean checkSameNumber(double a, double b, double c) {
                
      return   a==b||b==c||a==c;
        
    }
    
     public static boolean checkPositiveNumber(double a, double b, double c) {
              
       return  a>0&&b>0&&c>0;
        
    }
    
     public static boolean checkIfPositiveNumber(double a, double b, double c) {
               
        return  a>0||b>0||c>0;
    }
     
      public static boolean checkIfOnePositiveNumber(double a, double b, double c) {
               
        return  (a>0&&b<0&&c<0)||(a<0&&b>0&&c<0)||(a<0&&b<0&&c>0);
        
          }
      
      public static boolean checkIfMoreThenOnePositiveNumber(double a, double b, double c) {
              
       return  (a>0&&b>0&&c<0)||(a<0&&b>0&&c>0)||(a>0&&b<0&&c>0);
       
    }
      
       public static boolean checkIsEven(int a, int b, int c) {
             
      return  (a%2==0)&&(b%2==0)&&(c%2==0);
            
    }
       
         public static boolean checkIsEvenOneOrSeveral(int a, int b, int c) {
          
       return  (a%2==0)||(b%2==0)||(c%2==0);
       
    }
         
        public static boolean checkIsEvenOne(int a, int b, int c) {
     
        return ((a%2==0)&&(b%2!=0)&&(c%2!=0))||((a%2!=0)&&(b%2==0)&&(c%2!=0))||((a%2!=0)&&(b%2!=0)&&(c%2==0));
       
        }
        
        public static boolean checkIsEvenOrOddAll(int a, int b, int c) {
               
       return ((a%2==0)&&(b%2==0)&&(c%2==0))||((a%2!=0)&&(b%2!=0)&&(c%2!=0));
    
    }

        public static boolean checkIsEvenMostly(int a, int b, int c) {
      
       return ((a%2==0)&&(b%2==0)&&(c%2!=0))||((a%2==0)&&(b%2!=0)&&(c%2==0))||((a%2!=0)&&(b%2==0)&&(c%2==0)) ;
        
    }
       
        public static boolean checkIsRiseNumberInBigNumber(int a) {
            
        int z = a%10;
        int x = (a/10)%10;
        int c = (a/100)%10;
        int v = a/1000;
                
      return  z>x&&x>c&&c>v;
        
    }
        
        public static boolean checkIsSameReadingInBothSide(int a) {
    
        int z = a%10;
        int x = (a/10)%10;
        int c = (a/100)%10;
        int v = a/1000;
        
        
        return  z==v&&c==x;
        
    }
        
        public static boolean checkIsPointInFirstQuarter(double a, double b) {
                     
        return  a>0&&b>0;
      
        }
        
      public static boolean checkIsSideOfTriangle(double a, double b, double c) {
                     
        return a+b>c&&a+c>b&&b+c>a;
        
        }  
      
      public static boolean checkTriangleIsSameSide(double a, double b, double c) {
       
        return a==b&&b==c&&a==c;
     
        } 
        
       public static boolean checkTriangleIsTwoSameSide(double a, double b, double c) {
                   
        return a==b||b==c||a==c;
      
        } 
       
         public static boolean checkTriangleIs90Deg(double a, double b, double c) {
                     
        return  (a*a+b*b==c*c)||(a*a+c*c==b*b)||(c*c+b*b==c*c);
     
        }
         
        public static boolean checkTriangleIs90DegAndTwoSameSide(double a, double b, double c) {
                 
       return ((a*a+b*b==c*c)||(a*a+c*c==b*b)||(c*c+b*b==c*c))&&(a==b||b==c||a==c);
      
        }
        
        public static boolean checkPointInArea(double a, double b, double c, double d, double e, double f) {
                   
       return   (a>c&&a<e)&&(b>d&&b<f);
              
        }
        
}




