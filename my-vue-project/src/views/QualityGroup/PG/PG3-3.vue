<template>
    <PGC6 :formArray="formArray" :url="url" :head="head" :isShowButton="false" />
    <div v-for="(process, index) in processes" :key="index">
        <PGC6 :formArray="process" :head="head2" :url="url2" :isShowButton="false" />
    </div>
</template>

<script>

import PGC6 from '@/components/ProjectGroup/PGC6.vue';
export default {
    components: {
        PGC6
    },
    data() {
        return {
            head: "提交关键工序识别清单",
            head2: "工序",
            buttonAction: "修改",
            url: "#",
            url2: "#",
            formArray: [
                { label: "项目名称", value: "asdvwrefewf", type: "text", isReadOnly: true },
                { label: "项目概述", value: "waefwefwe", type: "textarea", isReadOnly: true },
                { label: "开工时间", value: "2024/09/01", type: "text", isReadOnly: true },
                { label: "预计完成时间", value: "2025/09/01", type: "text", isReadOnly: true },
                { label: "工程覆盖地区范围", value: "wefwe43fweg", type: "textarea", isReadOnly: true },
            ],

            formArray2: [
                { label: "工序名称", value: "", type: "text" },
                { label: "工序概述", value: "", type: "textarea" },
                { label: "上传证明文件", value: "", type: "file" },
                { label: "状态", value: "待定", type: "text", isReadOnly: true },
                { label: "工序负责人", value: "待定", type: "text", isReadOnly: true },
                { label: "关键工序识别清单", value: "", type: "file", isReadOnly: true }
            ],

            processes: [
                [
                    { label: "工序名称", value: "wefwferwf", type: "text", isReadOnly: true },
                    { label: "工序概述", value: "qwefewfwe", type: "textarea", isReadOnly: true },
                    { label: "证明文件", value: "", type: "file", isReadOnly: true },
                    { label: "状态", value: "通过", type: "text", isReadOnly: true },
                    { label: "工序负责人", value: "小明", type: "text", isReadOnly: true },
                    { label: "关键工序识别清单", value: "", type: "file", isReadOnly: true }

                ],
                [
                    { label: "工序名称", value: "wefwerfwefwf", type: "text" },
                    { label: "工序概述", value: "wefwwefweqef", type: "textarea" },
                    { label: "证明文件", value: "", type: "file" },
                    { label: "状态", value: "不通过", type: "text", isReadOnly: true },
                    { label: "原因", value: "adcbwueidhqw", type: "text", isReadOnly: true },
                    { label: "工序负责人", value: "待定", type: "text", isReadOnly: true },
                    { label: "关键工序识别清单", value: "", type: "file", isReadOnly: true }

                ]
            ]
        };
    },
    methods: {

        getButtonAction(process) {
            const statusItem = process[3].label === "状态";
            if (statusItem && process[3].value === "不通过") {
                return "修改";
            } else if (statusItem && process[3].value === "通过") {
                return null; // 或者返回空字符串，这样按钮不会显示
            } else {
                return "保存";
            }
        },
        getIsShowButton(process) {
            const statusItem = process[3].label === "状态";
            return statusItem && process[3].value !== "通过";
        },


        scrollToTop() {
            window.scrollTo({ top: 0, behavior: 'smooth' });
        },
        addProcess() {
            // 添加新工序逻辑
            this.processes.push(this.formArray2);
            console.log('Add process');
        }
    }
};
</script>

<style scoped>
/* 引入的样式文件 */
@import '@/assets/css/bootstrap.min.css';
@import '@/assets/css/style.css';
</style>