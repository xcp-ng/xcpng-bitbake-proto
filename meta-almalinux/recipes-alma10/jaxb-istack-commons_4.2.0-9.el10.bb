
PN = "jaxb-istack-commons"
PE = "0"
PV = "4.2.0"
PR = "9.el10"
PACKAGES = "jaxb-istack-commons-runtime jaxb-istack-commons-tools jaxb-istack-commons-maven-plugin jaxb-istack-commons-test"


URI_jaxb-istack-commons-runtime = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jaxb-istack-commons-runtime-4.2.0-9.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-istack-commons-runtime = "
 javapackages-filesystem
"

URI_jaxb-istack-commons-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jaxb-istack-commons-tools-4.2.0-9.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-istack-commons-tools = "
 javapackages-filesystem
"

URI_jaxb-istack-commons-maven-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jaxb-istack-commons-maven-plugin-4.2.0-9.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-istack-commons-maven-plugin = "
 jaxb-codemodel
 maven-resolver
 junit
 javapackages-filesystem
"

URI_jaxb-istack-commons-test = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jaxb-istack-commons-test-4.2.0-9.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-istack-commons-test = "
 junit
 javapackages-filesystem
"
