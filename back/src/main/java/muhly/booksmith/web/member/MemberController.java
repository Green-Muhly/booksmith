package muhly.booksmith.web.member;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import muhly.booksmith.domain.member.Member;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/add")
    public ResponseEntity<String> save(@RequestBody @Valid CreateMemberRequest request) {
        Member member = new Member();
        member.setLoginId(request.loginId);
        member.setName(request.name);
        member.setPassword(request.password);
        memberService.join(member);
        return new ResponseEntity<>("SUCCESS", HttpStatus.ACCEPTED);
        // TODO: 2021-09-26 중복검증하기
    }

    @PostMapping("/duplicate")
    public ResponseEntity<String> validateDuplicate(@RequestParam(value = "loginId") String LoginId) {
        Boolean result = memberService.validateDuplicateMember(LoginId);
        if (result) {
            return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("FAILED", HttpStatus.NOT_FOUND);
        }
    }

    @Data
    static class CreateMemberRequest {
        @NotEmpty
        private String loginId;
        @NotEmpty
        private String name;
        @NotEmpty
        private String password;
    }

//    TODO: 2021-09-08
//    @PostMapping("/findId")
//    public ResponseEntity<String> findByName(@RequestBody String name) {
//        Member findMember = memberService.findByLoginId(id);
//        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
//    }
}
