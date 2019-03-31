package top.zcrpro.blog.service;


import top.zcrpro.blog.domain.Vote;

public interface VoteService {

	Vote getVoteById(Long id);

	void removeVote(Long id);
}
