package com.microservices.managerservice1;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController 
@RequestMapping("/mservice2")
public class ManagerServiceController 
{
   @Autowired
   private ManagerService managerService;
   
   @GetMapping("/custinfo")
   public ResponseEntity<?> CustomerInfo(){
       ResponseEntity<?> resp=null;
       try{

           List<CustomerAccounts> list=managerService.custInfo();

         resp=new ResponseEntity<List<CustomerAccounts>>( list, HttpStatus.FOUND);
     }catch (Exception e){
           resp=new ResponseEntity<String>( "Customer not found", HttpStatus.INTERNAL_SERVER_ERROR);

       }
       return resp;
   }
   @PostMapping("/create")
   public ResponseEntity<?> createAccount(@RequestBody Accounts accounts){
       ResponseEntity<?> resp=null;
       try{
           Accounts accounts1=managerService.createAccount(accounts);
           resp=new ResponseEntity<Accounts>(accounts1, HttpStatus.CREATED);

       }catch (Exception e){
           resp=new ResponseEntity<String>( "Account not creted", HttpStatus.INTERNAL_SERVER_ERROR);
       }
   return resp;
   }

       @GetMapping("/custInfo/{id}")
     
       public ResponseEntity<?> CustomerInfoByCid(@PathVariable("id") int id){
           ResponseEntity<?> resp=null;
           try{

               CustomerAccounts cstAcc=managerService.custInfoById(id);

               resp=new ResponseEntity<CustomerAccounts>( cstAcc, HttpStatus.FOUND);
           }catch (Exception e){
               resp=new ResponseEntity<String>( "Customer of id="+id+"not found", HttpStatus.INTERNAL_SERVER_ERROR);

           }
           return resp;
       }


}
