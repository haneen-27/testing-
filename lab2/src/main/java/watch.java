public class watch {

    public String watch ( String buttons ){
        int n = buttons.length();

        int m=0 ,h = 0;               // minute,hour
        int D = 1,M = 1;              // Day,Month
        int Y = 2000;                 // Year

        String state = "Normal_Display";
        String state1 = "Time";
        String state2 = "Alarm";
        String state3 = "min";


        for(int i=0; i<n; i++){
           switch (state){

               case "Normal_Display" : {
                   if ( buttons.charAt(i) == 'c' )
                        state = "Update";
                   if ( buttons.charAt(i) == 'b' )
                       state = "Chime_Alarm_Set";
                   if ( buttons.charAt(i) == 'a' ){
                       if( state1 == "Time")
                           state1 = "Date";
                       else
                           state1 = "Time";

                   }

                   break;
               }

               case "Chime_Alarm_Set" : {
                   if ( buttons.charAt(i) == 'a' ) {
                       if (state2 == "Alarm")
                           state2 = "Chime";
                   }
                   if ( buttons.charAt(i) == 'd' )
                            state = "Normal_Display";

                   break;
               }

               case "Update" : {
                   if (buttons.charAt(i) == 'a') {
                       if (state3 == "min")
                           state3 = "hour";
                       else if (state3 == "hour")
                           state3 = "day";
                       else if (state3 == "day")
                           state3 = "month";
                       else if (state3 == "month")
                           state3 = "year";
                       else if (state3 == "year")
                           state = "Normal_Display";
                   }

                   if (buttons.charAt(i) == 'b'){
                       if (state3 == "min") {
                           if (m < 60)
                               m++;
                           else
                               m=0;
                       }
                       else if (state3 == "hour")
                           if ( h < 24)
                               h++;
                           else
                               h=0;
                       else if (state3 == "day")
                           if ( D < 31)
                               D++;
                           else
                               D=1;
                       else if (state3 == "month")
                           if ( M < 12)
                               M++;
                           else
                               M=1;
                       else if (state3 == "year")
                           if ( Y < 2100)
                               Y++;
                   }

                   if (buttons.charAt(i) == 'd')
                       state = "Normal_Display";
                   break;
               }
           }
        }

        String s;

        if (state == "Normal_Display") {
            s = state1;
        }
        else if (state == "Chime_Alarm_Set"){
            s = state1;
        }
        else {
            s = state1;
        }


        return "Current state: " + state + ", " + s + "  Date: " + String.valueOf(D) + " - " + String.valueOf(M) + " - " +String.valueOf(Y) + "  Time: " + String.format("%02d", h) + ":" + String.format("%02d", m);

    }
}
