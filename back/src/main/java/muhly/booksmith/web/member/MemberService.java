package muhly.booksmith.web.member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import muhly.booksmith.domain.member.Member;
import muhly.booksmith.domain.member.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class MemberService {
    private final MemberRepository memberRepository;

    public Long join(Member member) {
        memberRepository.save(member);
        return member.getId();
    }

    public Boolean validateDuplicateMember(String id) {
        log.info(id);
        Optional<Member> findMembers = memberRepository.findByLoginId(id);
        log.info(findMembers.toString());
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

    public Member findByLoginId(String LoginId) {
        Optional<Member> findMember = memberRepository.findByLoginId(LoginId);
        return findMember.orElseThrow(() -> new NoSuchElementException("존재하지 않는 회원입니다."));
    }


}
