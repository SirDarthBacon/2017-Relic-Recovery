package org.firstinspires.ftc.teamcode.ftc11587;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;


@TeleOp(name="Relic Recovery: Holonomic Drive", group="Relic Recovery")
@Disabled //Comment this line out to include this OpMode in the Driver Station select list

public class HolonomicDrive_Linear extends LinearOpMode {

    /*HolonomicDrive_Linear Declarations*/
    private ElapsedTime runtime = new ElapsedTime();
    DcMotor lfMotor = null;
    DcMotor rfMotor = null;
    DcMotor lrMotor = null;
    DcMotor rrMotor = null;

    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Holonomic Drive Initialized");
        telemetry.update();

        /*Get the initial status of each drive motor*/
        lfMotor = hardwareMap.dcMotor.get("lfmotor");
        rfMotor = hardwareMap.dcMotor.get("rfmotor");
        lrMotor = hardwareMap.dcMotor.get("lrmotor");
        rrMotor = hardwareMap.dcMotor.get("rrmotor");

        /*Set motor rotation direction*/
        lfMotor.setDirection(DcMotor.Direction.FORWARD);
        rfMotor.setDirection(DcMotor.Direction.FORWARD);
        lrMotor.setDirection(DcMotor.Direction.FORWARD);
        rrMotor.setDirection(DcMotor.Direction.FORWARD);

        public void moveRobot(double angle, double speed, double rotation, double scale) {

        /*
         * Math factors which control mecanum drive
         *--Derived from Ian McInerney's mecanum drive overview for FRC Team 2022
         *
         * ROBOT DRIVETRAIN CONFIGURATION
         *
         *             FRONT
         *       1----------------2
         *		LF                RF
         *		\\				  //
         *		 |				  |
         *		 |				  |
         *		 |				  |
         *		 |				  |
         *		 3				  4
         *		LR				  RR
         *		//				  \\
         *		 ------------------
         *
         */

        /*Adjust desired vector angle by PI/4 due to X-oriented drivetrain vs. cross*/
        angle += PI/4;

        /*Adjust this value to obtain desired/suitable rotation rate*/
        rotation *= .5;

        /*Without this adjustment, full forward speed would only be .707 of max due to 45 degree off drivetrain alignment*/
        speed *= sqrt(2);

        double sinAng = sin(angle);
        double cosAng = cos(angle);

        /*Create an array to store power values for all 4 motors*/

        double motorpwr[] = new double[4];

        motorpwr[0] = (speed * sinAng) + rotation;  //LF power multiplier
        motorpwr[1] = (speed * cosAng) + rotation;  //RF power multiplier
        motorpwr[2] = (speed * -cosAng) + rotation; //LR power multiplier
        motorpwr[3] = (speed * -sinAng) + rotation; //RR power multiplier

        /*Normalize motor power values to [-1,1]*/



        /*Set power to individual motors*/

        lfMotor.setPower(motorpwr[0] * scale);
        rfMotor.setPower(motorpwr[1] * scale};
        lrMotor.setPower(motorpwr[2] * scale);
        rrMotor.setPower(motorpwr[3] * scale);
        }

        /* Wait for the driver to press PLAY*/
        waitForStart();
        runtime.reset();

        /*Run until driver presses STOP*/
        while (opModeIsActive()) {
            telemetry.addData("Status", "Run Time: " + runtime.toString());
            telemetry.update();

            // eg: Run wheels in tank mode (note: The joystick goes negative when pushed forwards)
            // leftMotor.setPower(-gamepad1.left_stick_y);
            // rightMotor.setPower(-gamepad1.right_stick_y);
        }
    }
}
