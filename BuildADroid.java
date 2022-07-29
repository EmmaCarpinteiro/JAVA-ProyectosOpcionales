public class BuildADroid {
    String name;
    int batteryLevel;
  
    public BuildADroid (String droidName) {
      name = droidName;
      batteryLevel = 100;
    }
  
    public void performTask(String task) {
      batteryLevel = batteryLevel - 10;
      System.out.println(name + " is performing task: " + task);
    }
  
    public String toString() {
      return "Hello, I am the droid: " + name;
    }
  
    public static void main(String[] args) {
      BuildADroid codey = new BuildADroid("Codey");
      System.out.println(codey);
      codey.performTask("dancing");
      codey.performTask("coding");
    }
  }