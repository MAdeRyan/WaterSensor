public class Main {
    public static void main(String args[]) {
        Sensor sensor = new Sensor();        
        WaterTank tank = new WaterTank();        
        Button bt = new Button();                

        sensor.connectTo(tank);
        bt.connectTo(sensor);
        bt.buttonPressed(1);
        sensor.detect();
    }   
}