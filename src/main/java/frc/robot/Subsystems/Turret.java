package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.TimedRobot;
//import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;

public class Turret extends TimedRobot {
    int turretMotorChannel;
    PWMSparkMax m_turretMotor = new PWMSparkMax(turretMotorChannel),
    m_turningMotor = new PWMSparkMax(turretMotorChannel);
    }

