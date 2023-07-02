package nus.iss.oracletestspringbe;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/FibonacciSequence")
public class FibonacciController {
    @GetMapping("/{n}")
    public ResponseEntity<Saying> getFibonacci(@PathVariable Integer n) throws Exception {
        Double n1 = 1.0;
        Double n2 = 1.0;
        Double cur = 0.0;
        List<Double> fib = new ArrayList<>();
        List<Double> sorted = new ArrayList<>();

        if (n == 1) {
            fib.add(0.0);
            fib.add(n1);
            sorted = fib;
            Saying saying = new Saying(fib,sorted);
            return new ResponseEntity<>(saying,HttpStatus.OK);
        }

        if (n == 2) {
            fib.add(0.0);
            fib.add(n1);
            fib.add(n2);
            sorted= fib;
            Saying saying = new Saying(fib,sorted);
            return new ResponseEntity<>(saying,HttpStatus.OK);
        }
        if (n > 2) {
            fib.add(0.0);
            fib.add(n1);
            fib.add(n2);
            for (int i = 2; i <n; i++) {
                cur = n1 + n2;
                n1 = n2;
                n2 = cur;
                fib.add(cur);
            }
            for (int k=n;k>=0;k--)
            {
                if (fib.get(k)%2 == 0)
                    sorted.add(fib.get(k));
            }
            for (int k=n;k>=0;k--)
            {
                if (fib.get(k)%2 != 0)
                    sorted.add(fib.get(k));
            }
            Saying saying = new Saying(fib,sorted);
            return new ResponseEntity<>(saying,HttpStatus.OK);
        }
        Saying saying = new Saying(fib,sorted);
        return new ResponseEntity<>(saying,HttpStatus.OK);
    }
}
