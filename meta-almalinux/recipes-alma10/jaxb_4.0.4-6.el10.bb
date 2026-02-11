
PN = "jaxb"
PE = "0"
PV = "4.0.4"
PR = "6.el10"
PACKAGES = "jaxb-codemodel jaxb-core jaxb-relaxng-datatype jaxb-rngom jaxb-runtime jaxb-txw2 jaxb-xjc jaxb-xsom jaxb-codemodel-annotation-compiler jaxb-txwc2"


URI_jaxb-codemodel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jaxb-codemodel-4.0.4-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-codemodel = "
 javapackages-filesystem
"

URI_jaxb-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jaxb-core-4.0.4-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-core = "
 jakarta-activation
 javapackages-filesystem
 jaxb-api
 jaxb-istack-commons-runtime
 jaxb-txw2
"

URI_jaxb-relaxng-datatype = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jaxb-relaxng-datatype-4.0.4-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-relaxng-datatype = "
 javapackages-filesystem
"

URI_jaxb-rngom = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jaxb-rngom-4.0.4-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-rngom = "
 javapackages-filesystem
 jaxb-relaxng-datatype
"

URI_jaxb-runtime = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jaxb-runtime-4.0.4-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-runtime = "
 jaxb-core
 javapackages-filesystem
"

URI_jaxb-txw2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jaxb-txw2-4.0.4-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-txw2 = "
 javapackages-filesystem
"

URI_jaxb-xjc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jaxb-xjc-4.0.4-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-xjc = "
 javapackages-filesystem
 jaxb-codemodel
 jaxb-core
 jaxb-dtd-parser
 jaxb-istack-commons-tools
 jaxb-rngom
 jaxb-xsom
"

URI_jaxb-xsom = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jaxb-xsom-4.0.4-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-xsom = "
 javapackages-filesystem
 jaxb-relaxng-datatype
"

URI_jaxb-codemodel-annotation-compiler = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jaxb-codemodel-annotation-compiler-4.0.4-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-codemodel-annotation-compiler = "
 jaxb-codemodel
 javapackages-filesystem
"

URI_jaxb-txwc2 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jaxb-txwc2-4.0.4-6.el10.noarch.rpm;unpack=0"
RDEPENDS:jaxb-txwc2 = "
 javapackages-filesystem
 jaxb-codemodel
 jaxb-rngom
 jaxb-txw2
 jaxb-xsom
"
