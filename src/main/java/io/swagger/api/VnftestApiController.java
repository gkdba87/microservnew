package io.swagger.api;

import io.swagger.model.BaseResponse;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-17T09:54:53.198Z")

@Controller
public class VnftestApiController implements VnftestApi {

    public ResponseEntity<BaseResponse> vnftestPost(@ApiParam(value = "Execution jenkins job id") @RequestParam(value = "uid", required = false) String uid) {
        // do some magic!
        return new ResponseEntity<BaseResponse>(HttpStatus.OK);
    }

}
