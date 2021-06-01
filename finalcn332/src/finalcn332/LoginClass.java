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
public class LoginClass  {
    public static User user;
    public static User login(int type,String username,String password ){
        System.out.println("555");
        if (type == 0){
        LoginFacebook loginFb = new LoginFacebook();
        user = loginFb.login(username, password);
        }
        else if( type ==1){
         LoginEmail loginEmail = new LoginEmail();
         user = loginEmail.login(username, password);
        }
        else if( type ==2){
         Login2step login2step = new Login2step();
         user = login2step.login(username, password);
        }
        return user ;
    }
}
