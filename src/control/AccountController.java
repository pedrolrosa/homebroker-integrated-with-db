/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import model.entities.Account;
import model.repositories.impl.AccountImpl;
import model.repositories.services.AccountServices;

/**
 *
 * @author pedro
 */
public class AccountController {
    
    public Account current;
    private String name;
    
    private AccountImpl database = new AccountImpl();
    private AccountServices databaseServices = new AccountServices();

    public String getName() {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public boolean acess(Long owner){
        Account attempt = new Account().acess(owner);
        
        if(attempt != null){
            this.current = attempt;
            return true;
        }
        return false;
    }
    
    public boolean create(Long owner){
        if(owner == null){
            return false;
        } else {
            
            Account attempt = new Account();
            
            attempt.setOwner(owner);
            attempt.setAmount(new BigDecimal(20000));
            attempt.setMax(Double.valueOf(attempt.getAmount().multiply(BigDecimal.TEN).toString()));
            attempt.setStart(LocalDateTime.now());
            
            return database.create(attempt).isPresent();
        }
    }
}
