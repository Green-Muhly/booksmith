package muhly.booksmith.web.member;

import lombok.RequiredArgsConstructor;
import muhly.booksmith.domain.member.Member;
import muhly.booksmith.domain.member.MemberRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/add")
    public String addForm(@ModelAttribute("member") Member member) {
        return "members/addMemberForm";
    }

    @PostMapping("/add")
    public ResponseEntity<String> save(@Valid @ModelAttribute Member member, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>("FAILED", HttpStatus.BAD_REQUEST);
        }
        memberService.join(member);
        return new ResponseEntity<>("SUCCESS", HttpStatus.ACCEPTED);
    }

    @PostMapping("/duplicate")
    public ResponseEntity<String> validateDuplicate(@RequestBody String id) {
        Boolean result = memberService.validateDuplicateMember(id);
        if (result) {
            return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("FAILED", HttpStatus.NOT_FOUND);
        }

    }
}
