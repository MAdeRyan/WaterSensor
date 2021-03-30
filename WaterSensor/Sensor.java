public class Sensor implements OnOff {
    private WaterTank tank;    
    private int tankCapacity;

    public Sensor() {
        tank = null;             
        tankCapacity = 0;
    }

    public void connectTo(WaterTank tank) {
        this.tank = tank;        
        tankCapacity = tank.getCapacity();
    }

    public void detect(){
        if (tankCapacity == 0) {            
            System.out.println("============================");
            System.out.println("Tank capacity is " + tankCapacity + "%");
            System.out.println("Tank is filled with water");
            waterfill();
        }
        else if(tankCapacity == 100) {
            System.out.println("Current Tank capacity is " + tankCapacity + "%");           
            System.out.println("Tank capacity is full");
            System.out.println("============================");            
            this.activate(0);
        }
        else {            
            System.out.println("Current Tank capacity is " + tankCapacity + "%"); 
            System.out.println(".");
            System.out.println(".");                     
            waterfill();
        }        
    }

    public void waterfill() {
        tankCapacity += 20;
        detect();
    }
        
    public void activate (int state) {
        if(state == 1)
            System.out.println("WaterSensor was activated");
        else
            System.out.println("WaterSensor was deactivated");
    }
}