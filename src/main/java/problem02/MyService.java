package problem02;

public class MyService extends BaseService {

	public void service(String state) {
		String result = state.equals("오후") ? afternoon() : state.equals("낮") ? day() : night();
		System.out.println(result);
	}
	public String day() {
		return "낮서비스시작";
	}
	public String night() {
		return "밤서비스시작";
	}
	public String afternoon() {
		return "오후서비스시작";
	}
}
