package com.spring.leaf.chat.command;

import java.util.ArrayList;
import java.util.List;

public class ChatRoomVO {

	int roomNumber;
	String roomName;
	String roomOwner;
	int roomOnlineCount;
	
	
	public ChatRoomVO() {}
	
	
	public ChatRoomVO(int roomNumber, String roomName) {
		super();
		this.roomNumber = roomNumber;
		this.roomName = roomName;
	}
	
	
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getRoomOwner() {
		return roomOwner;
	}
	public void setRoomOwner(String roomOwner) {
		this.roomOwner = roomOwner;
	}
	
	
	
	public int getRoomOnlineCount() {
		return roomOnlineCount;
	}


	public void setRoomOnlineCount(int roomOnlineCount) {
		this.roomOnlineCount = roomOnlineCount;
	}


	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", roomName=" + roomName + "]";
	}	
	
}
