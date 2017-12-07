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

        /*Get inputs from gamepad1 to drive robot*/
        double Speed = -gamepad1.left_stick_y;
        double Angle = gamepad1.left_stick_x;
        double Strafe = gamepad1.right_stick_x;
        double MAX_SPEED = 1.0;

        public void moveRobot(double Speed, double Angle, double Strafe, double MAX_SPEED) {

        /*
         * Math factors which control mecanum drive
         *--Derived from Ian McInerney's mecanum drive overview for FRC Team 2022...see FTC Team 11587 GitHub repository for a copy
         *
         * ROBOT DRIVETRAIN CONFIGURATION
         *
         *             FRONT
         *       1----------------2
         *      LF                RF
         *      \\				  //
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
