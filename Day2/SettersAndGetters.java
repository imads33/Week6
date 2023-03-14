class Student {
  private int id;
  private String name;
  private String branch;
 
  void setId(int id) {
    this.id = id;
  }
 
  void setName(String name) {
    this.name = name;
  }
 
  void setBranch(String branch) {
    this.branch = branch;
  }
 
  int getId() {
    return this.id;
  }
 
  String getName() {
    return this.name;
  }
 
  String getBranch() {
    return this.branch;
  }
}
 
public class SettersAndGetters {
  public static void main(String args[]) {
    Student obj = new Student();
    obj.setId(1);
    obj.setName("Imad");
    obj.setBranch("CSE");
    System.out.println("Name: " + obj.getName());
    System.out.println("Id:  " +obj.getId());
    System.out.println("Branch: " + obj.getBranch());
  }
}