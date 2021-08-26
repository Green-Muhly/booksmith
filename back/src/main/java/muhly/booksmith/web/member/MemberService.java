package muhly.booksmith.web.member;

import muhly.booksmith.domain.member.MemberRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
}
