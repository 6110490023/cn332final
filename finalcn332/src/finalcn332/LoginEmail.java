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
public class LoginEmail implements LoginAdapter {

@Override
public User login(String username, String password) {
         System.out.println("login email sucess");
         return new User(username,password);
    }
    
}
