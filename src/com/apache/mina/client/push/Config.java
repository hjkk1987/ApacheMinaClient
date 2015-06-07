package com.apache.mina.client.push;

/**
 * Created by neal on 2014/12/2.
 */
public class Config {
	/**
	 * ��������ַ
	 */
	public static final String HOSTNAME = "192.168.1.101";
	/**
	 * �������˿ں�
	 */
	public static final int PORT = 60034;
	/**
	 * ���ӳ�ʱʱ�䣬30 seconds
	 */
	public static final long SOCKET_CONNECT_TIMEOUT = 30 * 1000L;
	/**
	 * ����������������Ƶ�ʣ�10 seconds
	 */
	public static final int KEEP_ALIVE_TIME_INTERVAL = 10;
	/**
	 * ������������Ӧ��ʱ
	 */
	public static final int KEEP_ALIVE_RESPONSE_TIMEOUT = 5;
	/**
	 * ������ ping message
	 */
	public static final String PING_MESSAGE = "ping";
	/**
	 * ������ pong message
	 */
	public static final String PONG_MESSAGE = "pong";

}
