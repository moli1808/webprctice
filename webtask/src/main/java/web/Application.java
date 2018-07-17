package web;

<<<<<<< HEAD
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
=======
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
>>>>>>> 915f1cab42d2ae26643f10d1287acf9941ebcb32

@SpringBootApplication
public class Application {
    public static void main(String[] args){
<<<<<<< HEAD

        SpringApplication.run(Application.class, args);
    }


    @Bean
    public CommandLineRunner demo(IntentRepository repository){
        return (args) -> {
            //save
            ArrayList list = new ArrayList();
            repository.save(new Intent(list));

        };
    }
}

=======
        SpringApplication.run(Application.class, args);
    }
}
>>>>>>> 915f1cab42d2ae26643f10d1287acf9941ebcb32
