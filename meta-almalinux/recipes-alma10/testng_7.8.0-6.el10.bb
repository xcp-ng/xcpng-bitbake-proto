
inherit dnf-bridge

PN = "testng"
PE = "0"
PV = "7.8.0"
PR = "6.el10"
PACKAGES = "testng testng-javadoc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/testng-7.8.0-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_testng = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/testng-7.8.0-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_testng}"
RDEPENDS:testng = " \
 beust-jcommander \
 javapackages-filesystem \
 slf4j \
"

URI_testng-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/testng-javadoc-7.8.0-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_testng-javadoc}"
RDEPENDS:testng-javadoc = " \
 javapackages-filesystem \
"
