## SpringBoot를 활용한 간단한 회원 프로젝트
### 버전
- intellij IDEA 2023.1.1
- MySQL 8.0.34
- java version 20
- mysql-connector-j 8.0.33
### 과정
- 기본 페이지 요청하기
- 회원가입 페이지 요청 및 생성하기
- 회원 정보 출력하기
- DB연동 후 회원 테이블 생성하기
- 로그인 기능 추가하기
- 회원 목록 출력하기

-----
### ✅ 오류 해결 과정
- DB 연동 오류
  - 라이브러리에 jar 파일을 추가하지 않아서 jdbc 연동 오류 발생
  - jar을 추가하였지만 새로 발생한 오류는 MySQLDialect 버전 관련 오류였다. MySQL 8.0.1 이상에서는 MySQLDialect로 사용하고 버전명을 기입하지 않는다는 것을 확인했고 수정하니 오류가 해결됐다.