<template>
    <div v-for="(process, index) in processes2" :key="index">
        <PGC9 :formArray="process" :head="head2" :isShowButton="true" :isReadonly="false" :buttonAction="'提交'"
            :requestUrl="getRequestUrl(process)" requestType="put" />
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

            head2: "工序",

            url2: "/process",

            processes2: []
        };
    },
    mounted() {

        this.fetchProcesses2();
    },
    methods: {

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

                process2: {
                    processId: "工序编号",
                    processName: "工序名称",
                    processDescription: "工序概述",
                    responsiblePerson: "负责人",
                    projectId: "所属项目编号",
                    projectName: "所属项目名称",
                    projectDescription: "所属项目概述",
                }
            };


            return data.map(item => {
                return Object.keys(item).map(key => {
                    let isreadonly = true;
                    let vari = labels[type][key];
                    if (vari === undefined) {
                        console.log(vari);
                        return null;
                    }
                    let value = item[key];

                    if (key === 'responsiblePerson') {
                        isreadonly = false;
                        if (value == null) {
                            value = '待定';
                        }
                    }

                    return {
                        label: labels[type][key] || key,
                        name: key,
                        value: value,
                        type: this.getFieldType(key),
                        isReadOnly: isreadonly
                    };
                }).filter(item => {
                    return item !== null;
                });
            });
        },
        getFieldType(key) {
            const typeMapping = {
                projectId: "number",
                projectStatus: "text",
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
        getRequestUrl(process) {
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