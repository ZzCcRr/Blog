/*
package top.zcrpro.blog.repository.es;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;
import top.zcrpro.blog.domain.es.EsBlog;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EsBlogRepositoryTests {

    @Autowired
    private EsBlogRepository esBlogRepository;

    @Before
    public void initRepository(){
        esBlogRepository.deleteAll();

        esBlogRepository.save(new EsBlog("balabla","zcrlalal","content lalalalal"));
        esBlogRepository.save(new EsBlog("hhhhhh","zcrhhhhh","content hhhhhhh"));
        esBlogRepository.save(new EsBlog("aaaaa","zcraaaa","content aaaaaa"));
    }

    @Test
    public void contextLoads() {
        Pageable pageable = new PageRequest(0,20);
        String title = "la";
        String summary = "zcrla";
        String content = "contentla";
        Page<EsBlog> page = esBlogRepository.findDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContaining(title,summary,content,pageable);
        page.getTotalElements();
        for(EsBlog esBlog:page.getContent()){
            System.out.println(esBlog.toString());
        }
    }

}
*/
