package IwoFall23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    static long countMin(long ports, long gadgets, long usb2, long usb5) {
        long count = 0;
        if (ports >= gadgets) {
            return count;
        }
        long diff = gadgets - ports;
        if (usb5 >= usb2 * 4) {
            count += diff * usb2;
        } else {
            long carry = diff % 4;
            count += (diff - carry) / 4 * usb5;
            count += Math.min(usb5, carry * usb2);
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            long ports = Long.parseLong(br.readLine());
            long gadgets = Long.parseLong(br.readLine());
            long usb2 = Long.parseLong(br.readLine());
            long usb5 = Long.parseLong(br.readLine());
            System.out.println(countMin(ports, gadgets, usb2, usb5));
        }
    }
}
