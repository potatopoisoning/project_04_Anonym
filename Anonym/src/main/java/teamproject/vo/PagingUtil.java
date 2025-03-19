package teamproject.vo;

public class PagingUtil 
{
	// * : �ܺο��� �޾ƿ� ���꿡 �ʿ��� �����͸� ���� �ʵ�
	// * ���� : * �����͵��� Ȱ���ؼ� ����� ����� ���� �ʵ�
	private int nowPage;   // ���� ������ ��ȣ(*)
	private int startPage; // ���� ������ ��ȣ
	private int endPage;   // ���� ������ ��ȣ
	private int total;     // ��ü �Խñ� ��(*)
	private int perPage;   // �� �������� �Խñ� ����(*)
	private int lastPage;  // ���� ������ ��ȣ
	private int start;     // ���� �Խñ� ��ȣ
	private int end;       // ���� �Խñ� ��ȣ
	private int cntPage = 5;  // �� ���������� �������� ����¡ ��ȣ ����(*)
	
	public PagingUtil(){}
	public PagingUtil(int nowPage, int total, int perPage)
	{
		setNowPage(nowPage);
		setTotal(total);
		setPerPage(perPage);
		
		calcStartEnd(nowPage, perPage); // ���۹�ȣ �����ȣ ���� ��� ȣ��
		calcLastEnd(total, perPage); // ���� ������ ��ȣ ���� ��� ȣ��
		calcStartEndPage(nowPage, cntPage); 
	}
	
	// ����, ���� �Խñ� ��ȣ ���ϱ�
	public void calcStartEnd(int nowPage, int perPage)
	{
		int end = nowPage * perPage; // �Խñ� �����ȣ(oracle���� ���)
		/*
		  ���� ������ : 1 / �Խñ� ���� ���� : 5
		  �����ȣ : 1 * 5 = 5
		  ���۹�ȣ : �����ȣ - �Խñ� ���� ����(5 - 5 = 0);
		*/
		int start = end - perPage; // �Խñ� ���۹�ȣ (oracle���� ���)
		
		setEnd(end);
		setStart(start);
		
	}
	
	// ������ ��������ȣ ���ϱ�
	public void calcLastEnd(int total, int perPage)
	{
		// ��ü �Խñۿ��� �������� �Խñ� ���� ���� �Ǽ��� �ø�ó�� �� ���� ��ȯ.
		int lastPage = (int)Math.ceil((double)total/perPage);
		
		setLastPage(lastPage);
	}
	
	// ����, ���� ������ ���ϱ�
	// ���� ������ : 3 / ���� ������ ��ȣ : 1 / ���� ������ ��ȣ : 10
	// ���� ������ : 13 / ���� ������ ��ȣ : 11 / ���� ������ ��ȣ : 20
	public void calcStartEndPage(int nowPage, int cntPage) 
	{
		// ������������ 10�� �ڸ��� ���ؿ� +1�� �� �������� ���� ���������� ���ϱ� 
		endPage = (int)Math.ceil((double)nowPage / cntPage) * cntPage;
		
		startPage = endPage - cntPage + 1;

		if(endPage > lastPage)
		{
			endPage = lastPage;
		}
		
		setStartPage(startPage);
		setEndPage(endPage);
	}
	
	public int getNowPage()   { return nowPage;   }
	public int getStartPage() { return startPage; }
	public int getEndPage()   { return endPage;   }
	public int getTotal()     { return total;     }
	public int getPerPage()   { return perPage;   }
	public int getLastPage()  { return lastPage;  }
	public int getStart()     { return start;     }
	public int getEnd()       { return end;       }
	public int getCntPage()   { return cntPage;   }
	
	public void setNowPage(int nowPage)     { this.nowPage = nowPage;     }
	public void setStartPage(int startPage) { this.startPage = startPage; }
	public void setEndPage(int endPage)     { this.endPage = endPage;     }
	public void setTotal(int total)         { this.total = total;         }
	public void setPerPage(int perPage)     { this.perPage = perPage;     }
	public void setLastPage(int lastPage)   { this.lastPage = lastPage;   }
	public void setStart(int start)         { this.start = start;         }
	public void setEnd(int end)             { this.end = end;             }
	public void setCntPage(int cntPage)     { this.cntPage = cntPage;     }
}
