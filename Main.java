import java.util.Scanner;
class X0X
{
    static int efficient=0;
    static int y=0;
   static String[] array={"1","2","3","4","5","6","7","8","9"};

   static boolean W_L()
   {    
       String R1,R2,R3,C1,C2,C3,D1,D2;
        R1=array[0]+array[1]+array[2];
        R2=array[3]+array[4]+array[5];
        R3=array[6]+array[7]+array[8];
        C1=array[0]+array[3]+array[6];
        C2=array[1]+array[4]+array[7];
        C3=array[2]+array[5]+array[8];
        D1=array[0]+array[4]+array[8];
        D2=array[2]+array[4]+array[6];
       if(R1.equals("XXX")||R1.equals("OOO"))
       {
        return true;
       }
       else if(R2.equals("XXX")||R2.equals("OOO"))
       {
        return true;
       }
       else if(R3.equals("XXX")||R3.equals("OOO"))
       {
        return true;
       }
      else if(C1.equals("XXX")||C1.equals("OOO"))
       {
           return true;
       }
      else if(C2.equals("XXX")||C2.equals("OOO"))
       {
           return true;
       }
      else if(C3.equals("XXX")||C3.equals("OOO"))
       {
           return true;
       }
      else  if(D1.equals("XXX")||D1.equals("OOO"))
       {
           return true;
       }
      else if(D2.equals("XXX")||D2.equals("OOO"))
       {
           return true;
       }
       return false;
   }
    static void Print(){
        int counter=0;
        System.out.println("--------------");
        for(int i=1;i<4;i++)
        {

            System.out.print("| ");
            for(int j=1;j<4;j++){
            System.out.print(array[counter]+" | ");
            counter++;
            }
            System.out.println("\n");
        }
        System.out.println("--------------\n");
    }
    static int computer()
    {
        

        if(efficient+1==1)
        {
            efficient++;
            
            return 1;
    }
    if(efficient+1==2)
    {
        if(y==9)
        {
            efficient++;
            return 3;
        }
        if(y==2||y==3||y==6){
        efficient ++;
        return 7;
        }

        else if(y==5){
        efficient ++;
        return 2;
        }
        else{
            efficient++;
            return 3;
        }
    }
    if(efficient+1==3)
    {
        efficient++;
        if(array[5].equals("X"))
        {
            if(array[3].equals("X"))
            {
                return 5;
            }
        }
        if(array[7].equals("X"))
        {
            if(array[1].equals("X"))
            {
                return 5;
            }
        }
        if(array[8].equals("X"))
        {
            if(array[2].equals("O"))
            {
                if(array[1].equals("X"))
                {
                    return 7;
                }
                else{
                    return 2;
                }
            }
        }
        if(array[2].equals("O"))
        {
            if(array[1].equals("2")) 
            {
                return 2;
            }   
            else
            {
                return 9;
            }
        }
        else if(array[6].equals("O")){
            
            if(array[3].equals("4")) 
            {
                return 4;
            }   
            else
            {
                return 9;
            }
        }
        else{
            if(array[2].equals("3"))
            {
            return 3;
            }
            else
            return 7;
        }
  
    }
    if(efficient+1==4)
    {
        efficient++;
        if(array[0].equals("O"))
        {
            if(array[4].equals("O"))
            {
                if(array[6].equals("O"))
                {
                    if(array[2].endsWith("3"))
                    {
                        return 3;
                    }
                    else
                    {
                        return 9;
                    }
                }
            }
        }
        if(array[0].equals("O"))
        {
            if(array[2].equals("O"))
            {
                if(array[4].equals("O"))
                {
                    if(array[6].endsWith("7"))
                    {
                        return 7;
                    }
                    else
                    {
                        return 9;
                    }
                }
            }
        }
        if(array[8].equals("X"))
        {
            if(array[2].equals("O"))
            {
                if(array[1].equals("X"))
                {
                    if(array[4].equals("5"))
                    {
                        return 5;
                    }
                    else{
                        return 4;
                    }
                }
            }
        }
        if(array[1].equals("O"))
        {
            if(array[2].equals("O"))
            {
                return 7;
            }
        }
        else if(array[2].equals("O"))
        {
            if(array[4].equals("5"))
            {
                return 5;
            }
            else 
            return 6;
        }
        else 
        {
            if(array[7].equals("8"))
            {
                return 8;
            }
            else 
            return 5;   
        }
    }
    if(efficient+1==5)
    {
        efficient++;
        if(array[1].equals("O"))
        {
            if(array[2].equals("X"))
            {
                if(array[3].equals("X"))
                {
                    return 6;
                }
                else 
                {
                    return 4;
                }

            }
        } 
    }
    if(efficient+1==6)
    {
      if(array[7].equals("8"))
        return 8;
        else
        return 9;
    }
       return 2; 
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char x='X';
        int choice = 0;
        System.out.println(" enter coressponding numbers\n1 PLAYER\n2 PLAYER\n");
       choice = sc.nextInt();
        for(int i=1;i<10;i++)
        {
            Print();
            System.out.println();
            if(i%2==0)
            {
                System.out.println("player X");
                y=sc.nextInt();
    
            }
            else{
                System.out.println("player O");
              
                if(choice == 2)
                y=sc.nextInt();
                else
                y=computer();
            }
          if(array[y-1]!="X" && array[y-1]!="O"){
            if(i%2==0)
            {
                x='X';
                array[y-1]="X";
            }
            else{
                x='O';
                array[y-1]="O";
            }
            
        }

         else{
         i--; 
         System.out.println("\n\nthis exist already an "+x+" player "+x+" enter again\n");
            }
            if(W_L())
            {
                Print();
                System.out.println("player "+x+" you have won the match congrats");
                break;
            }
            else{
                if(i==9)                
                {
                    Print();
                   System.out.println ("MATCH Draw    ||    and a tough time");
                    break;
                }
            }
        }
        sc.close();
    }
}