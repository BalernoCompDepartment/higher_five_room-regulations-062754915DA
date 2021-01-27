class ClassRoom{
    double length = 0;
    double height = 0;
    double width = 0;
    double airSpace = 0;
    }
    
class Main {
  public static void main(String[] args) {

ClassRoom room = new ClassRoom(); 
room = getDimensions();
int legalPeeps = getLegalPeople(room);
displayPeople(legalPeeps);
  }

public static ClassRoom getDimensions() {
ClassRoom localRoom = new ClassRoom(); 

  localRoom.length = getValidReal(2.0,20.0,"Please enter the length between 2 and 20 metres");

  localRoom.width = getValidReal(2.0,20.0, "Please enter the width between 2 and 20 metres.");

  localRoom.height = getValidReal(2.0,10.0,"Please enter the height between 2 and 10 metres.");

  localRoom.airSpace = getValidReal(5.0,15.0,"Please enter the air space between 5 and 15 cubic metres per person.");

  return localRoom;

}

public static double getValidReal(double min, double max, String msg){

double real;
real = Keyboard.getReal(msg);
while(real < min || real > max){
System.out.println("Error, invalid entry.");
real = Keyboard.getReal(msg);
}
return real;
}

public static int getLegalPeople (ClassRoom localRoom){

double roomVol = localRoom.height * localRoom.length * localRoom.width;
double persons = roomVol / localRoom.airSpace ;

int noPeople =  (int) Math.floor(persons);
  return noPeople;
}

public static void displayPeople (int people) {

Screen.display("This room can contain " + people + " people in it."," ");

}
}