
inherit dnf-bridge

PN = "classloader-leak-test-framework"
PE = "0"
PV = "2.7.0"
PR = "10.el10"
PACKAGES = "classloader-leak-test-framework classloader-leak-test-framework-javadoc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/classloader-leak-test-framework-2.7.0-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_classloader-leak-test-framework = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/classloader-leak-test-framework-2.7.0-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_classloader-leak-test-framework}"
RDEPENDS:classloader-leak-test-framework = " \
 bcel \
 junit \
 javapackages-filesystem \
"

URI_classloader-leak-test-framework-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/classloader-leak-test-framework-javadoc-2.7.0-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_classloader-leak-test-framework-javadoc}"
RDEPENDS:classloader-leak-test-framework-javadoc = " \
 javapackages-filesystem \
"
