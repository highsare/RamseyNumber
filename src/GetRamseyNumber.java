import java.util.ArrayList;

//���� �ѹ��� ���������� ����ϴ� Ŭ�����̴�.
public class GetRamseyNumber {
	
	public GetRamseyNumber() {
		super();
	}
	
	//a >= 3 and b >= 3
	public GetRamseyNumber(int r, int s) {
		super();
		if (r < 3 || s < 3) {
			System.out.println("Wrong Number");
			System.exit(0);
		}
		isSatisfied(makeGraph());
	}
	
	private ArrayList<Edge> makeGraph() {
		
		Point p1 = null;
		Point p2 = null;
		ArrayList<Edge> graph = null;
		
		
		//i�� �׷����� ���� �����̴�.
		//p1.pNo = j
		//p2.pNo = k
		for (int i = 3; i < 11; i++) {
			//length�� i-th ���� �׷����� ���� Edge�� �����̴�.
			int length = (( i * (i-1) ) / 2);
			
			//num�� i-th ���� �׷����� Edge�� ���� ĥ�ϰų� ĥ���� �ʴ� ��� ���� �ٸ� �׷����� ����� ���̴�.
			for (int num = 1; num < Math.pow(2, length); num++) {
				int count = 0;
				ArrayList<String> binaryList = MakeBinaryCode.makeCode(length,num);
				for (int j = 1; j < i-1; j++) {			
					for (int k = j+1; k < i; k++) {
						p1.setpNo(j);
						p2.setpNo(k);
						if (binaryList.get(count).equals("0")) {
							graph.add(new Edge(p1,p2,false));							
						} else {
							graph.add(new Edge(p1,p2,true));
						}
						count++;
					}
				}
			} //1���� �׷����� �����´�
		}
		return graph;
	}
	
	private boolean isSatisfied(ArrayList<Edge> list) {
		Point p1 = null;
		Point p2 = null;
		Point p3 = null;
		for (Edge edge : list) {
			
		}
		
		return false;
	}
	
	
}
