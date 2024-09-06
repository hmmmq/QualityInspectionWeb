<template>
    
    <!-- Main container -->
    <div class="page-container">
        <!-- bloc-2 -->
        <div class="bloc l-bloc" id="bloc-2">
            <div class="container bloc-lg">
                <div class="row">
                    <div class="col">
                        <div class="row">
                            <div class="col">
                                <h1 class="mg-md">
                                    项目质量管理
                                </h1>
                            </div>
                        </div>
                        <template v-for="(item, index) in itemList1" :key="index">
                        <nav class="navbar navbar-light row navbar-expand-md">
                        <a class="navbar-brand" :href="item.href">{{ item.title }}</a>
                         <button
                        id="nav-toggle"
                        type="button"
                        class="ui-navbar-toggler navbar-toggler border-0 p-0 mr-md-0 ml-auto"
                        data-toggle="collapse"
                        data-target=".navbar-24991"
                        aria-expanded="false"
                        aria-label="Toggle navigation"
                        >
                        <span class="navbar-toggler-icon"></span>
                      </button>
                      <div class="collapse navbar-collapse navbar-24991">
                        <ul class="site-navigation nav navbar-nav ml-auto">
                          <li class="nav-item">
                            <a :href="item.href" class="nav-link">进入<br /></a>
                          </li>
                        </ul>
                      </div>
                    </nav>
                  </template>
                    </div>
                </div>
            </div>
        </div>
        <!-- bloc-2 END -->
        
        <!-- ScrollToTop Button -->
        <a class="bloc-button btn btn-d scrollToTop" onclick="scrollToTarget('1',this)"><svg xmlns="http://www.w3.org/2000/svg" width="22" height="22" viewBox="0 0 32 32"><path class="scroll-to-top-btn-icon" d="M30,22.656l-14-13-14,13"/></svg></a>
        <!-- ScrollToTop Button END-->
        
        
        </div>
        <!-- Main container END -->
            
    </template>
      
    <script>
    export default {
      data() {
        return {
          itemList1: [
            { title: "优秀样板引路", href: "/PG3_1" },
            { title: "记录质量“三检制”情况", href: "/PG3_2" },
            { title: "提交关键工序识别清单", href: "/PG3_3" },
            { title: "发布质量管理例会信息", href: "/PG3_4" },
            { title: "提交质量管理相关施工过程资料", href: "/PG3_5" },
            { title: "动态更新工程质量责任追溯档案", href: "/PG3_6" },
            { title: "定期上报工程质量情况表", href: "/PG3_7" },
            { title: "记录质量回访情况", href: "/PG3_8" },
            { title: "填写年度创优规划和创优推进情况", href: "/PG3_9" }
          ]
        };
      },
    };
    </script>
      
    <style scoped>
    /* 引入的样式文件 */
    @import "@/assets/css/bootstrap.min.css";
    @import "@/assets/css/style.css";
    </style>
    