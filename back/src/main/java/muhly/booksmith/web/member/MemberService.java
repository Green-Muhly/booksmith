package muhly.booksmith.web.member;

import lombok.RequiredArgsConstructor;
import muhly.booksmith.domain.member.Member;
import muhly.booksmith.domain.member.MemberRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


@Transactional
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public Long join(Member member) {
        memberRepository.save(member);
        return member.getId();
    }

    public Boolean validateDuplicateMember(String id) {
        Optional<Member> findMembers = memberRepository.findByLoginId(id);
        if (findMembers.isEmpty()) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Member findOne(Long memberId) {
        return memberRepository.findById(memberId).orElseThrow(() -> new NoSuchElementException("id가 존재하지 않습니다."));
    }

}
