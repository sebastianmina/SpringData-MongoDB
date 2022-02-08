package co.escuelaing.User.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class User {
    @Id
    String id;
  
    String name;
 
    @Indexed( unique = true )
    String email;
 
    String lastName;
 
    Date createdAt;
 
    public User()
    {
    }


    public User(String id , String name, String email, String lastName, Date createdAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.lastName = lastName;
        this.createdAt = createdAt;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String name(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String email(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String lastName(){
        return lastName;
    }

    public void setLastname(String lastName){
        this.lastName = lastName;
    }

    public Date createdAt(){
        return createdAt;
    }

    public void setCreatedAt(Date createdAtString){
        this.createdAt = createdAtString;
    }
}
