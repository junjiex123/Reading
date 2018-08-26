package com.hankkin.reading.ui.todo

import com.hankkin.library.mvp.contract.IBaseViewContract
import com.hankkin.library.mvp.contract.IPresenterContract
import com.hankkin.reading.domain.ToDoBean

/**
 * @author Hankkin
 * @date 2018/8/26
 */
interface ToDoContract{

    interface IView : IBaseViewContract{
        fun setListDone(data: ToDoBean)
    }

    interface IPresenter : IPresenterContract{
        fun getListDone(cate: Int,page: Int)
    }

}