# IDEA LiveTemplate
    pi
    private int
    private int $VAR$;

    pic
    private int 带有注释
    /**
    * $VAR1$
    */
    private int $VAR1$;

    ps
    private String
    private String $VAR$;

    psc
    private String 带有注释
    /**
    *$VAR1$
    */
    private String $VAR2$;


# Class Template
    #if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
    #parse("File Header.java")
    /**
    * @author  ${USER}
    * @create ${YEAR}-${MONTH}-${DAY} ${TIME}
    * @desc      ${DESCRIPTION}
    **/
    public class ${NAME} {
    }
