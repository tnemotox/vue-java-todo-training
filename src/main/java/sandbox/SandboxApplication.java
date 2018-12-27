package sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * アプリケーションを起動するクラスです。
 *
 * @author t.nemoto.x
 */
@SpringBootApplication
public class SandboxApplication extends SpringBootServletInitializer {

    /**
     * アプリケーションを起動する。
     *
     * @param args 引数
     */
    public static void main(String[] args) {
        SpringApplication.run(SandboxApplication.class, args);
    }
}