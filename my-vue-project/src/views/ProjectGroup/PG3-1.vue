<template>
    <div class="row">
        <div class="col-lg-6 offset-lg-3 offset-md-2 col-md-8">
            <br>
            <a href="#" v-show="show" class="btn btn-d btn-lg float-lg-right" @click="addForm">新建页</a>
            <a href="#" v-show="!show" class="btn btn-d btn-lg float-lg-right" @click="returnBack">返回</a>
        </div>
    </div>
    <div v-show="show">
        <PGC6 :formArray="formArray1" :head="'优秀样板引路'" :isShowButton="false" />
        <PGC6 :formArray="formArray2" :head="'重点模块展示'" :isShowButton="false" />
        <div class="row">
            <div class="col-lg-4 offset-lg-4 offset-md-2 col-md-8">
                <pagination v-show="show" :currentPage="currentPage" :totalPages="totalPages"
                    @update:currentPage="currentPage = $event" />
            </div>
        </div>
        <br>
    </div>
    <div v-show="!show">
        <PGC6 :formArray="formArray3" :head="'优秀样板引路'" />
        <PGC6 :formArray="formArray4" :head="'重点模块展示'" />
    </div>
</template>

<script>
import PGC6 from '@/components/ProjectGroup/PGC6.vue';
import Pagination from '@/components/ProjectGroup/PGC4.vue';

export default {
    components: {
        PGC6,
        Pagination
    },
    data() {
        return {
            formArray1: [
                { label: '样板名称', value: 'sdvdvwrgfwe', type: 'text', isReadOnly: true },
                { label: '实施部位', value: 'wefwesdfsde', type: 'text', isReadOnly: true },
                { label: '计划时间', value: '2024/09/01', type: 'text', isReadOnly: true },
                { label: '样板验收负责人', value: 'wefdewf', type: 'text', isReadOnly: true },
                { label: '样板实施负责人', value: 'wefwef', type: 'text', isReadOnly: true },
                { label: '样板展示主要内容', value: 'QWefewqf', type: 'text', isReadOnly: true }
            ],
            formArray2: [
                { label: '主体结构 ', value: '', type: 'file', isReadOnly: true },
                { label: '二次结构    ', value: '', type: 'file', isReadOnly: true },
                { label: '屋面', value: '', type: 'file', isReadOnly: true },
                { label: '外墙', value: '', type: 'file', isReadOnly: true },
                { label: '卫生间', value: '', type: 'file', isReadOnly: true },
                { label: '管井', value: '', type: 'file', isReadOnly: true },
                { label: '电井', value: '', type: 'file', isReadOnly: true },
                { label: '机房', value: '', type: 'file', isReadOnly: true },
                { label: '样板层', value: '', type: 'file', isReadOnly: true },
                { label: '材料样板', value: '', type: 'file', isReadOnly: true }
            ],
            formArray3: [
                { label: '样板名称', value: '', type: 'text' },
                { label: '实施部位', value: '', type: 'text' },
                { label: '计划时间', value: '', type: 'date' },
                { label: '样板验收负责人', value: '', type: 'text' },
                { label: '样板实施负责人', value: '', type: 'text' },
                { label: '样板展示主要内容', value: '', type: 'text' }
            ],
            formArray4: [
                { label: '主体结构 ', value: '', type: 'file' },
                { label: '二次结构    ', value: '', type: 'file' },
                { label: '屋面', value: '', type: 'file' },
                { label: '外墙', value: '', type: 'file' },
                { label: '卫生间', value: '', type: 'file' },
                { label: '管井', value: '', type: 'file' },
                { label: '电井', value: '', type: 'file' },
                { label: '机房', value: '', type: 'file' },
                { label: '样板层', value: '', type: 'file' },
                { label: '材料样板', value: '', type: 'file' }
            ],
            show: true,
            currentPage: 1,  // 当前页码，初始为1
            totalPages: 38  // 总页数，从数据库中获取并更新
        };
    },
    methods: {
        returnBack() {
            this.show = true;
        },
        addForm() {
            this.show = false;
        }

    }
}
</script>

<style scoped>
/* 引入的样式文件 */
@import "@/assets/css/bootstrap.min.css";
@import "@/assets/css/style.css";
</style>