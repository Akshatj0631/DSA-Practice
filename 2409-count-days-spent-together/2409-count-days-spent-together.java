class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int months[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int Alice_Arrive = Integer.parseInt(arriveAlice.substring(0, 2));
        int Bob_Arrive = Integer.parseInt(arriveBob.substring(0, 2));
        int Alice_leave = Integer.parseInt(leaveAlice.substring(0, 2));
        int Bob_leave = Integer.parseInt(leaveBob.substring(0, 2));

        int A1 = 0, A2 = 0, B1 = 0, B2 = 0;

        for (int i = 0; i < 12; i++) {
            // Alice's arrival
            if (i < Alice_Arrive - 1)
                A1 += months[i];
            else if (i == Alice_Arrive - 1)
                A1 += Integer.parseInt(arriveAlice.substring(3));

            // Alice's departure
            if (i < Alice_leave - 1)
                A2 += months[i];
            else if (i == Alice_leave - 1)
                A2 += Integer.parseInt(leaveAlice.substring(3));

            // Bob's arrival
            if (i < Bob_Arrive - 1)
                B1 += months[i];
            else if (i == Bob_Arrive - 1)
                B1 += Integer.parseInt(arriveBob.substring(3));

            // Bob's departure
            if (i < Bob_leave - 1)
                B2 += months[i];
            else if (i == Bob_leave - 1)
                B2 += Integer.parseInt(leaveBob.substring(3));
        }

        int a = Math.max(A1, B1);
        int b = Math.min(A2, B2);

        return Math.max(0, b - a + 1);
    }
}