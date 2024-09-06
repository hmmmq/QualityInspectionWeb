<template>
    <PGC6 :formArray="formArray" :url="url" :head="head" :isShowButton="false" />
    <div class="col-lg-6 offset-lg-3 offset-md-2 col-md-8">
        <div class="form-group">
            <label class="mg-md h3-style">工序</label>
            <button @click="addProcess" class="btn btn-d btn-lg btn-button-style btn-rd">+</button>
            <div class="form-group">
                <label>申请条件</label>
                <p>一：施工合同已签订、开工报告已办理</p>
                <p>二：设计文件、施工图纸能满足开工需要</p>
                <p>三：施工调查及复测工作已完成</p>
                <p>四：图纸会审、技术交底工作按规定进行，特殊作业、关键工序要有作业指导书</p>
                <p>五：实施性施工组织设计已编制、审批</p>
                <p>六：采用的新技术、机具设备、原材料符合要求，并能满足施工需要</p>
                <p>七：施工人员、质量管理人员、机具设备、原材料能满足工程质量要求</p>
                <p>八：已建立有效的项目质量管理保证体系</p>
                <p>九：工地试验室满足工程需要，符合建筑工企业试验室管理的有关规定及相关行业要求，并取得相应资质等级</p>
            </div>
        </div>
    </div>
    <div v-for="(process, index) in processes" :key="index">
        <PGC6 :formArray="process" :head="head2" :url="url2" :isShowButton="getIsShowButton(process)" :buttonAction="getButtonAction(process)" />
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
                { label: "关键工序识别清单", value: "", type: "file", isReadOnly: false }
            ],

            processes: [
                [
                    { label: "工序名称", value: "wefwferwf", type: "text" , isReadOnly: true},
                    { label: "工序概述", value: "qwefewfwe", type: "textarea" , isReadOnly: true},
                    { label: "证明文件", value: "", type: "file" , isReadOnly: true},
                    { label: "状态", value: "通过", type: "text", isReadOnly: true },
                    { label: "工序负责人", value: "小明", type: "text", isReadOnly: true },
                    { label: "关键工序识别清单", value: "", type: "file", isReadOnly: false }

                ],
                [
                    { label: "工序名称", value: "wefwerfwefwf", type: "text" },
                    { label: "工序概述", value: "wefwwefweqef", type: "textarea" },
                    { label: "证明文件", value: "", type: "file" },
                    { label: "状态", value: "不通过", type: "text", isReadOnly: true },
                    { label: "原因", value: "adcbwueidhqw", type: "text", isReadOnly: true },
                    { label: "工序负责人", value: "待定", type: "text", isReadOnly: true },
                    { label: "关键工序识别清单", value: "", type: "file", isReadOnly: false }

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