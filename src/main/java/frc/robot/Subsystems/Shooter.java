package frc.robot.Subsystems;

//import edu.wpi.first.wpilibj.TimedRobot;
//import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;

public class Shooter {
    int lowerShooterMotorChannel;
    int upperShooterMotorChannel;
    PWMSparkMax m_lowerShooterMotor = new PWMSparkMax(lowerShooterMotorChannel);
    PWMSparkMax m_upperShooterMotor = new PWMSparkMax(lowerShooterMotorChannel);

}
