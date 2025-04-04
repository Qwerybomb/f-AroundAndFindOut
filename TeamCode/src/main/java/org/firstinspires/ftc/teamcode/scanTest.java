package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DistanceSensor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

import java.util.Arrays;
import java.util.stream.Collectors;

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
        int length = (int) D.getDistance(DistanceUnit.CM);
        ArrayList<Character> list = new ArrayList<>(Collections.nCopies(length, '|'));
        List<String> stringList = list.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
        return String.join("", stringList);
    }
    public void runOpMode() {
        DistanceSensor distanceSensor = hardwareMap.get(DistanceSensor.class, "distance_sensor");
        telemetry.addData("Wai", "ting");
        telemetry.update();
        waitForStart();

        while (opModeIsActive()) {
          telemetry.addData("Dist", fastOutputDistance(distanceSensor));
          telemetry.addData("distanceInCM", distanceSensor.getDistance(DistanceUnit.CM));
          telemetry.update();
            }
    }

}
