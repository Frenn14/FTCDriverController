package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp
public class FTC extends LinearOpMode {
    ElapsedTime runtime = new ElapsedTime();

    Servo Gr            = null;

    @Override
    public void runOpMode() throws InterruptedException {
        Gr = hardwareMap.get(Servo.class, "a");


        waitForStart();
        runtime.reset();

        while (opModeIsActive()) {
            if(gamepad1) {
                Gr.setPosition(0.0);
            }
            if (gamepad1.x) {
                Gr.setPosition(1.0);
            }
        }
    }
}
