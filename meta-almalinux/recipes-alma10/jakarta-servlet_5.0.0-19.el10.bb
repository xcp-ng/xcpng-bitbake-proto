
inherit dnf-bridge

PN = "jakarta-servlet"
PE = "0"
PV = "5.0.0"
PR = "19.el10"
PACKAGES = "jakarta-servlet jakarta-servlet-javadoc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/jakarta-servlet-5.0.0-19.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_jakarta-servlet = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jakarta-servlet-5.0.0-19.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jakarta-servlet}"
RDEPENDS:jakarta-servlet = " \
 javapackages-filesystem \
"

URI_jakarta-servlet-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jakarta-servlet-javadoc-5.0.0-19.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jakarta-servlet-javadoc}"
RDEPENDS:jakarta-servlet-javadoc = " \
 javapackages-filesystem \
"
