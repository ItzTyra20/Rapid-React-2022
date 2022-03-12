//package frc.robot;

// import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
// import android.graphics.Color;
// import edu.wpi.first.wpilibj.TimedRobot;

//public class lights extends TimedRobot {
 //   public enum ColorFromHue {
 //       RED,
 //       GREEN,
 //       BLUE,
 //       INDETERMINATE
 //   }

    // Multiply the RGB values by a scale factor to amplify the measured values
 //   static final double SCALE_FACTOR = 255;

 //   public static ColorFromHue GetColor(int red, int green, int blue) {
 //       float hsvValues[] = {0F, 0F, 0F};
 //       Color.RGBToHSV((int) (red * SCALE_FACTOR),
 //               (int) (green * SCALE_FACTOR),
 //               (int) (blue * SCALE_FACTOR),
 //               hsvValues);

 //       int hue = (int)hsvValues[0];
        // rough color ranges picked from the palette at http://www.workwithcolor.com
 //       if(hue >= 80 && hue <= 138) { // green
  //          return ColorFromHue.GREEN;
 //       }  else if((hue >= 344 && hue <= 360) || (hue >= 0 && hue <= 20)) { // RED
  //          return ColorFromHue.RED;
  //      }  else if(hue >= 180 && hue <= 270) { // BLUE
 //           return ColorFromHue.BLUE;
 //       }

  //      return ColorFromHue.INDETERMINATE;
    

     //code for blinkin lights
//     if(time < 85) {
 //       lights.setPattern(RevBlinkinLedDriver.BlinkinPattern.VIOLET);
//    }    
//    }
//    else if (time >= 85 && time <= 90) {
//        lights.setPattern(RevBlinkinLedDriver.BlinkinPattern.HEARTBEAT_BLUE);
//    }
 //   else if (time > 90 && time < 110) {
 //       lights.setPattern(RevBlinkinLedDriver.BlinkinPattern.BLUE_VIOLET);
 //   }
 //   else if (time >= 110 && time <= 120) {
 //       lights.setPattern(RevBlinkinLedDriver.BlinkinPattern.HEARTBEAT_RED);
 //   }
        //from 91seconds to 94 seconds
        //(time > 85 && time <= 120)
//    else {
 //       lights.setPattern(RevBlinkinLedDriver.BlinkinPattern.VIOLET);
        //end  lights code
        //telemetry.addData("Distance (cm)", "%.3f", ((DistanceSensor) colorSensor).getDistance(DistanceUnit.CM));
 //   }

 //   telemetry.update();

// } //end OpModeIsActive
// lights.setPattern(RevBlinkinLedDriver.BlinkinPattern.STROBE_BLUE);
//}  //end runOpMode

 //   public void dolights() {
 //       int temp;
 //       if(temp == 1){
 //          resetStartTime();
 //          temp = 2;
 //       }

  //     int time;
    //code for blinkin lights
 //      if (time < 85) {
 //          lights.setPattern(RevBlinkinLedDriver.BlinkinPattern.VIOLET);
 //      } else if (time >= 85 && time <= 90) {
 //          lights.setPattern(RevBlinkinLedDriver.BlinkinPattern.HEARTBEAT_BLUE);
 //      } else if (time > 90 && time < 110) {
  //         lights.setPattern(RevBlinkinLedDriver.BlinkinPattern.BLUE_VIOLET);
  //     } else if (time >= 110 && time <= 120) {
  //         lights.setPattern(RevBlinkinLedDriver.BlinkinPattern.HEARTBEAT_RED);
 //      }
       //from 91seconds to 94 seconds
       //(time > 85 && time <= 120)
 //      else
  //         lights.setPattern(RevBlinkinLedDriver.BlinkinPattern.VIOLET);
       //end  lights code
//}
  //  private void resetStartTime() {
 //   }
//} 