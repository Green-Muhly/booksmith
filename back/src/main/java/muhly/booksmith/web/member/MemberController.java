package muhly.booksmith.web.member;

import lombok.RequiredArgsConstructor;
import muhly.booksmith.domain.member.Member;
import muhly.booksmith.domain.member.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

    private final MemberRepository memberRepository;

    @GetMapping("/add")
    public String addForm(@ModelAttribute("member")Member member) {
        return "members/addMemberForm";
    }
}
