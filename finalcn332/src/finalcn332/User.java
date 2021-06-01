/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalcn332;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class User {
    String username;
    String password;
    ArrayList<Room> rooms = new  ArrayList<Room>();

    public User(String username, String password){
       this.username  = username;
       this.password = password;
       System.out.println("username : "+username+"password : "+ password);
    }

    public void addRooms(Room room) {

        this.rooms.add(room);
    }
    public int calculate() {
        int sum =0;
        for (int i =0;i < rooms.size(); i++ ){
           sum = sum+ rooms.get(i).calculate();
        }
        return sum;
    }
}
