package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DistanceSensor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@TeleOp (name="AdvancedAutoBasketSpike", group="Robot")
public class scanTest extends LinearOpMode {
    private DistanceSensor DistanceSensor;

    public void runOpMode() {
        DistanceSensor = hardwareMap.get(DistanceSensor.class, "distance_sensor");
        telemetry.addData("Wai", "ting");
        telemetry.update();
        waitForStart();
        while (opModeIsActive()) {
            DistanceSensor.getDistance(DistanceUnit.MM);
           for (int i = 0; i == (DistanceSensor.getDistance(DistanceUnit.MM)); i++) {
                telemetry.addData("", "|");
           }
          telemetry.update();
            }
    }

}
