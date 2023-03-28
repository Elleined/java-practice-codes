package myownproject;

import java.util.Scanner;

public class PersonalInformation {
    
    private String name;
    private String religion;
    private char sex;
    private int age;
    private Scanner in = new Scanner(System.in);
    
    private void setName(){
        System.out.print("Enter your name: ");
        this.name = this.in.nextLine();
        isNameValid(name);
    }
    
    private void setAge(){
        System.out.print("Enter your age: ");
        this.age = this.in.nextInt();
        isAgeValid(age);
    }
    
    private void setSex(){
        System.out.print("Enter your sex 'M' or 'F': ");
        this.sex = this.in.next().charAt(0);
        isSexValid(sex);
    }

    private void setReligion(){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter your Religion: ");
        this.religion = src.nextLine();
        isReligionValid(religion);
    }

    private void isNameValid(String name){
        if (name.isEmpty()){
            System.out.println("Enter your name!");
            this.setName();
        }
    }

    private void isAgeValid(int age){
        if (!(18 <= age && age <= 35)){
            System.out.println("Valid age is 18 to 35!");
            this.setAge();
        }
    }

    private void isReligionValid(String religion){
        if (!(religion.equalsIgnoreCase("inc") || religion.equalsIgnoreCase("catholic"))){
            System.out.println("Valid religion is: \"INC\" or \"Catholic\"!");
            this.setReligion();
        }
    }

    private void isSexValid(char sex){
        if (!(sex == 'f' || sex == 'F' || sex == 'm' || sex == 'M')){
            System.out.println("Valid sex is: \"M\" or \"F\"!");
            this.setSex();
        }
    }
    
    private void displayDetails(){
        System.out.println("\nYour Details!");
        System.out.println("Your name is    : " + this.name.substring(0, 1).toUpperCase() + this.name.substring(1));
        System.out.println("Your age is     : " + this.age);
        System.out.print("Your sex is     : " + Character.toUpperCase(this.sex));
        System.out.print(this.sex == 'f' ? " (Female)" : " (Male)");
        System.out.print("\n" + "Your religion is: " + this.religion.toUpperCase());
        System.out.print(this.religion.equalsIgnoreCase("inc") ? " (Iglesia Ni Cristo)" + "\n" : " (Catholic)" + "\n");
    }

    public PersonalInformation(){

    }

    // Start of SQL
    private PersonalInformation(PersonBuilder builder){
        this.name = builder.name.substring(0, 1).toUpperCase() + builder.name.substring(1);
        this.age = builder.age;
        this.sex = Character.toUpperCase(builder.sex);
        this.religion = builder.religion.toUpperCase();
        this.displayDetails();

// JDBC Try
//    String url = "jdbc:mysql://localhost:3306/mydatabase";
//    String username = "root";
//    String password = "root";
//
//    System.out.println("Connecting to server..." + "\n");
//
//    try (Connection connection = DriverManager.getConnection(url, username, password)) {
//        System.out.println("-----Server connected!-----");
//        java.sql.Statement stmt = null;
//        ResultSet resultset = null;
//
//        try{
//            String sql = "INSERT INTO personalinformation (Name, Age, Sex, Religion) VALUES ('"+this.name+"', '"+this.age+"', '"+this.sex+"', '"+this.religion+"');";
//            Statement stmt1 = connection.createStatement();
//            stmt1.executeUpdate(sql);
//            System.out.println("sql executed");
//
//            }catch (SQLException ex){
//            // handle any errors
//            ex.printStackTrace();
//            }
//
//            /* // SELECT SQL
//            try {
//                String show = "select * from personalinformation;";
//                Statement stmtshow = connection.createStatement();
//                ResultSet rs = stmtshow.executeQuery(show);
//
//                while(rs.next()){
//                    System.out.println(rs.getString("Name") + rs.getString("Age") + rs.getString("Sex") + rs.getString("Religion"));
//                }
//            }
//            */
//                /* // DELETE SQL
//                String delete = "delete from personalinformation;";
//                Statement stmtdelete = connection.createStatement();
//                stmtdelete.executeUpdate(delete);
//                System.out.println("deleted");
//                */
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        finally {
//            // release resources
//            if (resultset != null) {
//                try {
//                    resultset.close();
//                } catch (SQLException sqlEx) { }
//                resultset = null;
//            }
//
//            if (stmt != null) {
//                try {
//                    stmt.close();
//                } catch (SQLException sqlEx) { }
//                stmt = null;
//            }
//
//            if (connection != null) {
//                connection.close();
//            }
//        }
//
//        } catch (SQLException e) {
//            throw new IllegalStateException("Cannot connect the server!", e);
//            }
        
    } // End of SQL Query 

    // New Nested Static Class for
    public static class PersonBuilder {
        private final String name;
        private final int age;
        private final char sex;
        private final String religion;
        private static char yesOrNo;
        
        public PersonBuilder(){
            final PersonalInformation pe = new PersonalInformation();
            pe.setName();
            pe.setAge();
            pe.setSex();
            pe.setReligion();
            this.name = pe.name;
            this.age = pe.age;
            this.sex = pe.sex;
            this.religion = pe.religion;
        }

        private PersonalInformation instance;
        final void build(){
            if(instance == null){
                instance = new PersonalInformation(this);
                System.out.println("------Entry has been added!-----" + "\n");
                PersonBuilder.createNewUser();
            } else{
                System.out.println("Builder have already initialized");
            }
        }

        private static void isUserWantToCreateNew(char yesOrNo){
            PersonBuilder.yesOrNo = yesOrNo;
            if (yesOrNo == 'Y' ||  yesOrNo == 'y'){
                new PersonBuilder().build();
            } else {
                System.out.println("-----End of program-----");
            }
            
        }

        private static void createNewUser(){
            Scanner in = new Scanner(System.in);
            System.out.print("Add new entry 'Y' or 'N'?: ");
            PersonBuilder.yesOrNo = in.next().charAt(0);
            isUserWantToCreateNew(yesOrNo);
        }
            
        

    }
   

    
       
       
    

    
}


