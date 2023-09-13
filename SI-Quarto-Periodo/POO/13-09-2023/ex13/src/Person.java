public class Person {
  private String name;
  private int age;
  private String city;

  // Constructor
  public Person(String name, int age, String city) {
    this.name = name;
    this.age = age;
    this.city = city;
  }

  // Getters
  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public String getCity() {
    return this.city;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setCity(String city) {
    this.city = city;
  }
}
