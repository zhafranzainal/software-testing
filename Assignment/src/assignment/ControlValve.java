/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author zhafr
 */
public class ControlValve {

    public String valveControl(double temperature, double pressure) {

        String valveStatuse = "";
        String coolingStatuse = "";

        if (pressure > 100) {
            ///openTheValve();
            valveStatuse = " Valve opened";
            System.out.println("The Valve is = " + valveStatuse);
        } else {
            ///closeTheValve();
            valveStatuse = " Valve Closed";
            System.out.println("The Valve is = " + valveStatuse);
        }

        if (temperature > 27) {
            ///enableCoolingCoil();
            coolingStatuse = "Cooling Coil enabled ";
            System.out.println("The Cooling Coil is = " + coolingStatuse);
        }

        return valveStatuse + ", " + coolingStatuse;

    }

}
