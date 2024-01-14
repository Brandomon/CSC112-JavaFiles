import java.util.*;
import java.io.*;

public class Keyboard
{
    private static boolean printErrors;
    private static int errorCount;
    private static String current_token;
    private static StringTokenizer reader;
    private static BufferedReader in;
    
    public static int getErrorCount() {
        return Keyboard.errorCount;
    }
    
    public static void resetErrorCount(final int n) {
        Keyboard.errorCount = 0;
    }
    
    public static boolean getPrintErrors() {
        return Keyboard.printErrors;
    }
    
    public static void setPrintErrors(final boolean printErrors) {
        Keyboard.printErrors = printErrors;
    }
    
    private static void error(final String s) {
        ++Keyboard.errorCount;
        if (Keyboard.printErrors) {
            System.out.println(s);
        }
    }
    
    private static String getNextToken() {
        return getNextToken(true);
    }
    
    private static String getNextToken(final boolean b) {
        String s;
        if (Keyboard.current_token == null) {
            s = getNextInputToken(b);
        }
        else {
            s = Keyboard.current_token;
            Keyboard.current_token = null;
        }
        return s;
    }
    
    private static String getNextInputToken(final boolean b) {
        String nextToken = null;
        try {
            if (Keyboard.reader == null) {
                Keyboard.reader = new StringTokenizer(Keyboard.in.readLine(), " \t\n\r\f", true);
            }
            while (nextToken == null || (" \t\n\r\f".indexOf(nextToken) >= 0 && b)) {
                while (!Keyboard.reader.hasMoreTokens()) {
                    Keyboard.reader = new StringTokenizer(Keyboard.in.readLine(), " \t\n\r\f", true);
                }
                nextToken = Keyboard.reader.nextToken();
            }
        }
        catch (Exception ex) {
            nextToken = null;
        }
        return nextToken;
    }
    
    public static boolean endOfLine() {
        return !Keyboard.reader.hasMoreTokens();
    }
    
    public static String readString() {
        String s;
        try {
            s = getNextToken(false);
            while (!endOfLine()) {
                s += getNextToken(false);
            }
        }
        catch (Exception ex) {
            error("Error reading String data, null value returned.");
            s = null;
        }
        return s;
    }
    
    public static String readWord() {
        String nextToken;
        try {
            nextToken = getNextToken();
        }
        catch (Exception ex) {
            error("Error reading String data, null value returned.");
            nextToken = null;
        }
        return nextToken;
    }
    
    public static boolean readBoolean() {
        final String nextToken = getNextToken();
        boolean b;
        try {
            if (nextToken.toLowerCase().equals("true")) {
                b = true;
            }
            else if (nextToken.toLowerCase().equals("false")) {
                b = false;
            }
            else {
                error("Error reading boolean data, false value returned.");
                b = false;
            }
        }
        catch (Exception ex) {
            error("Error reading boolean data, false value returned.");
            b = false;
        }
        return b;
    }
    
    public static char readChar() {
        final String nextToken = getNextToken(false);
        char char1;
        try {
            if (nextToken.length() > 1) {
                Keyboard.current_token = nextToken.substring(1, nextToken.length());
            }
            else {
                Keyboard.current_token = null;
            }
            char1 = nextToken.charAt(0);
        }
        catch (Exception ex) {
            error("Error reading char data, MIN_VALUE value returned.");
            char1 = '\0';
        }
        return char1;
    }
    
    public static int readInt() {
        final String nextToken = getNextToken();
        int int1;
        try {
            int1 = Integer.parseInt(nextToken);
        }
        catch (Exception ex) {
            error("Error reading int data, MIN_VALUE value returned.");
            int1 = Integer.MIN_VALUE;
        }
        return int1;
    }
    
    public static long readLong() {
        final String nextToken = getNextToken();
        long long1;
        try {
            long1 = Long.parseLong(nextToken);
        }
        catch (Exception ex) {
            error("Error reading long data, MIN_VALUE value returned.");
            long1 = Long.MIN_VALUE;
        }
        return long1;
    }
    
    public static float readFloat() {
        final String nextToken = getNextToken();
        float floatValue;
        try {
            floatValue = new Float(nextToken);
        }
        catch (Exception ex) {
            error("Error reading float data, NaN value returned.");
            floatValue = Float.NaN;
        }
        return floatValue;
    }
    
    public static double readDouble() {
        final String nextToken = getNextToken();
        double doubleValue;
        try {
            doubleValue = new Double(nextToken);
        }
        catch (Exception ex) {
            error("Error reading double data, NaN value returned.");
            doubleValue = Double.NaN;
        }
        return doubleValue;
    }
    
    static {
        Keyboard.printErrors = true;
        Keyboard.errorCount = 0;
        Keyboard.current_token = null;
        Keyboard.in = new BufferedReader(new InputStreamReader(System.in));
    }
}
