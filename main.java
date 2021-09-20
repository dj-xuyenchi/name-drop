import java.util.Scanner;

public class main {
   
   
    public static void main(String[] args) {
        
       nameOut();
    

} 
       

       
        // line3DHead(input, "a");
    

    
    //                                                 wwwwwwwwwwwwwwwwwwwwwww
    //                                 //            wwwwwwwwwwwwwwwwwwwwwwwwwww
    //                                 //          wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
    //                                 //        wwwwwww                     wwwwwww
    //                                 //       wwwwwww                       wwwwwww
    //                                 //      wwwwwww                         wwwwwww
    //                                 //     wwwwwww                           wwwwwww
    //                                 //    wwwwwww              g              wwwwwww
    //                                 //   wwwwwww               n               wwwwwww
    //                                 //   wwwwwww           q u a n g           wwwwwww
    //                                 //   wwwwwww             x u x             wwwwwww
    //                                 //   wwwwwww               q               wwwwwww

    //                                 //   wwwwwwww                             wwwwwwww
    //                                 //   wwwwwwwww                           wwwwwwwww             
    //                                 //   wwwwwwwwww                         wwwwwwwwww
    //                                 //   wwwwwwwwwww                       wwwwwwwwwww
    //                                 //   wwwwwww wwwww                    wwww wwwwwww
    //                                 //   wwwwwww   wwwwwwwwwwwwwwwwwwwwwwwwww  wwwwwww
    //                                 //   wwwwwww    wwwwwwwwwwwwwwwwwwwwwwww   wwwwwww
    //                                 //   wwwwwww     wwwwwwwwwwwwwwwwwwwwww    wwwwwww
    //                                 //   wwwwwww                               wwwwwww
    public static void graphicCenterUnit(String input,String name, String point,String point1,String point2,String point3,String point4){
    
        System.out.print("                          ");
        space(15);taget(23, input);spaceFunstion();
        space(13);taget(27, input);spaceFunstion();
        space(11);taget(31, input);spaceFunstion();
        space(9);taget(7, input);space(21);taget(7,input);spaceFunstion();
        space(8);taget(7, input);space(23);taget(7,input);spaceFunstion();
        space(7);taget(7, input);space(25);taget(7,input);spaceFunstion();
        space(6);taget(7, input);space(27);taget(7,input);spaceFunstion();
//
        space(5);taget(7, input);space(29);taget(7,input);spaceFunstion();
        space(4);taget(7, input);space(31);taget(7,input);spaceFunstion();
        space(4);taget(7, input);space(11);System.out.print(point); space(1);System.out.print(point1);space(1);System.out.print(point2);space(1);System.out.print(point3);space(1);System.out.print(point4);space(11);taget(7,input);spaceFunstion();
        space(4);taget(7, input);space(31);taget(7,input);spaceFunstion();
        space(4);taget(7, input);space(31);taget(7,input);spaceFunstion();
        //
        space(4);taget(8, input);space(18);System.out.print(point4);space(10);taget(8,input);spaceFunstion();
        space(4);taget(9, input);space(15);System.out.print(point3);space(11);taget(9,input);spaceFunstion();
        space(4);taget(10, input);space(12);System.out.print(point2);space(12);taget(10,input);spaceFunstion();
        space(4);taget(11, input);space(9);System.out.print(point1);space(13);  ;taget(11,input);spaceFunstion();
        
        space(4);taget(7, input);space(1);taget(5,input);space(5);System.out.print(point);space(14);taget(4,input);space(1);taget(7,input);spaceFunstion();
        space(4);taget(7,input);space(3);taget(26,input);space(2); taget(7,input);spaceFunstion();
        space(4);taget(7,input);space(4);taget(24,input);space(3); taget(7,input);spaceFunstion();
        space(4);taget(7,input);space(5);taget(22,input);space(4); taget(7,input);spaceFunstion();
        bodyGraphic(input, point, point1, point2, point3, point4, 8);
        
// tao cac funstion su ly cac vi tri tren graphic
}
public static void bodyGraphic(String input,String point,String point1,String point2,String point3,String point4,int setFloor){
    space(4);taget(7, input);space(11);
    space(4);taget(7, input);space(11);System.out.print(point); space(1);System.out.print(point1);space(1);System.out.print(point2);space(1);System.out.print(point3);space(1);System.out.print(point4);space(11);taget(7,input);spaceFunstion();












    
}


    //        5   5   5
    //          4 4 4
    //        1 2 3 4 5
    //          2 2 2
    //        1   1   1

    public static void nameOut(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap input");
        String input = scanner.nextLine();
       String name = "";
       int j =1;
       
       for (int i =0; i< j ; i++){

       System.out.println("Nhap name");
       name = scanner.nextLine();
       if(name.length()>=2 && name.length()<=5){
           break;
           
    }else{
        System.out.println("no no");
        j++;
    }
}
    
    String[] connect = new String[name.length()];
        switch (name.length()) {
            case 2:
                connect[0] = String.valueOf(name.charAt(0));
                connect[1] = String.valueOf(name.charAt(1));
               graphicCenterUnit(input,name," "," ",connect[0],connect[1]," ");
               
               
               break;
               
               case 3:
               connect[0] = String.valueOf(name.charAt(0));
               connect[1] = String.valueOf(name.charAt(1));
               connect[2] = String.valueOf(name.charAt(2));
               graphicCenterUnit(input,name," ",connect[0],connect[1],connect[2]," ");
               break;
               case 4:
               connect[0] = String.valueOf(name.charAt(0));
               connect[1] = String.valueOf(name.charAt(1));
               connect[2] = String.valueOf(name.charAt(2));
               connect[3] = String.valueOf(name.charAt(3));
               graphicCenterUnit(input,name," ",connect[0],connect[1],connect[2],connect[3]);
               break;
               case 5:
               connect[0] = String.valueOf(name.charAt(0));
               connect[1] = String.valueOf(name.charAt(1));
               connect[2] = String.valueOf(name.charAt(2));
               connect[3] = String.valueOf(name.charAt(3));
               connect[4] = String.valueOf(name.charAt(4));
               graphicCenterUnit(input,name,connect[0],connect[1],connect[2],connect[3],connect[4]);
               break;




        }
    }
   


    public static void spaceFunstion(){
        System.out.println();
        System.out.print("                          ");
    }
    public static void space(int count){
        for(int i = 0;i<count;i++){
        System.out.print(" ");
        }
    }
    public static void taget(int count,String input){
       for (int i =0;i<count;i++){
        System.out.print(input);
        }
    }
    
    
}