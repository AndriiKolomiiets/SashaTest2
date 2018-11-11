package Exceptions;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

public class ExceptionStudying {

    public static void main(String[] args) {

        try {
            System.out.println(0);
            throw new RuntimeException();
        } catch (NullPointerException e) {
            System.out.println(1);
        } catch (RuntimeException e) {
            System.out.println(2);
        } catch (Exception e) {
            System.out.println(3);
        } finally {
            System.out.println(4);
        }
        System.out.println(5);
    }
}
