package com.dlzx.system.controller;

import com.dlzx.common.core.web.domain.AjaxResult;
import com.dlzx.common.minio.service.MinioService;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 文件控制接口
 *
 * @author dlzx
 */
@RestController
@RequestMapping("/miniofile")
public class SysMinioController {
    @Autowired
    private MinioService minioService;

    /**
     * 桶名
     */
    @Value("${minio.bucketNameImage}")
    private String bucketNameImage;



    /**
     * minio创建文件桶
     *
     */
    @PostMapping("/makeBucket")
    @ApiOperation(value="mini创建桶")
    public AjaxResult minioUpload(String bucketName){
        try{
            boolean flag = minioService.bucketExists(bucketName);
            if(!flag){
                return AjaxResult.error("bucket已存在");
            }
            return AjaxResult.success( minioService.makeBucket(bucketName));
        }catch (Exception e){
            return AjaxResult.error(e.getMessage());
        }
    }
    /**
     * minio上传文件
     *
     */
    @PostMapping("/minioUpload")
    @ApiOperation(value="minio上传文件")
    public AjaxResult minioUpload(MultipartFile file){
        try{
            minioService.putObject(bucketNameImage,file,file.getOriginalFilename());
            return AjaxResult.success();
        }catch (Exception e){
            System.out.println(e);
        }
        return AjaxResult.error();
    }
    /**
     * minio上传文件
     *
     */
    @PostMapping("/minioChooseBucketUpload")
    @ApiOperation(value="minio选择桶上传文件")
    public AjaxResult minioChooseBucketUpload(String bucket,MultipartFile file){
        try{
            boolean flag = minioService.bucketExists(bucket);
            if(!flag) {
                return AjaxResult.error("该文件桶不存在，请先创建bucket");
            }
            minioService.putObject(bucket,file,file.getOriginalFilename());
            return AjaxResult.success();
        }catch (Exception e){
            System.out.println(e);
        }
        return AjaxResult.error();
    }
    /**
     * minio下载文件
     *
     */
    @GetMapping("/minioDownload")
    @ApiOperation(value="minio下载文件")
    public void minioDownload(String filename,String originalName,HttpServletResponse response){
        minioService.downloadFile(bucketNameImage,filename,originalName,response);
    }

    /**
     * minio下载文件
     *
     */
    @GetMapping("/minioChooseBucketDownload")
    @ApiOperation(value="minio选择桶下载文件")
    public void minioChooseBucketDownload(String bucket,String filename,String originalName,HttpServletResponse response){
        minioService.downloadFile(bucket,filename,originalName,response);
    }

    @GetMapping(value = "minio/view/**")
    public void minioView(HttpServletRequest request, HttpServletResponse response) {
        // ISO-8859-1 ==> UTF-8 进行编码转换
        String imgPath = extractPathFromPattern(request);
        // 其余处理略
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            String bucketName = "";
            String fileName = "";
            response.setContentType("image/jpeg;charset=utf-8");
            if (StringUtils.isNotEmpty(imgPath)){
                String[] split = imgPath.split("/");
                bucketName = split[0];
                fileName = split[1];
            }
            inputStream =minioService.getObject(bucketName,fileName);
            outputStream = response.getOutputStream();
            byte[] buf = new byte[1024];
            int len;
            while ((len = inputStream.read(buf)) > 0) {
                outputStream.write(buf, 0, len);
            }
            response.flushBuffer();
        } catch (IOException e) {
            AjaxResult.error("预览图片失败" + e.getMessage());
            // e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    AjaxResult.error(e.getMessage(), e);
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    AjaxResult.error(e.getMessage(), e);
                }
            }
        }

    }

    /**
     *  把指定URL后的字符串全部截断当成参数
     *  这么做是为了防止URL中包含中文或者特殊字符（/等）时，匹配不了的问题
     * @param request
     * @return
     */
    private static String extractPathFromPattern(final HttpServletRequest request) {
        String path = (String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);
        String bestMatchPattern = (String) request.getAttribute(HandlerMapping.BEST_MATCHING_PATTERN_ATTRIBUTE);
        return new AntPathMatcher().extractPathWithinPattern(bestMatchPattern, path);
    }

}
