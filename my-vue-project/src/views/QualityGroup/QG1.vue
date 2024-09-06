<template>
    <div v-for="(process, index) in processes1" :key="index">
        <PGC9 :formArray="process" :head="head" :isShowButton="true" :requestUrl="getRequestUrl1(process)"
            :requestType="'put'" :buttonAction="'提交'" />
    </div>
    <div v-for="(process, index) in processes2" :key="index">
        <PGC9 :formArray="process" :head="head2" :isShowButton="true" :requestUrl="getRequestUrl2(process)"
            :requestType="'put'" :buttonAction="'提交'" />
    </div>
</template>


<script>
import axios from 'axios';
import PGC9 from '@/components/ProjectGroup/PGC9.vue';


export default {
    components: {
        PGC9
    },
    data() {
        return {
            head: "项目",
            head2: "工序",
            url: "/project",
            url2: "/process",
            processes1: [],
            processes2: []
        };
    },
    mounted() {
        this.fetchProcesses1();
        this.fetchProcesses2();
    },
    methods: {
        async fetchProcesses1() {
            try {
                const response = await axios.get(this.url);
                this.processes1 = this.transformData(response.data, 'process1');
            } catch (error) {
                console.error("Error fetching processes1:", error);
            }
        },
        async fetchProcesses2() {
            try {
                const response = await axios.get(this.url2);
                this.processes2 = this.transformData(response.data, 'process2');
            } catch (error) {
                console.error("Error fetching processes2:", error);
            }
        },
        transformData(data, type) {
            const labels = {
                process1: {
                    projectId: "项目编号",
                    projectName: "项目名称",
                    projectDescription: "项目概述",
                    startDate: "开工时间",
                    estimatedCompletionDate: "预计完成时间",
                    coverageArea: "工程覆盖地区范围",
                    projectStatus: "项目状态",
                    failReason: "失败原因(如有)",

                },
                process2: {
                    processId: "工序编号",
                    processName: "工序名称",
                    processDescription: "工序概述",
                    status: "状态",
                    failReason: "失败原因(如有)",
                    documentPath: "上传证明文件",
                    projectId: "项目编号",
                    projectName: "项目名称",
                    projectDescription: "项目概述",
                    startDate: "开工时间",
                    estimatedCompletionDate: "预计完成时间",
                    coverageArea: "工程覆盖地区范围"
                }
            };

            return data.map(item => {
                return Object.keys(item).map(key => {
                    let vari = labels[type][key];
                    if (vari === undefined) {
                        console.log(vari);
                        return null;
                    }
                    let value = item[key];

                    let isReadOnly = true;
                    if (key === 'documentPath' && value) {
                        value = value.split('\\').pop(); // 处理文件路径，只保留文件名
                    }
                    if (key == 'projectStatus' || key == 'failReason' || key == 'status') {
                        isReadOnly = false;
                    }

                    return {
                        label: labels[type][key] || key,
                        name: key,
                        value: value,
                        type: this.getFieldType(key),
                        isReadOnly: isReadOnly

                    };
                }).filter(item => {
                    return item !== null;
                });
            });
        },
        getFieldType(key) {
            const typeMapping = {
                projectId: "number",
                projectStatus: "number",
                processId: "number",
                status: "number",
                startDate: "date",
                estimatedCompletionDate: "date",
                documentPath: "text",
                projectName: "text",
                projectDescription: "textarea",
                coverageArea: "textarea",
                processName: "text",
                processDescription: "textarea",
                responsiblePerson: "text",
                failReason: "text",
                finalSuggestion: "text"
            };
            return typeMapping[key] || "text";
        },
        getRequestUrl1(process) {
            const projectId = process.find(field => field.name === 'projectId').value;
            return `/project/${projectId}`;
        },
        getRequestUrl2(process) {
            const processId = process.find(field => field.name === 'processId').value;
            return `/process/${processId}`;
        }
    }
};
</script>
<style scoped>
/* 引入的样式文件 */
@import '@/assets/css/bootstrap.min.css';
@import '@/assets/css/style.css';
</style>