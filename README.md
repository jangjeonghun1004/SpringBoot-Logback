로깅(logging)이란?
  애플리케이션이 동작하는 동안 시스템의 상태나 동작 정보를 시간순으로 기록하는 것을 의미합니다.
  "Logback"은 이러한 "logging"을 사용하기 편리하게 구현한 라이브러리입니다.

Logback
  - https://www.slf4j.org
  - "Logback"의 경우 "spring-boot-starter-web" 라이브러리 내부에 내장되어 있어 별도의 의존성을 추가하지 않아도 사용할 수 있습니다.
  - "@Slf4j"(SLF4J, Simple Logging Facade for Java)을 사용하기 위해서는 "lombok"을 추가해야합니다.

Logback의 로그 레벨
  - ERROR: 로직 수행 중에 시스템에 심각한 문제가 발생해서 애플리케이션의 동작이 불가능 한 경우
  - WARN: 시스템 에러의 원인이 될 수 있는 경고 레벨
  - INFO: 애플리케이션의 상태 변경과 같은 정보 전달
  - DEBUG: 애플리케이션의 디버깅을 위한 메세지를 표시
  - TRACE: "DEBUG" 레벨보다 더 상세한 메세지를 표시

설정.xml
  - 자바 또는 스프링 프로젝트 = logback.xml 로 설정
  - 스프링 부트 = logback-spring.xml

Appender
  로그의 형태 및 출력 방식 설정
  - ConsoleAppender: 콘솔에 로그를 출력
  - FileAppender: 파일에 로그를 작성
  - RollingFileAppender: 여러개의 파일을 순회하면서 로그를 작성
  - SMTPAppender: 메일로 로그를 전송
  - DBAppender: 데이터베이스에 로그를 저장

Root
  - Root 영역에서 Appender를 참조해서 로깅 레벨을 설정할 수 있다.
  - 패키지 단위로 로깅 레벨을 설정하고 싶다면 "<logger>" 태그를 활용하면 된다.


  
