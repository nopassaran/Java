/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class SeatClass {
    private static int id=0;
    private String classname;

    public SeatClass(String classname) {
        this.classname = classname;
        id+=1;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        SeatClass.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
    
    
    
    
}
