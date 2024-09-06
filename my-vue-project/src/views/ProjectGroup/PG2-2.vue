<template>
    <div v-for="(process, index) in processes1" :key="index">
        <PGC9 :formArray="process" :head="head" :isShowButton="!getIsReadOnly1(process)"
            :isReadOnly2="getIsReadOnly1(process)" :buttonAction="'修改'" :requestUrl="getRequestUrl1(process)"
            :requestType="'put'" />
    </div>
    <div v-for="(process, index) in processes2" :key="index">
        <PGC9 :formArray="process" :head="head2" :isShowButton="!getIsReadOnly2(process)"
            :isReadOnly2="getIsReadOnly2(process)" :buttonAction="'修改'" :requestUrl="getRequestUrl2(process)"
            :requestType="'put'" />
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
            head: "项目状态",
            head2: "工序状态",
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
                    projectStatus: "项目状态",
                    failReason: "失败原因",

                },
                process2: {
                    processId: "工序编号",
                    processName: "工序名称",
                    processDescription: "工序概述",
                    status: "状态",
                    failReason: "失败原因",
                    projectId: "所属项目编号",
                    projectName: "所属项目名称",
                    projectDescription: "所属项目概述",

                }
            };
            let statusi = 0;
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
                    if (key === 'status' || key === 'projectStatus') {
                        if (value == 0) {
                            statusi = 0;
                            value = '待定';
                        } else if (value == 1) {
                            statusi = 1;
                            value = '已通过';
                        } else if (value == 2) {
                            statusi = 2;
                            value = '未通过';

                        }
                    } else if (key === 'failReason' || key === 'finalSuggestion') {
                        if (statusi == 0 || statusi == 1) {
                            return null;
                        }
                    }


                    return {
                        label: labels[type][key],
                        name: key,
                        value: value,
                        type: this.getFieldType(key),

                    };
                }).filter(item => item !== null);
            });
        },
        getFieldType(key) {
            const typeMapping = {
                projectId: "number",
                projectStatus: "text",
                processId: "number",
                status: "text",
                documentPath: "text",
                projectName: "text",
                projectDescription: "textarea",
                processName: "text",
                processDescription: "textarea",
                failReason: "text",

            };
            return typeMapping[key] || "text";
        },
        getIsReadOnly1(process) {

            let var1 = process.find(item => item.name == 'projectStatus');
            let value = var1.value;
            if (value === '未通过') {
                return false;
            } else {
                console.log(value);
                return true;
            }

        },
        getIsReadOnly2(process) {

            let var1 = process.find(item => item.name == 'status');
            let value = var1.value;

            if (value === '未通过') {
                return false;
            } else {
                console.log(value);
                return true;
            }
        },
        getRequestUrl1(process) {
            let id = process.find(item => item.name === 'projectId');

            return '/project/dto/ ' + id.value;
        },
        getRequestUrl2(process) {
            let id = process.find(item => item.name === 'processId');

            return '/process/dto/' + id.value;
        }

    }
};
</script>
<style scoped>
/* 引入的样式文件 */
@import '@/assets/css/bootstrap.min.css';
@import '@/assets/css/style.css';
</style>