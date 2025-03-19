# Anonym
- **링크** - [Anonym - 직장인 익명 커뮤니티](http://52.79.242.234:8080/Anonym/index.jsp) / **ppt** - 
- 관리자 - ID: admin / PW: admin
- 개인회원 1(무직) - ID: unemployed / PW: qq11!!  
- 개인회원 2(재직) - ID: ezenman / PW: qq11!!
- 기업회원 1 - ID: ezen / PW: qq11!!

<br>

## 프로젝트 소개
직장인뿐만 아니라 다양한 그룹에 속한 사용자들이 자유롭게 소통할 수 있는 익명 커뮤니티를 제공하는 것을 목표로 합니다.

<br>

## 개발 기간
2024.10.14 - 2024.11.13

<br>
  
## 멤버 구성
- 팀장 전동훈 - 채용공고, 기업서비스, 주소 API 적용, 스마트 에디터 적용
- 팀원 김가원 - 회원가입, 로그인, 마이페이지(개인, 기업, 관리자)
- **팀원 유다현 - 자유게시판, 기업리뷰, 좋아요/신고 기능, 주소 API 적용**

<br>

## 개발 환경
- `java 13`
- `jdk 13.0.2`
- **IDE** : Eclipse
- **Database** : MySQL
  
<br>

## 주요 기능

### <인덱스>
![인덱스](https://github.com/user-attachments/assets/08db223c-d979-4fca-98c9-0a8564ad3219)

1. 인덱스 페이지로 이동
2. 메뉴 목록
3. 로그인 / 회원가입
4. 전체 검색 기능
5. 자유게시판 조회수 상위 8개 게시글 표시
6. 채용공고 조회수 상위 8개 게시글 표시

<br><br>

### <주소 API 적용>
![기업회원](https://github.com/user-attachments/assets/5904c051-592f-4abb-81de-e20b310b554f)
![기업](https://github.com/user-attachments/assets/cd68d8d9-6a9e-47d0-ae80-2164aac86ecf)
![기업2](https://github.com/user-attachments/assets/5da5733b-26b1-43b0-a6d4-e8ed39ef6f8a)
![주소3](https://github.com/user-attachments/assets/704f11a7-57e4-48cf-92ae-c29293cd935c)

카카오 주소 API를 활용하여 회원가입 시 주소 저장

<br><br>

### <자유게시판>
- #### 글목록
![자유게시판](https://github.com/user-attachments/assets/4d70310c-7c03-4879-b7ed-702094fa3b43)

1. 로그인 시 글쓰기 가능
2. 자유게시판 글 검색
3. 최신순으로 게시글 표시 

<br><br>

- #### 글등록
![글등록](https://github.com/user-attachments/assets/4d961635-dfa4-4aa7-b06e-959e1180c7b8)

스마트 에디터를 적용하여 텍스트 편집 기능을 강화하고, 이미지 및 멀티미디어 삽입을 지원함으로써 사용자 경험(UX)을 향상

<br><br>

- #### 글조회
![자유게시판글2](https://github.com/user-attachments/assets/b404bd8c-96fa-4df5-b936-c70da601bd42)

1. 글 작성자가 클릭하면 수정 및 삭제 메뉴가 표시 / 타 회원이 클릭하면 신고 메뉴가 표시
2. 인기글 표시
3. 좋아요 기능
4. 댓글 기능

<br><br>

- #### 글수정
![글수정](https://github.com/user-attachments/assets/4bfb6508-0e59-48c0-91b1-b0452e97c6bd)

글 수정 시, 제목과 내용을 불러옴

<br><br>

### <기업리뷰>
- #### 회사 검색
![기업리뷰](https://github.com/user-attachments/assets/0c839859-2b3a-4c30-a09d-0f78d8052251)

https://github.com/user-attachments/assets/3301a577-7d79-4603-9c8a-0223cf868c63
입력한 단어가 포함된 회사 목록 표시

<br><br>

- #### 회사 정보
![기업커4](https://github.com/user-attachments/assets/76900910-ca63-4499-a947-28c93ce9d87f)

1. 기업회원이 회원가입시 입력한 정보
2. 기업리뷰 게시글 1개 표시
3. 기업커뮤니티 게시글 1개 표시

![비회원정보](https://github.com/user-attachments/assets/c1c0a3ec-7281-4b80-a298-90ecfc10cc31)

비회원이거나 재직중인 회사가 아닐 경우 커뮤니티 메뉴와 글은 숨겨짐

<br><br>

- #### 회사 리뷰
![회원리뷰](https://github.com/user-attachments/assets/463ca759-91a9-4ddc-becc-8585916a0817)

회원일 경우 모든 리뷰 표시

<br><br>

![비회원리뷰](https://github.com/user-attachments/assets/67ab69b1-523d-44d7-9955-1f2ded22648a)

비회원일 경우 1개의 리뷰만 표시

<br><br>

- #### 회사 커뮤니티(재직자만 이용 가능)
![image](https://github.com/user-attachments/assets/385984b9-b9cb-45ce-a72b-c7e4908faad2)

1. 커뮤니티 글 검색
2. 최신순으로 게시글 표시

<br><br>
   
![기업커3](https://github.com/user-attachments/assets/8a130593-f6f4-42a3-9b83-dac45d315213)

1. 글 작성자가 클릭하면 수정 및 삭제 메뉴가 표시 / 타 회원이 클릭하면 신고 메뉴가 표시
2. 좋아요 기능
3. 댓글 기능

<br>
