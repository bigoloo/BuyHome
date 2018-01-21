package com.bigoloo.finance.home.domain.intractor

import com.bigoloo.finance.home.domain.entity.Home
import com.bigoloo.finance.home.domain.repository.HomeRepository
import easymvp.executer.PostExecutionThread
import easymvp.executer.UseCaseExecutor
import easymvp.usecase.SingleUseCase
import io.reactivex.Single

/**
 * Created by Amin Bahiraei (mr.bahiraee@gmail.com) at  1/18/18.
 */
class GetHomeData constructor(useCaseExecutor: UseCaseExecutor,
                              postExecutionThread: PostExecutionThread,
                              private val homeRepository: HomeRepository) : SingleUseCase<List<Home>, Void>(
        useCaseExecutor, postExecutionThread) {
    override fun interact(
            param: Void?): Single<List<Home>> = homeRepository.getAll()
}