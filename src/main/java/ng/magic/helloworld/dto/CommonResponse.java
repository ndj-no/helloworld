package ng.magic.helloworld.dto;

import java.time.LocalDateTime;

public class CommonResponse<T> {

	private T data;

	private String message;

	private LocalDateTime time;

	public CommonResponse() {
	}

	public CommonResponse(T data) {
		this.data = data;
		this.message = "Success";
		this.time = LocalDateTime.now();
	}

	public CommonResponse(T data, String message, LocalDateTime time) {
		this.data = data;
		this.message = message;
		this.time = time;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}
}
