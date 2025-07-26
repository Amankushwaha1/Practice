package DesignPatterns.Creational.ObjectPool;

import DesignPatterns.Creational.Singleton.SynchronizedLoading;

import java.util.ArrayList;
import java.util.List;

public class HttpConnPool {
    int DEFAULT_POOL_SIZE = 2;
    int MAX_POOL_SIZE = 24;

    private static List<HttpConnection> freeConnList = new ArrayList<>();
    private static List<HttpConnection> OccupiedConnList = new ArrayList<>();

    private static HttpConnPool connpoolinstance = new HttpConnPool();

    private HttpConnPool() {
        for (int i = 0; i < DEFAULT_POOL_SIZE; i++) {
            freeConnList.add(new HttpConnection("Google.com"));
        }
    }

    public synchronized void getConnection(String url) throws OutOfResourceCapacityException {
        if(!freeConnList.isEmpty()) {
            HttpConnection freeConn = freeConnList.remove(freeConnList.size()-1);
            freeConn.setConnectionUrl(url);
            OccupiedConnList.add(freeConn);
        }
        else {
            if(!OccupiedConnList.isEmpty() && OccupiedConnList.size() < MAX_POOL_SIZE) {
                HttpConnection newConn = new HttpConnection(url);
                OccupiedConnList.add(newConn);
            }
            else {
                throw new OutOfResourceCapacityException();
            }
        }
        printCapacity();
    }

    public synchronized void  releaseConnection(String url) {
       HttpConnection connection =  OccupiedConnList.stream().filter(conn -> conn.getConnectionUrl().equals(url)).findFirst().orElse(null);
       if(connection != null) {
           OccupiedConnList.remove(connection);
           freeConnList.add(connection);
       }
       printCapacity();
    }

    private void printCapacity(){
        System.out.println("No of idle Connections ->"+freeConnList.size());
        System.out.println("Total Occupied Connections ->"+OccupiedConnList.size());
    }

    public static HttpConnPool getConnpoolinstance() {
        if(connpoolinstance == null) {
            synchronized (HttpConnPool.class){
                if(connpoolinstance == null) {
                    connpoolinstance = new HttpConnPool();
                }
            }
        }
         return connpoolinstance;
    }
}
