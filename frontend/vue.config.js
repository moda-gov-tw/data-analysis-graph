const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true
})
module.exports = {
  outputDir: '../backend/src/main/resources/static',  // 指定打包輸出的目錄，與 Spring Boot 靜態資源目錄對應
  publicPath: '/'
};
