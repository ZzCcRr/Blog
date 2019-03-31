package top.zcrpro.blog.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zcrpro.blog.domain.Vote;
import top.zcrpro.blog.repository.VoteRepository;

import javax.transaction.Transactional;

@Service
public class VoteServiceImpl implements VoteService {

	@Autowired
	private VoteRepository voteRepository;

	@Override
	@Transactional
	public void removeVote(Long id) {
		voteRepository.delete(id);
	}
	@Override
	public Vote getVoteById(Long id) {
		return voteRepository.findOne(id);
	}

}
