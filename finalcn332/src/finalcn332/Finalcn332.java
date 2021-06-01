/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalcn332;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Finalcn332 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter your type 0 = facebook 1 = email 2 = 2step: ");
        int choice = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String name = sc2.nextLine();
        System.out.print("Enter your password: ");
        String password = sc2.nextLine();
        User user =  LoginClass.login(choice, name, password);
        System.out.print("Enter your choice 0 createRoom ,1  promotion");
        choice = sc1.nextInt();
        if (choice == 0){
            System.out.print("Enter your type ");
            int type = sc1.nextInt();
            System.out.print("Enter your numberpeople ");
            int np = sc1.nextInt();
            System.out.print("Enter your wifi ");
            int wifi = sc1.nextInt();
            System.out.print("Enter your start ");
            String st = sc2.nextLine();
            System.out.print("Enter your end ");
            String en = sc2.nextLine();
            System.out.print("Enter your bed ");
            int bed = sc1.nextInt();
            
            Room room = new Room(0,np,wifi,st,en,bed );
            Room room2 = new Room(1,np,wifi,st,en,bed );
            user.addRooms(room);
            user.addRooms(room2);
            int pay = user.calculate();
            System.out.println(pay);
            
            
        }
        
    }
    
}
