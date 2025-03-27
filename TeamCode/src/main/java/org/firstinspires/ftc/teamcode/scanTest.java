package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DistanceSensor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@TeleOp (name="AdvancedAutoBasketSpike", group="Robot")
public class scanTest extends LinearOpMode {
    private DistanceSensor distanceSensor;

    public static String outputDistance(DistanceSensor Dist) {
        String distanceHolder = "";
        for (int i = 0; i == (Dist.getDistance(DistanceUnit.MM)); i++) {
            distanceHolder = distanceHolder + "|";
        }
        return distanceHolder;
    }

    public void runOpMode() {
        distanceSensor = hardwareMap.get(DistanceSensor.class, "distance_sensor");
        telemetry.addData("Wai", "ting");
        telemetry.update();
        waitForStart();

        while (opModeIsActive()) {
          telemetry.addData("", outputDistance(distanceSensor));
            }
    }

}
