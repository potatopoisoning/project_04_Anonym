package teamproject.vo;

//�Խñ� �Ű�
public class ComplaintVO 
{

	private String post_complaint_no;                // ��ȣ
	private String post_complaint_reason;            // �Ű����
	private String post_complaint_reason_other;      // ��Ÿ�Ű����
	private String post_complaint_registration_date; // �����
	private String post_complaint_registration_ip;   // ��� ip
	private String post_complaint_registration_user; // ���ȸ��
	private String post_complaint_modify_date;       // ��������
	private String post_complaint_modify_ip;         // ���� ip
	private String post_complaint_modify_user;       // ����ȸ��
	private String post_no;                          // �Խù���ȣ
	private String user_no;                          // ȸ����ȣ
	/*������*/
    private String post_complaint_state;
    private String post_complaint_state2;
    private String post_content;
    private String user_id;
    private String user_state;
    private String board_no;                          
    private String company_no;                           
	
   
	public String getPost_complaint_no()                { return post_complaint_no;                }
	public String getPost_complaint_reason()            { return post_complaint_reason;            }
	public String getPost_complaint_reason_other()      { return post_complaint_reason_other;      }
	public String getPost_complaint_registration_date() { return post_complaint_registration_date; }
	public String getPost_complaint_registration_ip()   { return post_complaint_registration_ip;   }
	public String getPost_complaint_registration_user() { return post_complaint_registration_user; }
	public String getPost_complaint_modify_date()       { return post_complaint_modify_date;       }
	public String getPost_complaint_modify_ip()         { return post_complaint_modify_ip;         }
	public String getPost_complaint_modify_user()       { return post_complaint_modify_user;       }
	public String getPost_no()                          { return post_no;                          }
	public String getUser_no()                          { return user_no;                          }
	/*������*/
	public String getPost_complaint_state()             { return post_complaint_state;             }
	public String getPost_complaint_state2()            { return post_complaint_state2;            }
	public String getPost_content()                     { return post_content;                     }
	public String getUser_id()                          { return user_id;                          }
	public String getUser_state()                       { return user_state;                       }
	public String getBoard_no()                         { return board_no;                         }
	public String getCompany_no()                       { return company_no;                          }
	
	public void setPost_complaint_no(String post_complaint_no)                               { this.post_complaint_no = post_complaint_no;                               }
	public void setPost_complaint_reason(String post_complaint_reason)                       { this.post_complaint_reason = post_complaint_reason;                       }
	public void setPost_complaint_reason_other(String post_complaint_reason_other)           { this.post_complaint_reason_other = post_complaint_reason_other;           }
	public void setPost_complaint_registration_date(String post_complaint_registration_date) { this.post_complaint_registration_date = post_complaint_registration_date; }
	public void setPost_complaint_registration_ip(String post_complaint_registration_ip)     { this.post_complaint_registration_ip = post_complaint_registration_ip;     }
	public void setPost_complaint_registration_user(String post_complaint_registration_user) { this.post_complaint_registration_user = post_complaint_registration_user; }
	public void setPost_complaint_modify_date(String post_complaint_modify_date)             { this.post_complaint_modify_date = post_complaint_modify_date;             }
	public void setPost_complaint_modify_ip(String post_complaint_modify_ip)                 { this.post_complaint_modify_ip = post_complaint_modify_ip;                 }
	public void setPost_complaint_modify_user(String post_complaint_modify_user)             { this.post_complaint_modify_user = post_complaint_modify_user;             }
	public void setPost_no(String post_no)                                                   { this.post_no = post_no;                                                   }
	public void setUser_no(String user_no)                                                   { this.user_no = user_no;                                                   }
	/*������*/
	public void setPost_complaint_state(String post_complaint_state)                         { this.post_complaint_state = post_complaint_state;                         }
	public void setPost_complaint_state2(String post_complaint_state2)                       { this.post_complaint_state2 = post_complaint_state2;                       }
	public void setPost_content(String post_content)                                         { this.post_content = post_content;                                         }
	public void setUser_id(String user_id)                                                   { this.user_id = user_id;                                                   }
	public void setUser_state(String user_state)                                             { this.user_state = user_state;                                             }
	public void setBoard_no(String board_no)                                                 { this.board_no = board_no;                                                 }
	public void setCompany_no(String company_no)                                             { this.company_no = company_no;                                           }
}
