import java.io.FileNotFoundException;
import java.util.List;

public class Tenant {

        private String name;
        private int age;
        private boolean isPermanent;
        private boolean isWaterBillPaid; 
        private boolean isEBillPaid; 
        private String wDate;
        private String eDate;
        private List<String> fileData; 

        public Tenant(String name, int age, boolean isPermanent , boolean isWaterBillPaid , boolean isEBillPaid ,String wDate ,  String eDate ) {
            this.name = name;
            this.age = age;
            this.isPermanent = isPermanent;
            this.isWaterBillPaid = isWaterBillPaid ; 
            this.isEBillPaid = isEBillPaid;
            this.wDate = wDate ;
            this.eDate = eDate ;
      
        }
        

        
        
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public boolean isPermanent() {
            return isPermanent;
        }

        public void setPermanent(boolean permanent) {
            isPermanent = permanent;
        }
        public static void tempTenant(){
        	Connection connection = new Connection();
        	 try {
             	System.out.println("\n~~~~ Temporary Resident Data ~~~~\n");
                System.out.println(connection.readfile()+"\n");
             } catch (FileNotFoundException e) {
                 e.printStackTrace(); 
             }
        }
        public void tanentInfo() {
        
            System.out.println("Name: " + name + "\nAge: " + age + "\nPermanent: " + isPermanent  );
            System.out.println("\nMaintenance Bills of Residents");
            System.out.println( "Water Bill: "+isWaterBillPaid + "  Date: "+wDate );
            System.out.println("Electricity Bill: "+isEBillPaid + "  Date: "+eDate);  
        }
    }

