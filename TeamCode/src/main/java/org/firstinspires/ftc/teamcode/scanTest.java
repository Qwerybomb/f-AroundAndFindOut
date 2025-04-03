package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DistanceSensor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

import java.util.Arrays;

@TeleOp (name="AppleVisionPro", group="Robot")
public class scanTest extends LinearOpMode {

    public static String outputDistance(DistanceSensor Dist) {
        StringBuilder distanceHolder = new StringBuilder();
        for (int i = 0; i < (Dist.getDistance(DistanceUnit.CM)); i++) {
            distanceHolder.append('|');
        }
        return distanceHolder.toString();
    }
    public static String fastOutputDistance(DistanceSensor D) {
        String Distance = String.valueOf(D.getDistance(DistanceUnit.CM));
        List<String> list = Arrays.asList(Distance.split(""));
        UnaryOperator<String> replaceMap = n -> {
            return "|";};
        list.replaceAll(replaceMap);

    }
    public void runOpMode() {
        DistanceSensor distanceSensor = hardwareMap.get(DistanceSensor.class, "distance_sensor");
        telemetry.addData("Wai", "ting");
        telemetry.update();
        waitForStart();

        while (opModeIsActive()) {
          telemetry.addData("Dist", outputDistance(distanceSensor));
          telemetry.addData("distanceInCM", distanceSensor.getDistance(DistanceUnit.CM));
          telemetry.update();
            }
    }

}
