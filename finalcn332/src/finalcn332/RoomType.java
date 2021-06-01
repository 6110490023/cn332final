/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalcn332;

/**
 *
 * @author Acer
 */
public abstract class  RoomType {
    public abstract int getamount(); 
    public static RoomType createtype(int type){
        RoomType roomtype = null;
        if (type ==0){
        roomtype = new RoomType1();
        }
        else if (type ==1){
        roomtype = new RoomType2();
        }
        return roomtype;
}
}
