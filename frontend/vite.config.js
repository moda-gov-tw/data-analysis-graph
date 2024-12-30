import { defineConfig } from 'vite';
import vue from '@vitejs/plugin-vue';
import path from 'path';

export default defineConfig({
  resolve: {
    alias: {
      '@': path.resolve(__dirname, './src'), // 支持 @ 別名
    },
  },
  plugins: [vue()],
  server: {
    port: 3000, // 開發伺服器埠號
    proxy: {
      '/api': {
        target: 'http://localhost:8080', // 將 API 請求代理到後端
        changeOrigin: true,
        secure: false,
      },
    },
  },
  build: {
    outDir: '../backend/src/main/resources/static', // 指定打包輸出目錄
    emptyOutDir: true, // 每次打包清空目錄
  },
});
