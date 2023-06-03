# WhyNotGoCamp
SpringBoot+Mybatis+HTML5

## ✏️ Project 소개
Kakao Maps를 활용한 캠핑장 통합 검색 및 예약 서비스입니다.

## 🕰️ 개발기간

## ⚙️ 개발환경
- Windows 10
- MacOS
- Eclipse IDE
- sqldeveloper

## 💻 기술스택
- Java
- SpringBoot
- HTML5
- Oracle
- JavaScript
- jQuery
- CSS3

## 🔗 ERD
https://www.erdcloud.com/d/RzzcqNtFtderAQt76

## 프로젝트 팀원 역할 분담
|**이름**|**담당 업무**|
|-------|--------|
|현주성|SpringSecurity 적용<br>데이터 구조 설계<br>판매자 회원가입 및 로그인<br>판매자 메인 페이지<br>캠핑장 등록 페이지<br>캠핑장 QnA<br>캠핑장 예약관리|

## 🎓 주요 기능
### 이용자
회원 가입 및 로그인
- ID 중복 확인
- PWD 일치여부 확인

사이트 내 검색 기능
- 이름, 주소, 카테고리 중 알맞은 정보 자동 검색
- 검색창 아래에 태그 클릭만으로도 검색 가능

카카오맵 API를 활용한 지도 서비스

파이썬을 활용한 캠핑지 추천 서비스

### 판매자
회원가입 및 로그인
- ID 중복 확인
- PWD 일치여부 확인
- JavaMailSender를 활용한 이메일 인증
- 약관 동의 후 가입

판매자 메인 페이지
- FullCalendar API를 활용해 예약정보 출력
- 캠핑지가 등록되지 않았다면 헤더에 캠핑지 추가 아이콘 표시

캠핑지 등록
- ajax를 이용한 캠핑장 이름 중복체크
- 다음 카카오 API를 이용한 주소입력과 위도, 경도 정보 입력
- 세션에 저장한 1 단계 데이터와 세부사항 데이터를 합하여 DB에 저장

캠핑지 QnA

캠핑지 예약관리
- 승인 버튼 클릭시 ajax요청으로 예약 승인
- Page Helper를 적용하여 페이지 구분

캠핑지 상세정보 및 수정



