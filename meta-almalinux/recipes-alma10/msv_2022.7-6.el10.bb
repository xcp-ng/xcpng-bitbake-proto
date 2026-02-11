
PN = "msv"
PE = "0"
PV = "2022.7"
PR = "6.el10"
PACKAGES = "msv-javadoc msv-xsdlib"


URI_msv-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/msv-javadoc-2022.7-6.el10.noarch.rpm;unpack=0"
RDEPENDS:msv-javadoc = "
 javapackages-filesystem
"

URI_msv-xsdlib = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/msv-xsdlib-2022.7-6.el10.noarch.rpm;unpack=0"
RDEPENDS:msv-xsdlib = "
 relaxng-datatype-java
 javapackages-filesystem
"
