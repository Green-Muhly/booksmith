package muhly.booksmith.domain.member;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@Transactional
class MemberRepositoryImplTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    void save() {
        //given
        Member member = new Member();
        member.setName("Booksmith");
        member.setLoginId("BS12");
        member.setPassword("qwer1234");

        //when
        Member saveMember = memberRepository.save(member);

        //then
        assertThat(member.getName()).isEqualTo(saveMember.getName());
    }
}