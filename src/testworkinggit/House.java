
package testworkinggit;

public class House implements Cloneable, Comparable<House> {
    //attribute
    private int id;
    private double area;
    private java.util.Date whenBuilt;
    //construct
    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new java.util.Date();
    }
    //get
    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public java.util.Date getWhenBuilt() {
        return whenBuilt;
    }
    
    //over
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override // Implement the compareTo method defined in Comparable
    public int compareTo(House o) {
        if (area > o.area)
            return 1;
        else if (area < o.area)
            return -1;
        else
            return 0;
    }
    
    
    //main
    public static void main(String[] args) {
        House house1 = new House(1, 120.5);
        House house2 = new House(2, 150.0);
        
        System.out.println("Hosue no.1: "+house1.getId()+ " Area: "+house1.getArea()+" Buit: "+house1.getWhenBuilt()+"\n");
        System.out.println("Hosue no.2: "+house2.getId()+ " Area: "+house2.getArea()+" Buit: "+house2.getWhenBuilt()+"\n");
        int compre = house1.compareTo(house2);
        if(compre >0){
            System.out.println("House no.1 > House no.2");
        }else if(compre < 0){
            System.out.println("House no.1 < House no.2");
        }else{
            System.out.println("House no.1 = House no.2");
        }
        
        House cloneHouse = (House) house1.clone(); 
        if(cloneHouse != null){
            System.out.println("Cloned House  NO: " + cloneHouse.getId() + " Area: " + cloneHouse.getArea() + " Built: " + cloneHouse.getWhenBuilt());
        }else{
            System.out.println("Fail");
        }
    }
    
}
