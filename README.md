# oracletestspring

A.How to work in a team with people who come from IT related professions

1. Strive to become friends: Building strong interpersonal relationships is crucial. By fostering friendships and a supportive atmosphere, we can create a work environment that promotes collaboration and mutual assistance. Trust and respect among team members enhance communication and productivity.

2. Respect others' code and efforts: Valuing and respecting the code and efforts of team members is essential. When encountering code that may be difficult to understand, I believe it is important not to hastily make changes. Instead, I will make an effort to understand it thoroughly. Investing time and effort into comprehending others' code cultivates a culture of respect and collaboration.

3. Embrace rapid learning and self-study: Continuously learning and engaging in self-study is crucial for understanding the technical expressions of others. By actively seeking knowledge and gaining a comprehensive understanding of various domains, I aim to contribute meaningfully to discussions and projects.

4. Foster independent problem-solving: When faced with challenges, my initial approach is to attempt to solve the problem independently using resources like Google or self-study, rather than seeking immediate assistance for simple questions. However, if the problem persists or requires teamwork, timely and effective communication is vital.

B.Validation simple example:
public class
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
Student {
@Size(min=3, max=20, 
message = "username must be 3-20 characters")
private String username;
@Size(min=6, 
message = "password must be at least 6 characters")
private String password;
public User() {}

@PostMapping("/studentlogin")
public String handleLogin(
@Valid @ModelAttribute("student") Student student, 
BindingResult bindingResult) 
{
if (bindingResult.hasErrors()) {
return "login";
}
if (!UserService.authenticate(
inUser.getUsername(), inUser.getPassword())) {
return "login";
}
// authenticate successfully, redirect to next page
return "redirect:/protected/studentInfomation";
}


