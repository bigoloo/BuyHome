package com.bigoloo.finance.home.domain.intractor

import com.bigoloo.finance.home.domain.entity.Home
import com.bigoloo.finance.home.domain.repository.HomeRepository
import easymvp.executer.PostExecutionThread
import easymvp.executer.UseCaseExecutor
import easymvp.usecase.SingleUseCase
import io.reactivex.Single

/**
 * Created by Amin Bahiraei (mr.bahiraee@gmail.com) at  1/21/18.
 */
class AddHome constructor(useCaseExecutor: UseCaseExecutor,
                          postExecutionThread: PostExecutionThread,
                          private val homeRepository: HomeRepository) : SingleUseCase<Boolean, Home>(
        useCaseExecutor, postExecutionThread) {
    override fun interact(home: Home?): Single<Boolean> = homeRepository.saveHome(home)


}