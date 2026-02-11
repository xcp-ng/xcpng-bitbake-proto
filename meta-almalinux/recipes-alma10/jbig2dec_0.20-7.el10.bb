
PN = "jbig2dec"
PE = "0"
PV = "0.20"
PR = "7.el10"
PACKAGES = "jbig2dec-libs jbig2dec-devel jbig2dec"


URI_jbig2dec-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jbig2dec-libs-0.20-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jbig2dec-libs = " \
 glibc \
"

URI_jbig2dec-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jbig2dec-devel-0.20-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jbig2dec-devel = " \
 jbig2dec-libs \
 pkgconf-pkg-config \
"

URI_jbig2dec = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jbig2dec-0.20-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jbig2dec = " \
 glibc \
 jbig2dec-libs \
 libpng \
"
