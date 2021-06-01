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
public class Room {
    private RoomType type;
    private int numberPeople;
    private int wifi;
    private String startdate;
    private String enddate;
    private int bad;
    
    public Room(int type,int numberPeople,int wifi,String startdate,String enddate,int bad) {
        this.type = RoomType.createtype(type);
        this.numberPeople = numberPeople;
        this.wifi = wifi;
        this.startdate = startdate;
        this.enddate = enddate;
        this.bad = bad;
    }

    public void setType(int type) {
        this.type = RoomType.createtype(type);
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public void setWifi(int wifi) {
        this.wifi = wifi;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
        //2021-05-31
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
        //2021-06-01
    }

    public void setBad(int bad) {
        this.bad = bad;
    }
    public int calculate(){
        int amount = type.getamount();
        if (wifi==1){
        amount += 100;
        }
        if(bad ==2){
        amount += 100;
        }
        int a =  CalculateDate.Calculate(this.startdate,this.enddate );
        amount += a;
        return amount;
    }
    
}
