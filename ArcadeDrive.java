package org.firstinspires.ftc.teamcode;

/**
 * Created by Marci on 12/11/2016.
 */

import com.qualcomm.robotcore.hardware.DcMotor;

import static com.qualcomm.analytics.Analytics.c;

public class ArcadeDrive extends Superclass {

    DcMotor leftMotor;
    DcMotor rightMotor;
    DcMotor armMotor;

    public task main() {
        while (true) { // infinitely loop
            getJoystickSettings(joystick);  // Update buttons and joysticks.
            int turn = joystick.joy1_x1; // Get joystick 1's left x-axis value.
            int power = joystick.joy1_y1; // Get joystick 1's left y-axis value.

            DcMotor[leftMotor] = power + turn;
            DcMotor[rightMotor] = power - turn
}
