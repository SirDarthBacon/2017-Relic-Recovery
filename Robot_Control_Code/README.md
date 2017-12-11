## Robot_Control_Code
This directory contains the control code for the 2017 Relic Recovery robot.  To utilize this GitHub repository, download a version of Git suitable for your development platform here:

[Git Version Control Download](https://git-scm.com/downloads)

Once you have installed Git on your development platform, follow these instructions to download/upload code changes:

1.  Create a folder somewhere in your file system which will hold your local copy of the GitHub repository.  Open a command line interface and change to that directory.

2.  Clone the current GitHub repository into the directory you changed into by typing the following into your command line interface:
`git checkout -b <yourfirstname> https://github.com/FTCTeam11587/2017-Relic-Recovery.git`

3.  Use your preferred editor to make local changes to the robot control source code.

When you are ready to push your changes to GitHub, follow this process:

1.  Check to see what has changed between your version of the code and the last revision by changing to the `2017-Relic-Recovery` directory in the directory you created above and typing:
`git status` in your command line interface.

2.  You should see a list of files that have changed from the previous version.  Type the following for each file which you want to upload to GitHub:
`git add <filename>`  Recommend add files in groups with similar changes, so your commit notes reflect only what was done on those specific files.

3.  Once you have added the desired files to be uploaded, type:
`git commit -a`

4.  To push your changes back to GitHub, type the following:
`git push origin <yourfirstname>` (where `<yourfirstname>` is the same string you used with the `git checkout -b` command above)

### FTC Library Version
This code utilizes the Qualcomm-provided FTC programming library v3.5.

### FTC Team 11587 Code
The FTC Team 11587 custom code for this year's robot can be found in the TeamCode subdirectories. Of note, the following files provide specific control functionality for this year's robot:

* `ftc_app-master_v3.5/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/ftc11587/Teleop_Holonomic_Drive_Basic.java`

This code is the primary code for the TeleOp portion of the Relic Recovery game. It includes basic holonomic drive controls, as well as controls for the robot arm, and the team's AutoMount subroutine, which places the robot on the balance platform following all other End Game maneuvering.

### Programming Tutorial
Several external resources were used as programming tutorial tools during the 2017-2018 season 

*  [IBM DeveloperWorks Java Tutorial](https://www.ibm.com/developerworks/java/tutorials/j-introtojava1/)
*  [Chief Delphi Mecanum Programming](https://www.chiefdelphi.com/media/papers/2390)

