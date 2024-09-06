<template>
    <div class="row">
        <div class="col-lg-6 offset-lg-3 offset-md-2 col-md-8">
            <br>
            <h1>填写年度创优规划和创优推进情况</h1>
        </div>
    </div>
    <PGC6 :formArray="formArray1" :url="url" :head="head1" />
    <PGC6 :formArray="formArray2" :url="url" :head="head2" />
</template>

<script>
import PGC6 from '@/components/ProjectGroup/PGC6.vue';
export default {
    components: {
        PGC6
    },
    data() {
        return {
            head1: "一、年度创优：年度",
            head2: "二、创优推进情况",
            url: "#",
            formArray1: [
                { label: "创优阶段性计划名称", value: "fwefwe", type: "text" },
                { label: "时间段", value: "", type: "text" },
                { label: "计划概述", value: "", type: "text" },
                { label: "达成目标", value: "", type: "text" },
            ],
            formArray2: [
                { label: "当前项目概况", value: "fwefwe", type: "text" },
                { label: "当前创优目标", value: "", type: "text" },
                { label: "当前节点计划", value: "", type: "text" },
                { label: "推进及完成情况", value: "", type: "text" },
                { label: "推进存在问题", value: "", type: "text" },
                { label: "下一步计划", value: "", type: "text" },
                { label: "其它", value: "", type: "text" },

            ]
        };
    }
};
</script>

<style scoped>
/* 引入的样式文件 */
@import '@/assets/css/bootstrap.min.css';
@import '@/assets/css/style.css';
</style>