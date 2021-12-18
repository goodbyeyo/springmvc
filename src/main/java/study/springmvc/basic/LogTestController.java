package study.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

//        System.out.println("name = " + name);

//        log.trace("trace log=" + name); // 문자 더하기 연산이 발생하고나서 로그레벨 판단한다 즉 의미없는 연산 발생
        log.trace("trace log={}", name);  // 파라미터로 넘기면 메서드로 출력 여부만 판단
        log.debug("debug log={}", name);
        log.info("info log ={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        /**
         * 로그 사용시 장점
         * 쓰레드 정보, 클래스 이름 같은 부가 정보를 함께 볼 수 있고, 출력 모양을 조정 할 수 있다.
         * 로그 레벨에 따라 개밸 서버에서는 모든 로그를 출력하고 운영서버에서는 출력하지 않는 등 로그를 상황에 맞게 조절할수 있다
         * 시스템 아웃 콘솔에만 출력하는 것이 아니라, 파일이나 네트워크 등, 로그를 별도의 위치에 남길 수 있다
         * 특히 파일로 남길 때는 일별, 특정 용량에 따라 로그를 분할하는 것도 가능하다.
         * 성능도 일반 System.out보다 좋다(내부 버퍼링, 멀티 쓰레드 등등)
         * 그래서 실무에서는 꼭 로그를 사용해야 한다.
         */

        return "ok";
    }
}
