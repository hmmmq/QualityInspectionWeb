<template>
    <div v-for="(process, index) in processes1" :key="index">
        <PGC9 :formArray="process" :head="head" :isShowButton="true" :buttonAction="'提交'"
            :requestUrl="getRequestUrl(process)" :requestType="'put'" />
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

            url: "/project",

            processes1: [],

        };
    },
    mounted() {
        this.fetchProcesses1();

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

        transformData(data, type) {
            const labels = {
                process1: {
                    projectId: "项目编号",
                    projectName: "项目名称",
                    projectDescription: "项目概述",
                    finalSuggestion: "最终建议"
                },

            };

            return data.map(item => {
                return Object.keys(item).map(key => {
                    let vari = labels[type][key];
                    if (vari === undefined) {
                        console.log(vari);
                        return null;
                    }
                    let value = item[key];
                    if (key === 'documentPath' && value) {
                        value = value.split('\\').pop(); // 处理文件路径，只保留文件名
                    }
                    let isreadonly = true;
                    if (key == 'finalSuggestion') {
                        isreadonly = false;
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
                status: "text",
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
            let id = process.find(item => item.name === 'projectId').value;
            return `/project/${id}`;

        }
    }
};
</script>
<style scoped>
/* 引入的样式文件 */
@import '@/assets/css/bootstrap.min.css';
@import '@/assets/css/style.css';
</style>