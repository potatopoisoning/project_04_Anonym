# Anonym
- **링크** - [Anonym - 직장인 익명 커뮤니티](http://13.124.213.24:8080/Anonym/index.jsp) / **ppt** - [AWS_1차](https://github.com/user-attachments/files/19360680/_AWS_1.pdf)

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
![1](https://github.com/user-attachments/assets/364e5ffc-46d8-43cd-819f-33bd8b684404)


1. 인덱스 페이지로 이동
2. 메뉴 목록
3. 로그인 / 회원가입
4. 전체 검색 기능
5. 자유게시판 조회수 상위 8개 게시글 표시
6. 채용공고 조회수 상위 8개 게시글 표시

<br><br>

### <주소 API 적용>
![2](https://github.com/user-attachments/assets/13b99c7e-7e82-4bba-b9aa-34f225fce009)


카카오 주소 API를 활용하여 회원가입 시 주소 저장

<br><br>

### <자유게시판>
- #### 글목록
![3](https://github.com/user-attachments/assets/a400789e-953e-450f-bfd5-c4b9f7288ef9)

1. 로그인 시 글쓰기 가능
2. 자유게시판 글 검색
3. 최신순으로 게시글 표시 

<br><br>

- #### 글등록
![4](https://github.com/user-attachments/assets/87268f96-7c2b-4843-8068-c9aca5b5abcf)

스마트 에디터를 적용하여 텍스트 편집 기능을 강화하고, 이미지 및 멀티미디어 삽입을 지원함으로써 사용자 경험(UX)을 향상

<br><br>

- #### 글조회
![5](https://github.com/user-attachments/assets/b006bacb-3d11-4884-a893-6b26b4ec86da)


1. 글 작성자가 클릭하면 수정 및 삭제 메뉴가 표시 / 타 회원이 클릭하면 신고 메뉴가 표시
2. 인기글 표시
3. 좋아요 기능
4. 댓글 기능

<br><br>

- #### 글수정
![6](https://github.com/user-attachments/assets/e8de5b9b-8b58-4144-895c-5fc264945f15)

글 수정 시, 제목과 내용을 불러옴

<br><br>

### <기업리뷰>
- #### 회사 검색
![7](https://github.com/user-attachments/assets/b1bfa62c-8cd9-4a2d-a990-e83059d9b64e)
![2025-03-20 16 09 25](https://github.com/user-attachments/assets/0b0cefba-183a-4653-877c-e410a898951d)

1. 입력한 단어가 포함된 회사 목록 표시
2. 좋아요/싫어요 참여수 상위 9개 회사 표시 

<br><br>

- #### 회사 정보
![8](https://github.com/user-attachments/assets/35d5620c-8911-4d22-b285-4a275822dd1b)

1. 기업회원이 회원가입시 입력한 정보
2. 기업리뷰 게시글 1개 표시
3. 기업커뮤니티 게시글 1개 표시

<br><br>

![9](https://github.com/user-attachments/assets/45f26e9b-4ae2-44b9-a1b5-858b50d8cb14)

비회원이거나 재직중인 회사가 아닐 경우 커뮤니티 메뉴와 글은 숨겨짐

<br><br>

- #### 회사 리뷰
![10](https://github.com/user-attachments/assets/f6a24202-bc1b-4bfd-9eea-be926349081b)
1. 재직회사만 리뷰 등록 가능
2. 회원일 경우 모든 리뷰 표시

<br><br>

![11](https://github.com/user-attachments/assets/92b4820d-530f-48e0-ab06-546c55a157cd)

비회원일 경우 1개의 리뷰만 표시

<br><br>

- #### 회사 커뮤니티(재직자만 이용 가능)
![12](https://github.com/user-attachments/assets/4d36e1cd-2892-4b1a-a081-5afe0aec92e4)

1. 커뮤니티 글 검색
2. 최신순으로 게시글 표시
3. 자유로운 글쓰기 가능

<br><br>
   
![13](https://github.com/user-attachments/assets/0013d73e-1c3c-4620-bffc-591fe4292fad)

1. 글 작성자가 클릭하면 수정 및 삭제 메뉴가 표시 / 타 회원이 클릭하면 신고 메뉴가 표시
2. 좋아요 기능
3. 댓글 기능

<br>
