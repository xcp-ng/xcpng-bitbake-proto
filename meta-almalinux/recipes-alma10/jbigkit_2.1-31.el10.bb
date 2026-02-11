
PN = "jbigkit"
PE = "0"
PV = "2.1"
PR = "31.el10"
PACKAGES = "jbigkit jbigkit-libs jbigkit-devel"


URI_jbigkit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jbigkit-2.1-31.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jbigkit = " \
 glibc \
 jbigkit-libs \
"

URI_jbigkit-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jbigkit-libs-2.1-31.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jbigkit-libs = " \
 glibc \
"

URI_jbigkit-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jbigkit-devel-2.1-31.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jbigkit-devel = " \
 jbigkit-libs \
"
