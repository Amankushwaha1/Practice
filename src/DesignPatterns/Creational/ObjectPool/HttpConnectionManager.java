package DesignPatterns.Creational.ObjectPool;

public class HttpConnectionManager {


    public static void main (String[] args)  {
        HttpConnPool connPool = HttpConnPool.getConnpoolinstance();

        try {
            connPool.getConnection("Oracle.com");
            connPool.getConnection("com.bny.com");
            connPool.getConnection("com.wintwealth.com");
            connPool.releaseConnection("Oracle.com");
            connPool.getConnection("com.muthutootfincorp.com");
            connPool.getConnection("com.bny.com");
            connPool.getConnection("com.wintwealth.com");

            connPool.getConnection("com.wintwealth.com");
            connPool.getConnection("com.wintwealth.com");




        }catch(Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}
