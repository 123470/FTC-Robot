package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.robotcontroller.superClass;

import Superclass;

/**
 * Created by Marci on 12/11/2016.
 */
import com.qualcomm.robotcore.hardware.Gamepad

public class Buttons extends Superclass {
    @Override
    public void loop()
    {   DcMotor armMotor;
        boolean XisPressed = gamepad1.x;
        boolean BisPressed = gamepad1.b;
        boolean AisPressed = gamepad1.a;
        boolean YisPressed = gamepad1.y;
        boolean Left_TriggerisPressed = gamepad1.left_trigger;

        if (Left_TriggerisPressed);
        DcMotor[armMotor] = 100

        if (XisPressed);
        int Pwr = 0.75
        else if (BisPressed);
        int Pwr = 0.5
        else if (AisPressed);
        int Pwr = 0.25
        else if (YisPressed);
        int Pwr = 1
        else;
        int Pwr = 0.5

        int power = joystick.joy1_y1; // Get joystick 1's left y-axis value.

        DcMotor[armMotor] = 100 * Pwr

    }
}
