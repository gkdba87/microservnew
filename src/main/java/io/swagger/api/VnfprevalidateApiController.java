package io.swagger.api;

import io.swagger.model.BuildInfo;

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
public class VnfprevalidateApiController implements VnfprevalidateApi {

    public ResponseEntity<BuildInfo> vnfprevalidatePost(@ApiParam(value = "Execution jenkins job id12", required = true) @RequestParam(value = "uid", required = true) String uid) {
        // do some magic!
        return new ResponseEntity<BuildInfo>(HttpStatus.OK);
    }

}
