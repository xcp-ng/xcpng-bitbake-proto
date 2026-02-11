
inherit dnf-bridge

PN = "cppunit"
PE = "0"
PV = "1.15.1"
PR = "23.el10"
PACKAGES = "cppunit cppunit-devel cppunit-doc"


URI_cppunit = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cppunit-1.15.1-23.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cppunit = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_cppunit-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cppunit-devel-1.15.1-23.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cppunit-devel = " \
 cppunit \
 pkgconf-pkg-config \
"

URI_cppunit-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cppunit-doc-1.15.1-23.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cppunit-doc = ""
